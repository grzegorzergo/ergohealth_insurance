package PageObjects;

import jdk.jfr.Name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.w3c.dom.NameList;
import DataFileReader.ExcelSheetReader;
import DataFileReader.SheetDataReader;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.logging.Logger;

public class FormPage extends BasePage {


    private Object LinkedList;

    public FormPage(WebDriver driver) {
        super(driver);
    }


    /**
     * below, all fields from greencard form
     */

    @FindBy(id = "name-input")
    private WebElement NameField;

    @FindBy(id = "second-name-input")
    private WebElement SecondNameField;

    @FindBy(id = "dob-input")
    private WebElement BornDateDataPicker;

    @FindBy(id = "email-input")
    private WebElement EmailAddressField;

    @FindBy(id = "select-address.country")
    private WebElement CountryListDropDown;

    @FindBy(xpath = "//*[@id=\"menu-address.country\"]/div[3]/ul/li")
    private List<WebElement> ListOfCountries;

    @FindBy(id = "plz-input")
    private WebElement PostCodeField;

    @FindBy(id = "location-input")
    private WebElement CityField;

    @FindBy(id = "road-input")
    private WebElement StreetField;

    @FindBy(id = "insurance-nr-input")
    private WebElement InsuranceNumberField;

    @FindBy(className = "jss205 jss490")
    private WebElement MessageWithThanks;

    /**
     * below all buttons from greencard page
     */

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement ButtonSubmitGreenCardForm;


    public void userEntersHisName() {
        Assert.assertTrue(NameField.isDisplayed());
        NameField.clear();
        NameField.sendKeys("Andrzej");
        log().info("user fills in the \"Vorname\" field");

    }

    public void userEntersHisSecondName() {
        Assert.assertTrue(SecondNameField.isDisplayed());
        SecondNameField.clear();
        SecondNameField.sendKeys("Testowy");
        log().info("user fills in the \"Nachname\" field");
    }


    public void userEntersHisBornDate() {
        Assert.assertTrue(BornDateDataPicker.isDisplayed());
        BornDateDataPicker.clear();
        BornDateDataPicker.sendKeys("23.07.1996");
        log().info("user fills in the \"Geburtsdatum\" field");

    }

    public void userEntersHisEmailAddress() {
        Assert.assertTrue(EmailAddressField.isDisplayed());
        EmailAddressField.clear();
        EmailAddressField.sendKeys("Grzegorz.Chlopek.extern@ergo.digital");
        log().info("user fills in the \"E-mail\" field");
    }


    public void userEntersHisPostalCode() {
        Assert.assertTrue(PostCodeField.isDisplayed());
        PostCodeField.clear();
        PostCodeField.sendKeys("91729");
        log().info("user fills in the \"PLZ\" field");
    }


    public void userEntersHisCity() {
        Assert.assertTrue(CityField.isDisplayed());
        CityField.clear();
        CityField.sendKeys("Haundorf");
        log().info("user fills in the \"Ort\" field");
    }

    public void userEntersHisStreet() {
        Assert.assertTrue(StreetField.isDisplayed());
        StreetField.clear();
        StreetField.sendKeys("Klingleinsberg 20");
        log().info("user fills in the \"Straße, Hausnummer\" field");
    }

    public void userEntersHisInsuranceNumber() {
        Assert.assertTrue(InsuranceNumberField.isDisplayed());
        InsuranceNumberField.clear();
        InsuranceNumberField.sendKeys("1039876543219");
        log().info("user fills in the \"Versicherungsnummer\" field");
    }


    public void userClickOnButtonSendForm() {
        Assert.assertTrue(ButtonSubmitGreenCardForm.isDisplayed());
        ButtonSubmitGreenCardForm.click();
        log().info("user click on button \"Jetzt identifizieren\"");
        Assert.assertTrue(MessageWithThanks.isDisplayed());
        log().info("Assertion to display gratitude on the next page");
    }


/*
    public void userChooseHisOwnCountry() {
        CountryListDropDown.click();
        ListOfCountries.get(2).click();
*/






}



