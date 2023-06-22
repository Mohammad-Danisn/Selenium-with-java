package Sw_Test_Academy;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.ArrayList;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class BrowserMobProxyExample {

    WebDriver             driver;
    BrowserMobProxyServer proxy;
    Proxy                 seleniumProxy;

    @Test
    public void browserMobProxyTest() throws IOException, InterruptedException {

        proxy = new BrowserMobProxyServer();
        proxy.start(8080);
        seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
        //String hostIp = Inet4Address.getLocalHost().getHostAddress();
        String hostIp = "localhost";
        seleniumProxy.setHttpProxy(hostIp + ":" + proxy.getPort());
        seleniumProxy.setSslProxy(hostIp + ":" + proxy.getPort());
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        //System.setProperty("webdriver.chrome.driver", "E:/UdemySeleniumCourse/Software/DriverNotes/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\geckodriver.exe");
       // System.setProperty("webdriver.chrome.whitelistedIps", "");
        DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();
        seleniumCapabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        ArrayList<String> switches = new ArrayList<String>();
        switches.add("--proxy-server=localhost:8080");
        seleniumCapabilities.setCapability("firefox.switches", switches);
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--ignore-urlfetcher-cert-requests");
        options.merge(seleniumCapabilities);
        driver = new ChromeDriver(options);*/
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--ignore-urlfetcher-cert-requests");
        options.merge(seleniumCapabilities);
        driver = new FirefoxDriver(options);


        proxy.newHar("google.com");
        driver.get("https://www.spirit.com");
        Thread.sleep(2000);
        Har har = proxy.getHar();
        File harFile = new File("google.har");
        har.writeTo(harFile);

        proxy.stop();
        driver.quit();
    }

}
