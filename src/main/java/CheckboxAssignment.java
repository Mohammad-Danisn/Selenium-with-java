import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        //Check the first  Checkbox and verify if it is successfully
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());


        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

//|||\\\\\\  I am not sure this method --->
        driver.findElements(By.xpath("//input[@type='checkbox']")).listIterator();
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).listIterator());
////||||||\\\

      //  <pre class="prettyprint linenums">driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        //System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        //Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());</pre>

        System.out.println("\n__________________________________________\n");


        // checked and Uncheck it again to verify if it is successfully Unchecked
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());


        System.out.println("\n__________________________________________\n");

        // How to get the Count of number of check boxes present in the page
       driver.findElements(By.cssSelector("input[value='checkbox']")).size();



    }
}
