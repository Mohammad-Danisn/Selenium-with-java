package OfficeTask;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class MakeMyTrip_UddeshyaSir_06_12_2022 {

    WebDriver driver;

    @Test(invocationCount = 2)
    public void DropDown_Without_Select_Class_and_Assertion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Maximize the Window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Call the Website URL
        driver.get("https://www.makemytrip.com/");

      //  driver.findElement(By.xpath("//a[@id= 'webklipper-publisher-widget-container-notification-close-div']/i")).click();

        Thread.sleep(8000);

/*

        //Pause Login/Signup for best price
        driver.findElement(By.xpath("//li[@id='showBizUpgradePopup']/following-sibling::li[2]")).click();
*/

        //Flights Icon
        driver.findElement(By.xpath("//div[@class='chHeaderContainer']/descendant::a[2]")).click();

        Thread.sleep(10000);

        //Rount Trip
        driver.findElement(By.xpath("//div[@class='minContainer']/descendant::ul[1]/li[2]")).click();

        /*
        driver.findElement(By.xpath("//div[@id='SW']/descendant::ul[1]/li[5]/div")).click();

        WebElement country = driver.findElement(By.xpath("//p[@class='selectConInput']"));
        country.click();
        List<WebElement> countryDropdown = driver.findElements(By.xpath("//div[@class='searchListWrap']/p"));
        selectDropDownOption(countryDropdown,"UAE");

        driver.findElement(By.xpath("//p[text()='Select Language']/../ul/li[2]/div/label")).click();

        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        */



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

        for (WebElement element1 : alladultsDropDown)
        {
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

       // driver.findElement(By.xpath("//label[@class='splitViewListing checked  group-placeholder']/div/button")).click();

        String fromT = getFromTicket(driver);

        //Ticket Price New Delhi to Mumbai
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='listing-id']/div/div[1]/div[2]/div/div/label[@class='splitViewListing checked  ']/descendant::p[8]")).getText().split(" ")[1],fromT);
        System.out.println("Delhi to Mumbai Airflight Ticket Price :- "+driver.findElement(By.xpath("//div[@id='listing-id']/div/div[1]/div[2]/div/div/label[@class='splitViewListing checked  ']/descendant::p[8]")).getText());


        //Go Back
        //driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();

        String toT = getToTicket(driver);


        //Ticket Price Mumbai to Delhi
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='listing-id']/div/div[2]/div[2]/div/div/div[2]/div/label[@class='splitViewListing checked  ']/div/div[2]/descendant::p[8]")).getText().split(" ")[1],toT);
        System.out.println("Mumbai to Delhi Airflight Ticket Price :- "+driver.findElement(By.xpath("//div[@id='listing-id']/div/div[2]/div[2]/div/div/div[2]/div/label[@class='splitViewListing checked  ']/div/div[2]/descendant::p[8]")).getText().split(" ")[1]);
