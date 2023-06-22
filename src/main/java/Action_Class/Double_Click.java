package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

    public static void main(String[] args) {

        //Lounch Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maxmizes the browser
        driver.manage().window().maximize();

        //Open URL
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        Actions act =new Actions(driver);
        act.doubleClick(button).perform();   // Double Click Action






    }
}