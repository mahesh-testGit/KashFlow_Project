package ui_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemorableWordUiObject {

    private WebElement wordone;
    private WebElement wordtwo;
    private WebElement wordthree;
    private WebElement btnContinue;



    public MemorableWordUiObject(WebDriver driver)
    {
        //Create new page for this locator that's why it failing
        wordone=driver.findElement(By.id("wordOne"));
        wordtwo=driver.findElement(By.id("wordTwo"));
        wordthree=driver.findElement(By.xpath("//input[@formcontrolname='wordThree']"));
        btnContinue=driver.findElement(By.xpath("//button[text()='Continue']"));
    }

    public void enterWords()
    {
        //BaseClass.waitForVisible((By) wordone);
        wordone.sendKeys("a");

        wordtwo.sendKeys("a");

        wordthree.sendKeys("a");

        btnContinue.click();

    }
}
