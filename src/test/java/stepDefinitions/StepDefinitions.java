package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.BusinessInformationPage;
import pages.BusinessPage;
import pages.FashionRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;


public class StepDefinitions {

    FashionRegistrationPage fashionRegistrationPage = new FashionRegistrationPage();
    BusinessInformationPage businessInformationPage = new BusinessInformationPage();
    BusinessPage businessPage = new BusinessPage();

    Faker faker=new Faker();

    @Given("User visits {string}")
    public void user_visits(String string) {
        Driver.getDriver().get(string);
    }

    @Then("User fills the fields")
    public void user_fills_the_fields() {
        fashionRegistrationPage.clickFirstNameBox.click();
        fashionRegistrationPage.firstNameBox.sendKeys(ConfigReader.getProperty("username"));
        fashionRegistrationPage.clickLastNameBox.click();
        fashionRegistrationPage.lastNameBox.sendKeys(ConfigReader.getProperty("lastname"));
        fashionRegistrationPage.clickEmailBox.click();
        fashionRegistrationPage.emailBox.sendKeys(faker.internet().emailAddress());
        fashionRegistrationPage.clickpasswordBox.click();
        fashionRegistrationPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        fashionRegistrationPage.clickconfirmPasswordBox.click();
        fashionRegistrationPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Clicks signup button")
    public void clicks_signup_button() {
        fashionRegistrationPage.signupButton.click();
    }

    @Then("User fills out business information fields")
    public void user_fills_out_business_information_fields() {


        businessInformationPage.clickCompanyName.click();
        businessInformationPage.companyNameBox.sendKeys(ConfigReader.getProperty("company"));

        businessInformationPage.industry.click();
        businessInformationPage.beautyItem.click();

        businessInformationPage.clickphoneNumber.click();
        businessInformationPage.phoneNumber.sendKeys(ConfigReader.getProperty("phone"));
    }

    @Then("Clicks submit button")
    public void clicks_submit_button() {
        businessInformationPage.submitButton.click();
    }

    @Then("Use clicks on Get Started")
    public void use_clicks_on_get_started() throws InterruptedException {
        Thread.sleep(5000);
        businessInformationPage.letsStartButton.click();
    }

    @Then("Verifies following apps are present on dashboard:Transactions,Checkout,Connect,Products,Shop,Blog,Settings")
    public void verifies_following_apps_are_present_on_dashboard_transactions_checkout_connect_products_shop_blog_settings() {

        Assert.assertEquals(businessPage.transactionsApp.getText(), "Transactions");
        Assert.assertEquals(businessPage.checkoutApp.getText(), "Checkout");
        Assert.assertEquals(businessPage.connectApp.getText(), "Connect");
        Assert.assertEquals(businessPage.productsApp.getText(), "Products");
        Assert.assertEquals(businessPage.shopApp.getText(), "Shop");
        Assert.assertEquals(businessPage.blogApp.getText(), "Blog");
        Assert.assertEquals(businessPage.settingsApp.getText(), "Settings");
    }

    @Then("User fills out business information fields for Santander")
    public void user_fills_out_business_information_fields_for_Santander() {

        businessInformationPage.clickCompanyName.click();
        businessInformationPage.companyNameBox.sendKeys(ConfigReader.getProperty("company"));

        businessInformationPage.industry2.click();
        businessInformationPage.beautyItem.click();

        businessInformationPage.clickphoneNumber.click();
        businessInformationPage.phoneNumber.sendKeys(ConfigReader.getProperty("phone"));

        businessInformationPage.clickVatNumber.click();
        businessInformationPage.VatNumber.sendKeys("IE1234567T");
    }
    @Then("Verifies following apps are present on dashboard:Checkout,Connect,Point Of Sale,Settings")
    public void verifies_following_apps_are_present_on_dashboard_checkout_connect_point_of_sale_settings() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(businessPage.checkoutApp.getText(), "Checkout");
        Assert.assertEquals(businessPage.connectApp.getText(), "Connect");
        Assert.assertEquals(businessPage.PointOfSaleApp.getText(), "Point of Sale");
        Assert.assertEquals(businessPage.settingsApp.getText(), "Settings");

    }

}



