import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEditboxsAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //Name: Input
        driver.findElement(By.xpath("//div[@class='form-group'][1]/label/following-sibling::input")).sendKeys("Mohammad Danish");

        //Email: Input
        driver.findElement(By.xpath("//div[@class='form-group'][2]/label/following-sibling::input")).sendKeys("mohammaddanish3940@gmail.com");

        //Password: Input
        driver.findElement(By.xpath("//div[@class='form-group'][3]/label/following-sibling::input")).sendKeys("LeaveMeAlone");

        //checkbox: Check me out if you Love IceCreams!
        driver.findElement(By.xpath("//div[@class='form-check']/input")).click();

        //Gender: Dropdown list
      //  driver.findElement(By.xpath("//select[@class='form-control']")).click();
        //Male/Female: SelectOption

        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Male");
        //driver.findElement(By.xpath("//select[@class='form-control']/option[1]")).click();

        //Employment Status: RedioButton
        driver.findElement(By.xpath("//input[@id= 'inlineRadio2']")).click();

        //Date of Birth
        driver.findElement(By.xpath("//input[@class= 'form-control' and @name='bday']")).click();
        driver.findElement(By.xpath("//input[@class= 'form-control' and @name='bday']")).sendKeys("20032000");


        //Submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        /*
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("rahul");

        driver.findElement(By.name("email")).sendKeys("hello@abc.com");

        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

        driver.findElement(By.id("exampleCheck1")).click();

        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

        Select abc = new Select(dropdown);

        abc.selectByVisibleText("Female");

        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.name("bday")).sendKeys("02/02/1992");

        driver.findElement(By.cssSelector(".btn-success")).click();

        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());  

         */
    }
}

