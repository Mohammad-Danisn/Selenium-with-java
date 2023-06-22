import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        //public : it is a access specifier that means it can be accessed by any other class in the program.
        //static : it is access modifier that means when the java program is load then it will create the space in memory automatically.
        //void(return type) : it does not return any value.
        //main() : it is a method or a function name.(First method to execute by JVM)
        //string args[] : its a command line argument it is a collection of variables in the string format.
        //throws Exception : Use exceptions to notify about things that should not be ignored.


// TODO Auto-generated method stub

        String name = "Danish";


        //Sets the system property indicated by the specified key. First, if a security manager exists, its SecurityManager.checkPermission method is called with a PropertyPermission(key, "write") permission. This may result in a SecurityException being thrown. If no exception is thrown, the specified property is set to the given value.
        //Return type :- Null ,
        //Parameter  :- Key and value
        //key – the name of the system property.
        // value – the value of the system property.
                        // key(webdriver for chromdriver)      ,       value (path of the chrome browser)
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
       // System.setProperty("","");
        //WebDriver is a remote control interface
        //I am currently creating selenium automation using webdriver in Maven using Java. Now for initializing the browsers such as Chrome and IE I have to set the system property such as
       //Now, my deliverable is in terms of JAR. I am using maven so this is currently under main>resources>drivers>chromedriver.exe
        //So after package it will be unders root>drivers>chromedriver.exe
        //So How to make the system property that it will run in both the cases?
        //I researched about some constants like java.class.path or java.file.seperator etc. but I am not sure how they will useful here in this case.



        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        //1.)  we know WebDriver is an in Interface and the Chrome Driver is class, which is implementing the WebDriver Interface. That means, what ever the methods defined in Interface we are just Overriding the same with Chrome Driver Class.
        //2.) ChromeDriver driver = new ChromeDriver();
        //Now, if we write the code like above....Still we can run the code.

        //Now my doubts are:
        //1.) We are not relate to Webdriver Interface here. But Still Code will run and execute the methods successfully...How? Because in ChromeDriver class we dont have methds like:
        //getTitle(), getCurrentUrl() etc. These methods are absolutely relate to the WebDriver Interface.

        //2.) ChromeDriver is class and creating the Object for the same and getting the methods with Object.
        //And with the creation of Object how we get the methods like : getTitle(), getCurrentUrl()
        //through ChromeDriver Object?



        driver.manage().window().maximize();
        // driver --> refrence variable of WebDriver.
        //manage() is the abstract method.
        //manage() method returns an "Option interface" referred to as WebDriver.Options
        //When you type driver.manage(). -> gives you list of methods to access.

        //window
        //Ex. you can call a method window()->driver.manage().window(). This would further return the interface for managing window referred to as WebDriver.Window interface for managing current window.

        //maximize
        //WebDriver.Window interface has a method called maximize(). It can be called using following code: driver.manage().window().maximize(). This would maximize current window if not already maximized.
        //Returns:- the interface for managing the current window.
        //void maximize() – This method is used to maximize the current browser.


// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

// WebDriver driver = new EdgeDriver();

     //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //.timeouts
        //Returns:-  the interface for managing driver timeouts.

        //implicitlyWait
        //Params:- duration – The duration to wait.
        //Returns:- A self reference.

        //Duration
        //A time-based amount of time, such as '34.5 seconds'.

        //of Second
        //Params:-  seconds – the number of seconds, positive or negative
        //Returns:-  a Duration, not null

        String password = getPassword(driver);


        //The get() method takes a String URL as a parameter and return nothing. It opens the specified URL in the current browser window.



        driver.findElement(By.id("inputUsername")).sendKeys(name);
        //should i reference the values in the sendkeys function in selenium web driver


        driver.findElement(By.name("inputPassword")).sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        Thread.sleep(2000);
        // script will be pause 2 seconds
        //Thread Class is a class that is basically a thread of execution of the programs. It is present in Java.lang package. Thread class contains the Sleep() method. There are two overloaded methods of Sleep() method present in Thread Class, one is with one argument and another one is with two arguments. The sleep() method is used to stop the execution of the current thread(whichever might be executing in the system) for a specific duration of the time and after that time duration gets over, the thread which is executing earlier starts to execute again.

        //You are successfully logged in. Login Page last line
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/child::p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/child::p")).getText(), "You are successfully logged in.");
        //Overrides:- findElement in interface SearchContext
        //Params:- by – The locating mechanism to use
        //Returns:- The first matching element on the current page
        //Throws:- NoSuchElementException – If no matching elements are found


       //Hello Mohammad Danish,  Login Page first line
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello " + name + ",");
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

       // driver.close();
    }


    public static String getPassword(WebDriver driver) throws InterruptedException

    {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //Forgot your password? Link
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        Thread.sleep(1000);

        //Reset Login Button
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

        //Please use temporary password 'rahulshettyacademy' to Login.
        String passwordText =driver.findElement(By.xpath("//p[@class= 'infoMsg']")).getText();
        System.out.println(passwordText);
    //Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");
        System.out.println(passwordArray);
    // String[] passwordArray2 = passwordArray[1].split("'");

    // passwordArray2[0]

        String password = passwordArray[1].split("'")[0];
        System.out.println(password);
        return password;

    //0th index - Please use temporary password

    //1st index - rahulshettyacademy' to Login.


    //0th index - rahulshettyacademy

    //1st index - to Login.
    }

}
