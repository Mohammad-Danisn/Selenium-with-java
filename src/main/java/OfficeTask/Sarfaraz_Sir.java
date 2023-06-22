package OfficeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sarfaraz_Sir {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='showBizUpgradePopup']/following-sibling::li[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        //Thread.sleep(2000);        
        //driver.findElement(By.xpath("//div/label/span[@class='lbl_input latoBold  appendBottom5' and text()='From']")).click();

        WebElement from=driver.findElement(By.xpath("//div/label/span[@class='lbl_input latoBold  appendBottom5' and text()='From']"));
        from.click();
        List<WebElement> ls=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul//li//p[contains(@class,'black')]"));
        dropdown(ls,"Mumbai, India");
    }
    public static void dropdown(List<WebElement> dropdown1, String Options_to_select) {
        for (WebElement options : dropdown1) {
            if (options.equals(Options_to_select)) {
                options.click();
                break;
            }
        }
    }
}
