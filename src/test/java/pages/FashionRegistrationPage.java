package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FashionRegistrationPage {
            public FashionRegistrationPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

    @FindBy(xpath = "//*[@class='ng-tns-c170-1 ng-star-inserted']")
    public WebElement clickFirstNameBox;
    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@class='ng-tns-c170-2 ng-star-inserted']")
    public WebElement clickLastNameBox;
    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@class='ng-tns-c170-3 ng-star-inserted']")
    public WebElement clickEmailBox;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@class='ng-tns-c170-4 ng-star-inserted']")
    public WebElement clickpasswordBox;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@class='ng-tns-c170-5 ng-star-inserted']")
    public WebElement clickconfirmPasswordBox;

    @FindBy(xpath = "//input[@formcontrolname='confirmPass']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@class='signup-button']")
    public WebElement signupButton;





}
