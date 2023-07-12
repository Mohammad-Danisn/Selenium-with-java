package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverAction {
    public static void main(String[] args) throws InterruptedException {

        //Lounch Chrome Browser
        System.setProperty("webdriver.gecko.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\geckodriver1.exe");
        WebDriver driver = new FirefoxDriver();

        //Maxmizes the browser
        driver.manage().window().maximize();

        //open URL
        driver.get("https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/");

        WebElement element = driver.findElement(By.xpath("//li[@id='technology-menu']/a"));
        Actions act =new Actions(driver);
        act.moveToElement(element).perform();

        Thread.sleep(8000);

        //String xpath_Image = "//img[contains(@class,'logo')]";
        //@FindBy(xpath = xpath_Image)
        //WebElement img;

        WebElement element1 =driver.findElement(By.xpath("//li[@id='social-commerce-menu']/a"));
        Actions act2 = new Actions(driver);
        act2.moveToElement(element1).perform();


        //Scroll Down
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1000)");


        //Zoom In
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom ='300%'");


        Thread.sleep(5000);
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom ='33%'");


        Thread.sleep(5000);
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom ='100%'");




        /*//Open URL


        public final String xpath_SpiritLogoImage = "//img[contains(@class,'logo')]";
	    @FindBy(xpath = xpath_SpiritLogoImage)
	    private WebElement img_SpiritLogo;


        driver.get("https://www.ebay.in/");
        WebElement element = driver.findElement(By.linkText("Shipping"));

        Actions act =new Actions(driver);
        act.moveToElement(element).perform();   //   moveToElement() for mouse over action


        Thread.sleep(8000);

        WebElement element1 = driver.findElement(By.linkText("Payments & Fees"));
        act.moveToElement(element1).perform();
*/


    }
}
