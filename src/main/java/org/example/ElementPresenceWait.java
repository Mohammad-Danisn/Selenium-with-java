package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ElementPresenceWait{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.tutorialspoint.com/about/about_careers.htm";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element and click()
        WebElement l=driver.findElement(By.linkText("Terms of Use"));
        l.click();
        // explicit wait condition
      //  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        // presenceOfElementLocated condition
     //   w.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("h1"))).getText();
        // get text of element and print
        System.out.println("Element present having text:" + l.getText());
        driver.quit();
    }
}
