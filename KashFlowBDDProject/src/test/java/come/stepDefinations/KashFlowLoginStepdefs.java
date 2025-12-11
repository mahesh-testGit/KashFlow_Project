package come.stepDefinations;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui_Objects.LoginUiObjects;

import java.util.concurrent.TimeUnit;

public class KashFlowLoginStepdefs {
    WebDriver driver;
    public LoginUiObjects loginUiObjects;

    @Given("I lunch the kash flow application")
    public void i_lunch_the_kash_flow_application() {
        // LunchApplication();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
//        driver.get("https://personal-y8y51lzp.outsystemscloud.com/VinayakCooprativeSociety/Login");

        // Set path to chromedriver.exe
        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\IdeaProjects\\KashFlowBDD\\Drivers\\chromedriver.exe");

        // Create ChromeDriver object
        //   driver = new ChromeDriver();
        driver.get("https://feature06-app.kashflow.com/v3/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginUiObjects=new LoginUiObjects(driver);
    }
    @When("I user enters username and password")
    public void i_user_enters_username_and_password() {
        loginUiObjects.setCred();
    }
    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        loginUiObjects.clickOnLogin();
    }
    @Then("I verify kash flow home page is loaded")
    public void i_verify_kash_flow_home_page_is_loaded() {
        boolean value=driver.findElement(By.xpath("//div[@class='logo user-logo-icon']")).isDisplayed();
        Assert.isTrue(value,"Dashboard page is not displayed");
    }


}
