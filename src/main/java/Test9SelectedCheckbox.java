import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test9SelectedCheckbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000l);
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
      //  Assert.assertFalse(true);System.out.println(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
       // driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']"));
        System.out.println(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

        System.out.println(driver.findElements (By.xpath("//input[@type='checkbox']")).size());

        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
        int i=1;
        for(i=1;i<5;i++) {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

        }
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"6 Adult");
        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

        Thread.sleep(2000L);
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

    }
}
