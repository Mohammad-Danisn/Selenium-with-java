package ClaimsManager;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClaimsManagerLogin {
    @Test(invocationCount = 1)
    public void FirstTestDemo1() throws InterruptedException {
        // chromedriver.exe   -->   Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        // webdriver.chrome.driver  -->   value of path
        WebDriver driver = new ChromeDriver();

        //----------------**********-------------Maximize the Page----------------***********--------------------
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open ClaimsManager Login Page
        driver.get("https://claimsmanagertest.crawco.co.uk/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Login");
        System.out.println("Actual Title :: " + actualTitle);
        WebElement email_Id = driver.findElement(By.xpath("//input[@id='EmailAddress']"));
        Assert.assertTrue(email_Id.isDisplayed());


        Thread.sleep(2000);

        //Verify This page is display
        boolean isElementDisplay = driver.findElement(By.xpath("//div[@class='logo']/img")).isDisplayed();
        Assert.assertTrue(isElementDisplay, "This element is not displayed on Log in to Claims Manager Page");
        System.out.println("Actual Title :: " + isElementDisplay);


        //verify element is enabled
        boolean isElementDisplayed = driver.findElement(By.xpath("//button[@id='btnSubmit']")).isDisplayed();
        Assert.assertTrue(isElementDisplayed, "This element should not be enabled");
        System.out.println("Actual Title :: " + isElementDisplayed);




        //---------------------------********--------Account Login---------********---------------------------
        //Email

        String email = "abhishek.sharma@shreepartners.com";
        String passwd = "Password123";
       // driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys(email);
       // Assert.assertEquals(driver.findElement(By.xpath("//input[@id='EmailAddress']")).getText(), "", "This element Succesfully");


        email_Id.sendKeys(email);
      /*  String attribute = email_Id.getAttribute("value");
        System.out.println("Entered the email :: " +attribute);
        if(attribute.contains(email));
        {
            System.out.println("Correct Email");
        }*/


        //Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(passwd);
        Assert.assertEquals(driver.findElement(By.xpath("//input[@id='Password']")).getText(), "", "This element is Also Succesfully");


        //Submit
        driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
        boolean isElememtEnabled = driver.findElement(By.xpath("//button[@id='btnSubmit']")).isEnabled();
        Assert.assertTrue(isElememtEnabled, "This element is disabled");
        Thread.sleep(3000);


        //                                       ----**Records Page**-----
        //              Incident Search
        //New Incident


        boolean isElementEnabled1 = driver.findElement(By.xpath("//button[@id='btnReset']/following-sibling::a")).isEnabled();
        Assert.assertTrue(isElementEnabled1,"This element is Disabled");
        driver.findElement(By.xpath("//button[@id='btnReset']/following-sibling::a")).click();


        //************************************************


         //Select_A_Programme
        WebElement dropdown = driver.findElement(By.id("154"));
        Select select_A_Programme = new Select(dropdown);
        select_A_Programme.selectByVisibleText("Vodafone");


        /*
        Select select_P = new Select(driver.findElement(By.id("154")));
        List<WebElement> lst_P =select_P.getOptions();

        List<String> list_P = new ArrayList<String>();
        System.out.println("The Select A Proram dorpdown options are :  ");
        for (WebElement option_P: lst_P)
            list_P.add(option_P.getText());
        System.out.println(lst_P);

        select_P.selectByVisibleText("Vodafone ");
        System.out.println("Select value is: " + select_P.getFirstSelectedOption().getText());
        Assert.assertEquals("" + select_P.getFirstSelectedOption().getText(),"Vodafone","Actual and Expected value are Equal");
*/

        //Select_A_Programme
/*
        WebElement dropdown = driver.findElement(By.id("154"));
        Select select_A_Programme = new Select(dropdown);
        select_A_Programme.selectByVisibleText("Vodafone");
*/


        //**************************************************

        //Next Button
        driver.findElement(By.xpath("//div[@class='action-button']/a/input")).click();
        Thread.sleep(3000);

        //*********************************************

        //Select the Type of Policy Cover*    Page
/*
        String expectedOptions[] = {"Contractors All Risks", "General Liability (Public)", "Property and Business Interruption"};
         WebElement dropdown2 = driver.findElement(By.id("155"));
        Select select_the_Type_of_Policy_Cover = new Select(dropdown2);
        select_the_Type_of_Policy_Cover.selectByIndex(2);
*/

        //*****************************************

        //Step#1- Selecting the dropdown element by locating its id
        Select select = new Select(driver.findElement(By.id("155")));

        //Step#2- Printing the options of the dropdown
        //Get list of web elements
        List<WebElement> lst = select.getOptions();

        //Get list of string
        List<String> list=new ArrayList<String>();

        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            list.add(options.getText());

        System.out.println(list);

        //Step#- Selecting the option as 'General Liability (Public)'-- selectByVisibleText
       // System.out.println("\nSelect the Option by Text General Liability (Public)\n");
        select.selectByVisibleText("General Liability (Public)");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        Assert.assertEquals("" + select.getFirstSelectedOption().getText(),"General Liability (Public)","Actual and Expected value are Equal");


        /*

        //Step#3- Selecting the option as 'General Liability (Public)'-- selectByIndex
        System.out.println("Select the Option by Index 2");
        select.selectByIndex(2);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

*/



/*

        //Step#5- Selecting an option by its value

        System.out.println("Select the Option by value 2");
        select.selectByValue("General Liability (Public)");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
*/





        //*****************************************


        //Next Button
        driver.findElement(By.xpath("//div[@class='action-button']/a/input")).click();
        Thread.sleep(3000);

        //Enter the Incident Date*    Page
        driver.findElement(By.xpath("//div[contains(@class,'date')]/input")).sendKeys("11/23/2022");//   MM/DD/YYYY

        //Next Button
        driver.findElement(By.xpath("//div[@class='action-button']/a/input")).click();
        Thread.sleep(3000);

/*
        //Select the Policy Country*     Page
        WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='157']"));
        Select select_the_Policy_Country = new Select(dropdown3);
        select_the_Policy_Country.selectByVisibleText("United Kingdom");
*/

        //****************************

        //Select the Policy Country*     Page
        WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='157']"));
        Select select_the_Policy_Country = new Select(dropdown3);
        select_the_Policy_Country.selectByVisibleText("United Kingdom");

        //********************************

        //Next Button
        driver.findElement(By.xpath("//div[@class='action-button']/a/input")).click();
        Thread.sleep(3000);
        //New Incident: choose an Applicable Policy*     End of the Page
        driver.findElement(By.xpath("//div[@id='sgridViewModel']/table/tbody/tr")).click();
        Thread.sleep(2000);

        //        -----*****Record a New Incident (or pick an existing one)*****-----   Page
        //New Incident: Button
        driver.findElement(By.xpath("//div[@class='create-new-incident']/div/div[1]/a")).click();
        Thread.sleep(2000);

        //------*****---New General Liability (Public) Incident for Vodafone---*****------   Page

        //Incident Location*
        driver.findElement(By.xpath("//input[@id='363']")).sendKeys("New Delhi");


        //Incident Country
        WebElement dropdown4 = driver.findElement(By.xpath("//select[@id='358']"));
        Select incident_Country = new Select(dropdown4);
        incident_Country.selectByVisibleText("India");

        //Insured Division
        WebElement dropdown5 = driver.findElement(By.xpath("//select[@id='366']"));
        Select insured_Division = new Select(dropdown5);
        insured_Division.selectByVisibleText("Uploaded Claims");

        Thread.sleep(3000);
        //Date Incident Notified to Crawford*
        driver.findElement(By.xpath("//input[@id='338']")).sendKeys("11/24/2022");

        //Incident Date*
        driver.findElement(By.xpath("//input[@id='360']")).sendKeys("11/24/2022");

        //Incident Time
        driver.findElement(By.xpath("//input[@id='365']")).sendKeys("12:30");

        //Incident Description*
        driver.findElement(By.xpath("//textarea[@id='362']")).sendKeys("Hi, this is Testing Only..");

        //Cause Code 1*
        WebElement dropdown6 = driver.findElement(By.xpath("//select[@id='329']"));
        Select cause_Code_1 = new Select(dropdown6);
        cause_Code_1.selectByVisibleText("Vibration");

        //Cause Code 2*
        WebElement dropdown7 = driver.findElement(By.xpath("//select[@id='330']"));
        Select cause_Code_2 = new Select(dropdown7);
        cause_Code_2.selectByVisibleText("Personal Injury");

        //Liability Code*
        WebElement dropdown8 = driver.findElement(By.xpath("//select[@id='376']"));
        Select liability_Code = new Select(dropdown8);
        liability_Code.selectByVisibleText("RTA");

        //PL Class*
        WebElement dropdown9 = driver.findElement(By.xpath("//select[@id='1922']"));
        Select pL_Class = new Select(dropdown9);
        pL_Class.selectByVisibleText("PL - Injury");
        Thread.sleep(2000);

        //Save Button
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(2000);


        //-----***--6696886, Vodafone, General Liability (Public) Incident--***------    Page

        //Status
        driver.findElement(By.xpath("//a[text()='Status']")).click();

        //Information Only*
        WebElement dropdown10 = driver.findElement(By.xpath("//select[@id='1923']"));
        Select information_Only = new Select(dropdown10);
        information_Only.selectByVisibleText("Yes");

        //initial_Recovery_Assessment
        WebElement dropdown11 = driver.findElement(By.xpath("//select[@id='1924']"));
        Select initial_Recovery_Assessment = new Select(dropdown11);
        initial_Recovery_Assessment.selectByVisibleText("80%");

        //File Handler*
        WebElement dropdown12 = driver.findElement(By.xpath("//select[@id='353']"));
        Select file_Handler = new Select(dropdown12);
        file_Handler.selectByVisibleText("Abhishek Sharma");

        //Current Status*
        driver.findElement(By.xpath("//textarea[@id='333']")).sendKeys("Hi!, this is testing only...");

        //Control of Claims
        WebElement dropdown13 = driver.findElement(By.xpath("//select[@id='1860']"));
        Select control_of_Claims = new Select(dropdown13);
        control_of_Claims.selectByVisibleText("Insurer Handled");

        //Starred Claim*
        WebElement dropdown14 = driver.findElement(By.xpath("//select[@id='3472']"));
        Select starred_Claim = new Select(dropdown14);
        starred_Claim.selectByVisibleText("Yes");

        //     -----******---References---******-----   Page
        driver.findElement(By.xpath("//div[@class='scroll_tab_inner']/ul/li[3]/a")).click();
        Thread.sleep(2000);

        //Crawford Handling Office Reference*
        driver.findElement(By.xpath("//input[@id='332']")).sendKeys("Hello");

        //Insurer's Reference
        driver.findElement(By.xpath("//input[@id='375']")).sendKeys("ABCD");

        //Insured's Reference
        driver.findElement(By.xpath("//input[@id='373']")).sendKeys("XYZ");

        //Broker's Reference
        driver.findElement(By.xpath("//input[@id='327']")).sendKeys("ABCXYZ");


        //   -----------------***********  Details ************-----------------  Page
        driver.findElement(By.xpath("//div[@class='scroll_tab_inner']/ul/li[4]/a")).click();
        Thread.sleep(2000);

        //Incident Location*
        driver.findElement(By.xpath("//input[@id='363']")).sendKeys("New Delhi");

        //Incident Location Postcode
        driver.findElement(By.xpath("//input[@id='1749']")).sendKeys("110001");

        //Date Incident Notified to Crawford*
        driver.findElement(By.xpath("//input[@id='338']")).sendKeys("11/25/2022");

        //Incident Date*
        driver.findElement(By.xpath("//input[@id='360']")).sendKeys("11/23/2022");

        //Incident Description*
        driver.findElement(By.xpath("//textarea[@id='362']")).sendKeys("Hi, this is Testing Only..");

        //Type of Notification*
        WebElement dropdown15 = driver.findElement(By.xpath("//select[@id='1463']"));
        Select type_of_Notification = new Select(dropdown15);
        type_of_Notification.selectByVisibleText("Data import");

        //Notified By
        WebElement dropdown16 = driver.findElement(By.xpath("//select[@id='1464']"));
        Select notified_By = new Select(dropdown16);
         notified_By.selectByVisibleText("Client");

        //PL Class*
        WebElement dropdown17 = driver.findElement(By.xpath("//select[@id='1922']"));
        Select pl_Class = new Select(dropdown17);
        pl_Class.selectByVisibleText("PL - Injury");

        //Adjuster Instructed*
        WebElement dropdown18 = driver.findElement(By.xpath("//select[@id='3471']"));
        Select adjuster_Instructed = new Select(dropdown18);
        adjuster_Instructed.selectByVisibleText("Yes");


        //  ------------------************** Codes **************---------------   Page
        driver.findElement(By.xpath("//div[@class='scroll_tab_inner']/ul/li[5]/a")).click();
        Thread.sleep(2000);

        //Cause Code 1*
        WebElement dropdown19 = driver.findElement(By.xpath("//select[@id='329']"));
        Select cause_Code = new Select(dropdown19);
        cause_Code.selectByVisibleText("Vibration");

        //Cause Code 2*
        WebElement dropdown20 = driver.findElement(By.xpath("//select[@id='330']"));
        Select cause_Code2 = new Select(dropdown20);
        cause_Code2.selectByVisibleText("Personal Injury");

        //Liability Code*
        WebElement dropdown21 = driver.findElement(By.xpath("//select[@id='376']"));
        Select liability_Code2 = new Select(dropdown21);
        liability_Code2.selectByVisibleText("RTA");


        //  ------------------************** Property **************---------------   Page
        driver.findElement(By.xpath("//div[@class='scroll_tab_inner']/ul/li[6]/a")).click();
        Thread.sleep(2000);

        //  ------------------************** Financials **************---------------   Page
        driver.findElement(By.xpath("//div[@class='scroll_tab_inner']/ul/li[7]/a")).click();
        Thread.sleep(2000);

        //----------------***********  Save Button 2  **************------------
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(2000);
/*

        //  ------------------************** Tasks **************---------------   Button
        driver.findElement(By.xpath("//div[@id='headerMenu']/ul/li[2]/a/span")).click();
        Thread.sleep(2000);

        //My Task Page
        driver.findElement(By.xpath("//div[text()='Test2']")).click();
        Thread.sleep(3000);

        //Test 2* Button
        driver.findElement(By.xpath("//table[@id='taskGridViewModel']/tbody/tr[1]/td")).click();
        Thread.sleep(2000);

        //Reminder: 6696904, Vodafone, General Liability (Public) Incident*     Page
        //Task Assignee*
        WebElement dropdown22 = driver.findElement(By.xpath("//select[@id='3493']"));
        Select task_Assignee = new Select(dropdown22);
        task_Assignee.selectByVisibleText("Me");

        //Action Is Completed?*
        driver.findElement(By.xpath("//input[@id='1102_1']")).click();
        Thread.sleep(2000);

        //Save Button
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();

*/

        //Close this Program
        Thread.sleep(2000);
        //driver.close();
    }
}
