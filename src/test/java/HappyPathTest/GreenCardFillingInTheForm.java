package HappyPathTest;

import DataFileReader.ClassDataProvider;
import DataFileReader.ExcelSheetReader;
import DataFileReader.SheetDataReader;
import PageObjects.FormPage;
import PageObjects.HomePage;
import PageObjects.SummaryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Navigation.ApplicationURLs.applicationUrl;

public class GreenCardFillingInTheForm {
    private WebDriver driver;



    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(applicationUrl);
    }

    @Test

    public void userTypedDataOnForm() {
        HomePage homePage = new HomePage(driver);
        homePage.userClickedOnButtonApplyNow();
        FormPage formPage = new FormPage(driver);
        formPage.userEntersHisName();
        formPage.userEntersHisSecondName();
        formPage.userEntersHisBornDate();
        formPage.userEntersHisEmailAddress();
        formPage.userEntersHisPostalCode();
        formPage.userEntersHisCity();
        formPage.userEntersHisStreet();
        formPage.userEntersHisInsuranceNumber();
        formPage.userClickOnButtonSendForm();
        SummaryPage summaryPage = new SummaryPage(driver);
        summaryPage.userFinallySendApplication();
        summaryPage.userFinallySendApplication();




    }


/*       @AfterMethod
        public void afterTest () {
            driver.close();
            driver.quit();

        }*/
}


