package stepsdefinitions.productssteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.productspages.ProductLoginPage;
import pages.productspages.ProductMainPage;
import pages.productspages.ProductOrderPage;
import utilis.ConfiReader;
import utilis.DriverHelper;

public class ProductOrderSteprs {
    WebDriver driver= DriverHelper.getDriver();
ProductLoginPage productLoginPage= new ProductLoginPage(driver);
ProductMainPage productMainPage= new ProductMainPage(driver);
ProductOrderPage productOrderPage= new ProductOrderPage(driver);
    @Given("the user navigate to product website homepage and click orderButton")
    public void the_user_navigate_to_product_website_homepage_and_click_order_button() {
productLoginPage.login(ConfiReader.readProperty("productusername"),ConfiReader.readProperty("productpassword"));
productMainPage.clickOrdrButton();

    }
    @When("the user enters the products information {string} and {string}")
    public void the_user_enters_the_products_information_and(String prroductName, String quantity) {
productOrderPage.sendProductInfo(prroductName,quantity);
    }
    @When("the user enters the adress information {string},{string},{string},{string},{string}")
    public void the_user_enters_the_adress_information(String custumerName, String street, String city, String state, String zipCode) throws InterruptedException {
productOrderPage.senAdressInformation(custumerName,street,city,state,zipCode);



    }
    @When("the user enter the card information {string},{string},{string}")
    public void the_user_enter_the_card_information(String cardTpe, String cardNumber, String expireDate) {
        productOrderPage.selectCard(cardTpe);
        productOrderPage.sendPayementInformation(cardNumber,expireDate);
    }


    @Then("the user validate success message")
    public void the_user_validate_success_message() {

        productOrderPage.clickProcessButton();
        Assert.assertEquals("New order has been successfully added.",productOrderPage.getSuccesMessage());

    }
    @Then("the user vslidates products details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_user_vslidates_products_details(String custumerName, String ProductName, String quantity,
                                                    String street, String city, String state, String  zipcode, String cardtype, String  cardNumber, String expiredate) {
productMainPage.clickViewAllOrderButton();
productOrderPage.getInfo(custumerName,ProductName,quantity,street,city,state,zipcode,cardtype,cardNumber,expiredate);
    }
}
