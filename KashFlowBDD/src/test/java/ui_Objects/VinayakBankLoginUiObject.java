package ui_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class VinayakBankLoginUiObject {

    public static WebDriverWait wait;
    private WebElement username1;
    private WebElement password1;
    private WebElement btnLogin1;


    public VinayakBankLoginUiObject(WebDriver driver) throws InterruptedException {
        Thread.sleep(15000);
        password1=driver.findElement(By.xpath("//input[@type='password']"));
        btnLogin1=driver.findElement(By.xpath("//button[text()='Login']"));
        username1=driver.findElement(By.xpath("//span[@class='input-text']/input"));
    }

    public void setCredVinyakBank()
    {
        username1.sendKeys("admin");
        password1.sendKeys("Admin@123");
    }


    public void clickOnLoginVinaykBank(){
        btnLogin1.click();
    }

}
