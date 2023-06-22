import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000l);

        int i=1;
        //while (i<5) {
          //  driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
           // i++;
       // }

        for(i=1;i<5;i++) {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

        }

        Thread.sleep(2000L);
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

    }
}
