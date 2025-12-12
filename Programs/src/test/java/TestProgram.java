import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestProgram {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\mahesh\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("www.amazon.in");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
        search.sendKeys("//input[@aria-label='Search Amazon.in']");
        search.sendKeys(Keys.ENTER);

        //Click on Dell
        driver.findElement(By.xpath("//span[text()='Dell']")).click();

        //Click on Screen size
        driver.findElement(By.xpath("//span[text()='22.0 to 25.9 in']")).click();

        //Click on Resolution Standerd
        driver.findElement(By.xpath("//span[text()='FHD 1080p']")).click();

        //select the result
        driver.findElement(By.xpath("//span[contains(text(),'Dell S2421HNM 23.8\" (60.5cm)')]")).click();

        //Add item to the card
        driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();

    }
}
