package Spirit;

import org.json.JSONObject;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Spirit_FristCase {

    WebDriver driver;
    @Test
    public void test() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", new JSONObject().put("profile.managed_default_content_settings.geolocation", 2));
        chromeOptions.addArguments("--incognito");
       // chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        chromeOptions.addArguments("--disable-gpu"); // applicable to Windows os only
        chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
    //    chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--start-maximized");
        //capabilities = new DesiredCapabilities(chromeOptions);
        //chromeOptions.merge(capabilities);

        driver = new ChromeDriver(chromeOptions);
        //Maximize the Window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Call the Website URL
        driver.get("https://www.spirit.com/");
       // driver.findElement(By.xpath("//input[@id='dropdown-toggle-controler-toggleId']/../label")).click();

        driver.findElement(By.xpath("//app-home-widget//label[@for='Flight' or @for=' VUELO ']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        Thread.sleep(3000);
        //Trip Option
        WebElement oneway = driver.findElement(By.xpath("//input[@id='dropdown-toggle-controler-toggleId']/../label/div"));
        oneway.click();
        System.out.println("hello");
        List<WebElement> tripDropdown = driver.findElements(By.cssSelector("label[for='oneWay']"));


//input[@id='dropdown-toggle-controler-toggleId']/../div/button/label
//label[normalize-space()='One Way']


        selectedDropDownOption(tripDropdown," One Way ");

        System.out.println("hi");

        driver.findElement(By.xpath("//label[@class='traveler-selection-label']")).click();
    }

    public static void selectedDropDownOption(List<WebElement> dropDownOpt, String OptionToBeSelect){
        for (WebElement opt : dropDownOpt){
            if (opt.getText().equals(OptionToBeSelect)){
                opt.click();
                break;
            }
        }
    }
}
