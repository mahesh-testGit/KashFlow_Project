package come.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui_Objects.BaseClass;
import ui_Objects.LoginUiObjects;
import ui_Objects.MemorableWordUiObject;


import java.util.concurrent.TimeUnit;

public class KashFlowLoginStepdefs {

    public LoginUiObjects loginUiObjects;
    public MemorableWordUiObject memorableWordUiObject;
    public WebDriver driver;
    public BaseClass baseClass;


    @Given("I lunch the kash flow application")
    public void i_lunch_the_kash_flow_application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://feature06-app.kashflow.com/v3/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginUiObjects = new LoginUiObjects(driver);
    }

    @When("I user enters username and password")
    public void i_user_enters_username_and_password() {
        loginUiObjects.setCred();
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        loginUiObjects.clickOnLogin();
    }

    @And("I enter Memorable word and click on continue")
    public void iEnterMemorableWordAndClickOnContinue() {
        memorableWordUiObject = new MemorableWordUiObject(driver);
        memorableWordUiObject.enterWords();
    }
//
//    @When("I click on login button")
//    public void i_click_on_login_button() throws InterruptedException {
//        loginUiObjects.clickOnLogin();
//    }
//
//    @Then("I verify kash flow home page is loaded")
//    public void i_verify_kash_flow_home_page_is_loaded() {
//        boolean value=driver.findElement(By.xpath("//div[@class='logo user-logo-icon']")).isDisplayed();
//        Assert.isTrue(value,"Dashboard page is not displayed");
//    }


}
