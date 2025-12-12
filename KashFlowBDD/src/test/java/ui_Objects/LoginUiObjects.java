package ui_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginUiObjects extends BaseClass {

    //private WebDriver driver;


    private WebElement username;
    private WebElement password;
    private WebElement btnLogin;

   public LoginUiObjects(WebDriver driver)
   {
      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       username=driver.findElement(By.xpath("(//input[@class='app-input'])[1]"));
       password=driver.findElement(By.xpath("(//input[@class='app-input'])[2]"));
       btnLogin=driver.findElement(By.xpath("//button[@type='submit']"));
   }

    //Step Implementation

  public void setCred()
  {
     // BaseClass.waitForVisible((By) username);
      username.sendKeys("regression.user4");
      password.sendKeys("KashFlow");
  }

  public void clickOnLogin() {
    btnLogin.click();
 }


}
