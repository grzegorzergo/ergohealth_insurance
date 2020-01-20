package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(.,'Jetzt beantragen')]")
    private WebElement ButtonApplyNow;

    public void userClickedOnButtonApplyNow(){
        Assert.assertTrue(ButtonApplyNow.isDisplayed());
        ButtonApplyNow.click();
        log().info("clicked on button \"Jetzt beantragen\"");

    }


}
