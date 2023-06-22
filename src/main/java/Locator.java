import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator {

    public static void main(String[] args) throws InterruptedException {

        // chromedriver.exe  --> Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\chromedriver.exe");

        // webdriver.chrome.driver->value of path
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  driver.get("https://rahulshettyacademy.com");

       // driver.findElement(By.xpath("//div[@id='courses-block']/child::div[1]/div/div[1]/a/img")).click();
        //driver.findElement(By.xpath("//div[@class='header-upper']/following::li[2]/child::a")).click();

        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driver.findElement(By.xpath("//div[@id='sqseobar2']/preceding-sibling::script/preceding::input[5]")).sendKeys("mohammaddanish@gmail.com");
      //  driver.findElement(By.xpath("//div[@id='sqseobar2']/preceding-sibling::script/preceding::input[4]")).sendKeys("Danish12345678*");
       // driver.findElement(By.xpath("//div[@id='sqseobar2']/preceding-sibling::script/preceding::input[2]")).click();
      //  driver.findElement(By.xpath("//div[@id='sqseobar2']/preceding-sibling::main//div[1]/form/div[1]/input")).sendKeys("mohammaddanish@gmail.com");

       // driver.findElement(By.xpath("//main[@class='p-v-5-m']//div[1]/form/div[1]/input")).sendKeys("mohammaddanish@gmail.com");
       // driver.findElement(By.xpath("//main[@class='p-v-5-m']//div[1]/form/div[2]/div/input")).sendKeys("Danish12345678#");
       // driver.findElement(By.xpath("//main[@class='p-v-5-m']//div[1]/form/div[3]/div/input[2]")).click();
       // driver.findElement(By.xpath("//main[@class='p-v-5-m']//div[1]/form/div[4]/input")).click();


       // Thread.sleep(2000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.findElement(By.xpath("//header[@class='navbar-fedora']//img")).click();




      //  driver.get("https://rahulshettyacademy.com/locatorspractice");

      //  driver.findElement(By.id("inputUsername")).sendKeys("Ahmad");
      //  driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
      //  driver.findElement(By.className("signInBtn")).click();


  //     driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Mohammad Danish");
      //  driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");

      //  driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/div[1]/span[1]/input")).click();
      //  driver.findElement(By.xpath("//input[@id='chkboxTwo' and @name='chkboxTwo']")).click();
      //  driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();



    }
}
