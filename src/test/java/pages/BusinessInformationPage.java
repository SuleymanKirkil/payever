package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BusinessInformationPage {

    public BusinessInformationPage(){PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@formcontrolname='businessStatus']")
    public WebElement BusinessStatus;
    @FindBy(xpath = "//*[@class='arrow-open ng-tns-c212-7']")
    public WebElement BusinessStatusArrow;
    @FindBy(xpath = "//*[@class='dark peb-select-option border ng-star-inserted']")
    public WebElement soloStatus;
    @FindBy(xpath = "//*[text()=' Company name ']")
    public WebElement clickCompanyName;
    @FindBy(xpath = "//*[text()=' Company name ']//following::input")
    public WebElement companyNameBox;
    @FindBy(xpath = "//div[@class='ng-tns-c212-9 label-select-wrapper']")
    public WebElement status;
    @FindBy(xpath = "//*[text()=' Industry ']")
    public WebElement industry2;
    @FindBy(xpath = "//div[@class='ng-tns-c170-13 label-input-content-wrapper']")
    public WebElement industry;

    @FindBy(xpath = "//*[@class='autocomplete-option-item__label']")
    public WebElement beautyItem;

    @FindBy(xpath = "//*[text()=' Phone Number ']")
    public WebElement clickphoneNumber;

    @FindBy(xpath = "//*[text()=' Phone Number ']//following::input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//span[.=' VAT number ']")
    public WebElement clickVatNumber;
    @FindBy(xpath = "//span[.=' VAT number ']//following::input")
    public WebElement VatNumber;



    @FindBy(xpath = "//button[@class='signup-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='welcome-screen-content-button']")
    public WebElement letsStartButton;


}
