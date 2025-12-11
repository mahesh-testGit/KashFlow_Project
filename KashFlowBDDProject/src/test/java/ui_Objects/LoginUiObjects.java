package ui_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginUiObjects {
    //private WebDriver driver;


    private WebElement username;
    private WebElement password;
    private WebElement btnLogin;
    private WebElement wordone;
    private WebElement wordtwo;
    private WebElement wordthree;
    private WebElement btnContinue;



    public LoginUiObjects(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        username=driver.findElement(By.xpath("(//input[@class='app-input'])[1]"));
        password=driver.findElement(By.xpath("(//input[@class='app-input'])[2]"));
        btnLogin=driver.findElement(By.xpath("//button[@type='submit']"));
        wordone=driver.findElement(By.id("wordOne"));
        wordtwo=driver.findElement(By.id("wordTwo"));
        wordthree=driver.findElement(By.xpath("//input[@formcontrolname='wordThree']"));
        btnContinue=driver.findElement(By.xpath("//button[text()='Continue']"));
    }


    //Step Implementation

    public void setCred()
    {
        // BaseClass.waitForVisible((By) username);
        username.sendKeys("regression.user4");
        password.sendKeys("KashFlow");
    }

    public void clickOnLogin() throws InterruptedException {
        btnLogin.click();
        //BaseClass.waitForVisible((By) wordone);
        wordone.sendKeys("a");
        Thread.sleep(2000);
        wordtwo.sendKeys("a");
        Thread.sleep(2000);
        wordthree.sendKeys("a");
        Thread.sleep(2000);
        btnContinue.click();
        Thread.sleep(2000);
    }

}
