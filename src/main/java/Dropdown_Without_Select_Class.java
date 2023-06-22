import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown_Without_Select_Class {
    @Test
    public void Dropdown_List_Without_Select_Class(){

        //Creating reference variable of Webdriver
        WebDriver driver;

        // Setting up the properties for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        // Inserting Chromedriver to Webdriver refernece object
        driver = new ChromeDriver();

        // Maximizing the browser window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Providing wait to load all the elements on page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Passing the URL
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        // Clicking on Bootstrap Dropdown
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        // Get the all WebElements inside the dropdown in List
        List<WebElement> dropdown_list =  driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));

        // Printing the amount of WebElements inside the list
        System.out.println("The Options in the Dropdown are: " + dropdown_list.size());

        // Condition to get the WebElement for list and Click over "Angular" option
        for(int i=0; i<dropdown_list.size(); i++)
        {
            // Printing All the options from the dropdown
            System.out.println(dropdown_list.get(i).getText());

            // Checking the condition whether option in text "Angular" is comming
            if(dropdown_list.get(i).getText().contains("Angular"))
            {
                // Clicking if text "Angular" is there
                dropdown_list.get(i).click();

                // Breaking the condition if the condition get satisfied
                break;
            }
        }

    }
}
