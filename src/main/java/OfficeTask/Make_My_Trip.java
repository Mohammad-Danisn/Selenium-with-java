package OfficeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Make_My_Trip {
    WebDriver driver;

    @Test(invocationCount = 1)
    public void DropDown_Without_Select_Class_and_Assertion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Maximize the Window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Call the Website URL
        driver.get("https://www.makemytrip.com/");

        //  driver.findElement(By.xpath("//a[@id= 'webklipper-publisher-widget-container-notification-close-div']/i")).click();

        Thread.sleep(8000);

        //Pause Login/Signup for best price
        driver.findElement(By.xpath("//li[@id='showBizUpgradePopup']/following-sibling::li[2]")).click();

        //Flights Icon
        driver.findElement(By.xpath("//div[@class='chHeaderContainer']/descendant::a[2]")).click();

        Thread.sleep(10000);

        //Rount Trip
        driver.findElement(By.xpath("//div[@class='minContainer']/descendant::ul[1]/li[2]")).click();

        //Book International and Domestic Flights
        //From Option
        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        from.click();
        List<WebElement> fromDropdown = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul//li//p[contains(@class,'black')]"));
        selectDropDownOption(fromDropdown,"New Delhi, India");

        //DEPARTURE DATE
        //   driver.findElement(By.xpath("//div[starts-with(@class, 'DayPicker-Day DayPicker-Day--start DayPicker-Day--selected')]")).click();

        Thread.sleep(3000);
        from.sendKeys(Keys.ESCAPE);

        //RETURN DATE
        //  driver.findElement(By.xpath("//div[starts-with(@class, 'DayPicker-Day DayPicker-Day--start DayPicker-Day--selected')]//following-sibling::div")).click();

        //To Option
        WebElement toArrvel = driver.findElement(By.xpath("//input[@id='toCity']"));
        toArrvel.click();
        List<WebElement> toDropDown = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul//li/div/div[1]/p[1]"));
        selectDropDownOption(toDropDown, "Mumbai, India");

        //TRAVELLERS & CLASS
        WebElement trveller = driver.findElement(By.xpath("//input[@id='travellers']/.."));
        trveller.click();
        List<WebElement> alladultsDropDown = driver.findElements(By.xpath("//div[@class='appendBottom20']/ul[1]/li"));

        for (WebElement element1 : alladultsDropDown) {

            if(element1.getAttribute("class").contains("selected"))
                System.out.println("ADULTS 0 Postion :- " + element1.getAttribute("data-cy").split("-")[1]);
            break;
        }
        selectDropDownOption(alladultsDropDown,"2");

        if(alladultsDropDown.size()!=0)
        {
            System.out.println("Number of Total Element is "+alladultsDropDown.size());

            for (WebElement inputElement : alladultsDropDown){
                System.out.println(inputElement.getAttribute("data-cy"));
            }

        }


        //Children(2y - 12y)
        List<WebElement> childrenDropDown = driver.findElements(By.xpath("//div[@class='appendBottom20']/div/div[1]/ul/li"));
        selectDropDownOption(childrenDropDown,"1");

        for(WebElement element2 : childrenDropDown)
        {
            if (element2.getAttribute("class").contains("selected"));
            {
                System.out.println("CHILDREN 0 Poistion :- "+element2.getAttribute("data-cy").split("-")[1]);
            }
            break;
        }

        //INFANTS (below 2y)
        List<WebElement> infantsDropDown = driver.findElements(By.xpath("//div[@class='appendBottom20']/div/div[2]/ul/li"));

        for(WebElement element3 : infantsDropDown)
        {
            if(element3.getAttribute("class").contains("selected"))
            {
                System.out.println("INFANTS 0 Position :- "+element3.getAttribute("data-cy").split("-")[1]);
            }
        }
        selectDropDownOption(infantsDropDown,"1");

        //CHOOSE TRAVEL CLASS
        List<WebElement> chooseTravelClass = driver.findElements(By.xpath("//div[@class='appendBottom20']/ul[2]/li"));
        selectDropDownOption(chooseTravelClass,"Economy/Premium Economy");

        //Apply Button
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        //Search Button
        driver.findElement(By.xpath("//div[@class='makeFlex']/following-sibling::div/p/a")).click();

        //             <<---***********************     NEXT PAGE   ***********************--->>

        //Go Back
      //  driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();


        String fromT = getFromTicket(driver);


        //Ticket Price New Delhi to Mumbai
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='listing-id']/div/div[1]/div[2]/div/div/label[@class='splitViewListing checked  ']/descendant::p[8]")).getText().split(" ")[1],fromT);
        System.out.println("Delhi to Mumbai Airflight Ticket Price :- "+driver.findElement(By.xpath("//div[@id='listing-id']/div/div[1]/div[2]/div/div/label[@class='splitViewListing checked  ']/descendant::p[8]")).getText());



    }

    // First Page

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }


    public void selectDropDownOption(List<WebElement> dropDownOption, String OptionToBeSelected){
        for (WebElement option : dropDownOption){
            if (option.getText().equals(OptionToBeSelected)){
                option.click();
                break;
            }
        }

    }

    public static String getFromTicket(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-14/12/2022_BOM-DEL-15/12/2022&tripType=R&paxType=A-5_C-1_I-2&intl=false&cabinClass=E&ccde=IN&lang=eng");

        //Go Back
        driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();


        //Please use web current price.
        String fromTicket = driver.findElement(By.xpath("//div[@id='listing-id']/div/div[1]/div[2]/div/div/label[@class='splitViewListing checked  ']/descendant::p[8]")).getText();
        System.out.println(fromTicket);

        //Than Split the from Price.
        String[] fromTicketArray = fromTicket.split(" ");
        System.out.println(fromTicketArray);

        // FromArray[0]

        String fromT = fromTicketArray[1];
        System.out.println(fromT);
        return fromT;
    }

}