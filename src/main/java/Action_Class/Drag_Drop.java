package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

    public static void main(String[] args) {

        //Lounch Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E:\\UdemySeleniumCourse\\Software\\DriverNotes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maxmizes the browser
        driver.manage().window().maximize();

        //Open URL
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //find Source and target web Element
        WebElement source = driver.findElement(By.id("box6"));  // Rome
        WebElement target = driver.findElement(By.id("box106"));  // Italy

        Actions act = new Actions(driver);

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act.dragAndDrop(source, target).perform();


        //find Source and target web Element
        WebElement source2 = driver.findElement(By.id("box7"));  // Madrid
        WebElement target2 = driver.findElement(By.id("box107"));  // Spain

        Actions act2 = new Actions(driver);

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act2.dragAndDrop(source2, target2).perform();


        //find Source and target web Element
        WebElement source3 = driver.findElement(By.id("box1"));  // Oslo
        WebElement target3 = driver.findElement(By.id("box101"));  // Norway

        Actions act3 = new Actions(driver);

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act3.dragAndDrop(source3, target3).perform();

        //find Source and target web Element
        WebElement source4 = driver.findElement(By.id("box4"));  // Copenhagen
        WebElement target4 = driver.findElement(By.id("box104"));  // Denmark

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act3.dragAndDrop(source4, target4).perform();

        //find Source and target web Element
        WebElement source5 = driver.findElement(By.id("box5"));  // Seoul
        WebElement target5 = driver.findElement(By.id("box105"));  // South Korea

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act3.dragAndDrop(source5, target5).perform();


        //find Source and target web Element
        WebElement source6 = driver.findElement(By.id("box2"));  // Stockholm
        WebElement target6 = driver.findElement(By.id("box102"));  // Sweden

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act3.dragAndDrop(source6, target6).perform();


        //find Source and target web Element
        WebElement source7 = driver.findElement(By.id("box3"));  // Washington
        WebElement target7 = driver.findElement(By.id("box103"));  // United States

        //Syntax (DragAndDrop(sourceElements, targetElements))
        act3.dragAndDrop(source7, target7).perform();


    }

}
