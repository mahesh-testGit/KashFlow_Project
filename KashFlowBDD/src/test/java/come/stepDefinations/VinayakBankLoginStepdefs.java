package come.stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui_Objects.VinayakBankLoginUiObject;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class VinayakBankLoginStepdefs {
    public VinayakBankLoginUiObject vinayakBankLoginUiObject;
    public WebDriver driver;
    public static WebDriverWait wait;

    @Given("I lunch the vinayak bank application")
    public void i_lunch_the_vinayak_bank_application() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://personal-y8y51lzp.outsystemscloud.com/VinayakCooprativeSociety/Login");
        driver.manage().window().maximize();

        vinayakBankLoginUiObject=new VinayakBankLoginUiObject(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @When("I enter username and password on the vinayak bank application")
    public void i_enter_username_and_password_on_the_vinayak_bank_application() {
        vinayakBankLoginUiObject.setCredVinyakBank();
    }
    @When("I click on login button on the vinayak bank application")
    public void i_click_on_login_button_on_the_vinayak_bank_application() {
        vinayakBankLoginUiObject.clickOnLoginVinaykBank();
    }
    @Then("I verify vinayak bank home page is loaded")
    public void i_verify_vinayak_bank_home_page_is_loaded() {
    }

}
