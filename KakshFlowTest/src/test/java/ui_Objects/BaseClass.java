package ui_Objects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public  WebDriver driver;
    public  WebDriverWait wait;

    //@BeforeClass
    public WebDriver LunchApplication()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://feature06-app.kashflow.com/v3/#/login");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }



//    public void waitForElement() {
//        for (int i = 0; i < 30; i++) {
//            try {
//                if (unallocatedApprovalQueueUIObject.btnFiltersOffSystemQueue.reloadElement().isDisplayed()) {
//                    unallocatedApprovalQueueUIObject.btnFiltersOffSystemQueue.reloadElement().click();
//                    break;
//                } else {
//                    WebDriverWaits.sleep(1000); // Wait for 1 second before retrying}
//                } catch(Exception e){
//
//                }
//            }
//        }
    //  }

}