//div[@id='listing-id']/div/div[2]/div[2]/div/div/div[2]/div/label[@class='splitViewListing checked  ']/div/div[2]/descendant::p[8]
        // Go Back
         //driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();

        //fromT string convert to integer
        int num1=Integer.parseInt(fromT.replace(",",""));

        //toT string convert to integer
        int num2=Integer.parseInt(toT.replace(",",""));

        //Sum of fromT + toT
        int sum = num1+num2;
        System.out.println(sum);

        //sum integer convert to string
        String total = Integer.toString(sum);
        System.out.println("Total Price of Tickets :- "+total);


        //Total Price

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='splitviewStickyOuter ']/div[1]/div[3]/div[1]/div[1]/p[1]/span")).getText().split(" ")[1].replace(",","").trim(),total);
        System.out.println(""+driver.findElement(By.xpath("//div[@class='splitviewStickyOuter ']/div[1]/div[3]/div[1]/div[1]/p[1]/span")).getText().split(" ")[1].replace(",",""));

        //Book Now Button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Book Now']")).click();

        //     -------------*************  Open Third Page (You have more fares to select from)   *************--------------


        //Depart Bundle
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/span/span/span")).click();


        //Depart Bundle Price
        Thread.sleep(3000);

        String departB = getDepartBundle(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")).getText().split(" ")[1],departB);
        System.out.println(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")).getText());


        //Return Bundle
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[2]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/span/span")).click();

        Thread.sleep(5000);
        String returnB = getReturnBundle(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[2]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")).getText().split(" ")[1],returnB);
        System.out.println(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[2]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")));

////BOOK Now
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[text()='Book Now']")).click();

        int num3=Integer.parseInt(departB.replace(",",""));
        int num4=Integer.parseInt(returnB.replace(",",""));

        int bundlesum = num3+num4;
        System.out.println(bundlesum);

        String totalBundle = Integer.toString(bundlesum);
        System.out.println("Total Price of Bundle Tickets :- "+totalBundle);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[3]/div/p[1]")).getText().split(" ")[1].replace(",","").trim(),totalBundle);
        System.out.println(driver.findElement(By.xpath("//div[@class='multifareOuter']/div[3]/div/p[1]")).getText().split(" ")[1].replace(",",""));
        //Assert.assertEquals(driver.findElement(By.xpath("")),"");

        driver.findElement(By.xpath("//div[@class='multifareOuter']/div[3]/button")).click();



        //     -------------*************  Open Fouth Page (You have more fares to select from)   *************--------------

        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,2550)");

//        driver.findElement(By.xpath("//div[@id='wrapper_ADULT']/descendant::button")).click();

     //   driver.findElement(By.xpath("//div[@id='wrapper_ADULT']/div[2]/div[3]/button")).click();
/*

        driver.findElement(By.xpath("//div[@id ='FARE_SUMMARY']/section/div[2]/div[1]/div/span[1]/span")).click();


        //FORTH PAGE
        //String base_fare_adults = getBase_Fare_Adults(driver);
        driver.findElement(By.xpath("//div[@id ='FARE_SUMMARY']/section/div[2]/div[2]/div/p[1]/span[2]/span")).getText();
*/

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


    //  Second Page
//Go Back
    //div[@id='fullpage-error']/div/div/div/span
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
//Go /back   //div[@id='fullpage-error']/div/div/div/span
    public static String getToTicket(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-14/12/2022_BOM-DEL-15/12/2022&tripType=R&paxType=A-5_C-1_I-2&intl=false&cabinClass=E&ccde=IN&lang=eng");

        //Go Back
        driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();

        //Please use web current price.
        String toTicket = driver.findElement(By.xpath("//div[@id='listing-id']/div/div[2]/div[2]/div/div/div[2]/div/label[@class='splitViewListing checked  ']/div/div[2]/descendant::p[8]")).getText();
        System.out.println(toTicket);
//div[@id='listing-id']/div/div[2]/div[2]/div/div/div[2]/div/label[@class='splitViewListing checked  ']/div/div[2]/descendant::p[8]
        //Than Split the from Price.
        String[] toTicketArray = toTicket.split(" ");
        System.out.println(toTicketArray);

        // FromArray[0]

        String toT = toTicketArray[1];
        System.out.println(toT);
        return toT;
    }


    // Third Page
    public static String getDepartBundle(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-14/12/2022_BOM-DEL-15/12/2022&tripType=R&paxType=A-5_C-1_I-2&intl=false&cabinClass=E&ccde=IN&lang=eng");

        //Go Back
        driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();

        //BOOK Now
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Book Now']")).click();


        Thread.sleep(5000);
        //Please use Bundle current price.
        String departBundle = driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")).getText();
        System.out.println(departBundle);

        //Than Split the Depart Bundle Price.
        String[] departBundleArray = departBundle.split(" ");
        System.out.println(departBundleArray);

        // Depart Bundle Array[0]
        String departB = departBundleArray[1];
        System.out.println(departB);
        return departB;
    }

    //Return Bundle
    public static String getReturnBundle(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-14/12/2022_BOM-DEL-15/12/2022&tripType=R&paxType=A-5_C-1_I-2&intl=false&cabinClass=E&ccde=IN&lang=eng");

        //Go Back
        driver.findElement(By.xpath("//div[@id='fullpage-error']/div/div/div/span")).click();

        Thread.sleep(5000);
        //Please use Bundle current price.
        String returnBundle = driver.findElement(By.xpath("//div[@class='multifareOuter']/div[2]/div[2]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p")).getText();
        System.out.println(returnBundle);

//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p


//div[@class='multifareOuter']/div[2]/div[1]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p
//div[@class='multifareOuter']/div[2]/div[2]/div/div[2]/div/div[@class='multifareCard checked ']/label/div/div/div[2]/p

        //Than Split the Depart Bundle Price.
        String[] returnBundleArray = returnBundle.split(" ");
        System.out.println(returnBundleArray);

        // Depart Bundle Array[0]
        String returnB = returnBundleArray[1];
        System.out.println(returnB);
        return returnB;

    }



    // Fourth Page -- Fare Summary

    /*public static String getBase_Fare_Adults(WebDriver driver) throws InterruptedException
    {
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-14/12/2022_BOM-DEL-15/12/2022&tripType=R&paxType=A-5_C-1_I-2&intl=false&cabinClass=E&ccde=IN&lang=eng");

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
    }*/


}


//div[@id= 'fullpage-error' or class='fullpage-error-wrapper ']/div/div/div/span
