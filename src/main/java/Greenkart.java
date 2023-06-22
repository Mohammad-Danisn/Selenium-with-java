import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Greenkart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        String[] names= {"Cucumber","Brocolli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> products= (List<WebElement>) driver.findElements(By.cssSelector("h4.product-name"));

        for (int i=0;i< products.size();i++)
        {
            String name = products.get(i).getText();
            if(name.contains("Cucumber"));
            {
                //click on add to card
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }

        }


       //Cucumber
        driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/../div[3]/button")).click();

        String text="//h4[text()='Brocolli - 1 Kg']/../div[2]/a[2]";
        for(int i=1; i<5; i++) {
            driver.findElement(By.xpath(text)).click();
        }
        //Brocolli
        driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']/../div[3]/button")).click();


    }

}
