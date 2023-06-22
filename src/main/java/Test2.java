import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        // chromedriver.exe  --> Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        // webdriver.chrome.driver->value of path
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //forgot your password
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//form)[1]/input[1]")).sendKeys("Mohammad Danish");
        System.out.println();
        driver.findElement(By.xpath("(//form)[1]/input[2]")).sendKeys("mohammaddanish@gmail.com");
        driver.findElement(By.xpath("(//form)[1]/input[3]")).sendKeys("8938979603");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();

        //Sign In
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Mohammad Danish");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='chkboxOne' and @name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo' and @name='chkboxTwo']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        //Logout
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()= 'Log Out']")).click();
        driver.findElement(By.xpath("//button[@id='visitUsTwo']")).click();

        Thread.sleep(5000);
        driver.close();
       // driver.quit();
    }

}
