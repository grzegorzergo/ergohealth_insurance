package PageObjects;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SummaryPage extends BasePage {


    public SummaryPage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//button[contains(.,'Bestätigen & übermitteln')]")
    private WebElement ButtonSendApplication;

    public void userFinallySendApplication(){
        Assert.assertTrue(ButtonSendApplication.isDisplayed());
        ButtonSendApplication.click();
        log().info("user clicked on button \"Bestätigen & übermitteln\"");
    }




}
