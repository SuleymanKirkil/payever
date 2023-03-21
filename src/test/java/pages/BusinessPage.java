package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BusinessPage {

    public BusinessPage() {
        PageFactory.initElements(Driver.getDriver(), this);    }
    @FindBy(xpath = "//div[@class='icons__link ng-star-inserted']")
    public List<WebElement> appList;

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkoutApp;
    @FindBy(xpath = "//*[text()='Transactions']")
    public WebElement transactionsApp;
    @FindBy(xpath = "//*[text()='Connect']")
    public WebElement connectApp;
    @FindBy(xpath = "//*[text()='Point of Sale']")
    public WebElement PointOfSaleApp;
    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productsApp;
    @FindBy(xpath = "//*[text()='Shop']")
    public WebElement shopApp;
    @FindBy(xpath = "//*[text()='Blog']")
    public WebElement blogApp;
    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsApp;









}

