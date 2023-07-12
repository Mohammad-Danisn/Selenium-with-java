import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {

        // chromedriver.exe  --> Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\New folder\\chromedriver.exe");

        // webdriver.chrome.driver->value of path
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        //Sign In

        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();

//        String name = "Mohammad Danish";

        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='chkboxOne' and @name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo' and @name='chkboxTwo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/child::p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/child::p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hell "+name+",");
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"DANISH");
        driver.findElement(By.xpath("")).click();
    }
}
