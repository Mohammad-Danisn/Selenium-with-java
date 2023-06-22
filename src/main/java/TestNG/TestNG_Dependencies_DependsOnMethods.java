package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Dependencies_DependsOnMethods {
    public static WebDriver driver;

    @BeforeTest
    public void start()
    {
     //   WebDriverManager.chromedriver().setup;
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mycarhelpline.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void LandingPage(){
        System.out.println(driver.getCurrentUrl());
    }
}
