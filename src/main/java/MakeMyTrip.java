import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MakeMyTrip {
    @Test
    public void DropdownWithoutSelectedClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.xpath("//li[@id='showBizUpgradePopup']/following-sibling::li[2]")).click();

        // Select From
        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        from.click();
        List<WebElement> allfromDropDownOptions = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul//li//p[contains(@class,'black')]"));
        selectOptionInDropDownUsingIteration(allfromDropDownOptions, "Mumbai, India");

        //Select To
        WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
        to.click();
        List<WebElement> alltoDropDownOptions = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul//li/div/div[1]/p[1]"));
        selectOptionInDropDownUsingIteration(alltoDropDownOptions, "Hyderabad, India");


        //Travellers & Class
        WebElement trveller = driver.findElement(By.xpath("//input[@id='travellers']/.."));
        trveller.click();
        List<WebElement> alltrvellerDropDownOptions = driver.findElements(By.xpath("//div[@class='appendBottom20']/ul[1]/li"));
        selectOptionInDropDownUsingIteration(alltrvellerDropDownOptions,"8");

        //Children(2y - 12y)
        List<WebElement> allchildrenDropDownOptions = driver.findElements(By.xpath("//div[@class='appendBottom20']/div/div[1]/ul/li"));
        selectOptionInDropDownUsingIteration(allchildrenDropDownOptions,"2");

        //INFANTS (below 2y)
        List<WebElement> allinfantsDropDownOptions = driver.findElements(By.xpath("//div[@class='appendBottom20']/div/div[2]/ul/li"));
        selectOptionInDropDownUsingIteration(allinfantsDropDownOptions,"2");

        //CHOOSE TRAVEL CLASS
        List<WebElement> chooseTravelclassDropDownOptions = driver.findElements(By.xpath("//div[@class='appendBottom20']/ul[2]/li"));
        selectOptionInDropDownUsingIteration(chooseTravelclassDropDownOptions,"Premium Economy");
        //APPLY BUTTON
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        /*
        //Select A Fare Type:
//        WebElement Select_A_Fare_Type = driver.findElement(By.xpath("//input[@id='travellers']/../../../following-sibling::div/div[1]/ul/li"));
//        Select_A_Fare_Type.click();
//        List<WebElement> selectAFareType = driver.findElements(By.xpath("//input[@id='travellers']/../../../following-sibling::div/div[1]/ul/li"));
//        selectOptionInDropDownUsingIteration(selectAFareType,"Doctors & Nurses  Fares");
        */

        //Select A Fare Type:
        driver.findElement(By.xpath("//input[@id='travellers']/../../../following-sibling::div/div[1]/ul/li[1]")).click();

        //SEARCH BUTTON
        driver.findElement(By.xpath("//input[@id='travellers']/../../../following-sibling::p/a")).click();


        driver.close();

      /*  Thread.sleep(3000);
        //Departure
        WebElement departure = driver.findElement(By.xpath("//input[@id='departure']"));
        departure.click();
        List<WebElement> alldepartureDropDownOption = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']"));
        selectOptionInDropDownUsingIteration(alldepartureDropDownOption,"7");
*/
        /*WebElement dropdown = driver.findElement(By.id("fromCity"));
        Select select1 = new Select(dropdown);
        select1.selectByVisibleText("Dehradun");*/

      /*  driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']/div")).click();

        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-7']/div")).click();

        driver.findElement(By.xpath("//input[@id='departure']/../span")).click();

       // driver.findElement(By.xpath("")).click();

        driver.findElement(By.xpath("//input[@id='return']/../span")).click();
*/
    }

    public void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
       boolean isFound = false;
        for (WebElement option : dropDownOptions) {
            if (option.getText().equals(optionToBeSelected)) {
                option.click();
               isFound = true;
                break;
            }

        }
        if (!isFound)
            System.out.println("No matching opion found.");
    }
}





/*

    String placeholderVal = trveller.getAttribute("for");
    String expectedVal = "travellers";
        if(placeholderVal.equalsIgnoreCase(expectedVal))
                System.out.println("The placeholder value is expected, ie : "+placeholderVal);
                else
                System.out.println("The placeholder value is not correct --- " +placeholderVal);
*/
