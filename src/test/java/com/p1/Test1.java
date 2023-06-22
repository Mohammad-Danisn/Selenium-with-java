package com.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test1 {

    public static void main(String[] args) {

        // chromedriver.exe  --> Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        // webdriver.chrome.driver->value of path
         WebDriver driver = new ChromeDriver();

        //driver.get("https://rahulshettyacademy.com/practice-project");
        driver.get("https://rahulshettyacademy.com/locatorspractice");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Mohammad Danish");

        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");

      //  driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/div[1]/span[1]/input")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo' and @name='chkboxTwo']")).click();
      //  driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();


                // driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[1]/a")).click();
               // driver.findElement(By.xpath("//a[text()='All Access plan']")).click();
              //  driver.findElement(By.xpath("//a[text()='JOIN NOW']")).click();


              //  driver.findElement(By.xpath("//div[@class='form-group text-center']")).click();

      //  driver.findElement(By.xpath("//input[@id='name' and @name='name']")).sendKeys("Mohammad Danish");
      //  driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("mohammaddanish01@gmail.com");
     //   driver.findElement(By.xpath("//button[@id='form-submit' and @class='theme-btn btn-style-one']")).click();

      //  driver.get("https://www.spirit.com/");
      //  driver.findElement(By.xpath("//div[@class='city-selection left align-items-start flex-column ng-tns-c141-3']")).click();







        //ChromeDriver driver = new ChromeDriver();



                //Firofox Launch
                //geckodriver

        //webdriver.gecko.driver
       // System.setProperty("webdriver.gecko.driver", "E:\\UdemySeleniumCourse\\Software\\geckodriver.exe");
       // WebDriver driver =new FirefoxDriver();



       //  Microsoft Edge  --> Microsoft Browser
    //   System.setProperty("webdriver.edge.driver", "E:\\UdemySeleniumCourse\\Software\\msedgedriver.exe");

      //  WebDriver driver =new EdgeDriver();




        // .manage().window().maximize();  <-- It is the Maxinize the full window size  of browser

       // String URL = "https://www.google.com";
       // driver.get(URL);


     // get all methods this site **->   https://www.scientecheasy.com/2020/07/selenium-webdriver-commands.html/


     //   driver.get("https://rahulshettyacademy.com");

      //  driver.get("https://rahulshettyacademy.com/practice-project");
      //  driver.findElement(By.xpath("//input[@id='name' and @name='name']")).sendKeys("Mohammad Danish");
      //  driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("mohammaddanish@gmail.com");
      //  driver.findElement(By.xpath("//button[@id='form-submit' and @class='theme-btn btn-style-one']")).click();


       // driver.get("https://rahulshettyacademy.com/practice-project");
       // driver.findElement(By.xpath("//input[@id='code' and @name='code']")).sendKeys("1234");
       // driver.findElement(By.xpath("//button[@id='code-form-submit' and @class='theme-btn btn-style-one']")).click();


//        driver.get("https://www.rediff.com/");

  //      driver.findElement(By.xpath("//a[@class='signin']")).click();
    //    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("");
      //  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");

       // driver.get("https://www.w3schools.com");
       // System.out.println(driver.getTitle());
      //  System.out.println(driver.getCurrentUrl());



        //System.out.println(driver.getPageSource());


      //  driver.navigateTo();
        //ChromeDriver driver = new ChromeDriver();


     //   driver.close();
      //  driver.quit();

    }

}
