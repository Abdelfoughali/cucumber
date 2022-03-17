package stepsdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.webOrderPages.Loginpage;
import utilis.ConfiReader;
import utilis.DriverHelper;

public class LoginPagesSteps {
WebDriver driver= DriverHelper.getDriver();
Loginpage loginpage= new Loginpage(driver);

    @Given("the user navigate to the webOrder website")
    public void the_user_navigate_to_the_web_order_website() {
       driver.navigate().to(ConfiReader.readProperty("weborderurl"));
    }
    @When("the user provides credentials")
    public void the_user_provides_credentials() {
loginpage.login(ConfiReader.readProperty("weborderusername"),ConfiReader.readProperty("weborderpassword"));
    }
    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Assert.assertEquals(driver.getTitle(),"ORDER DETAILS - Weborder");

    }
    @When("the user provides correct user name and wrong password")
    public void the_user_provides_correct_user_name_and_wrong_password() {
        loginpage.login(ConfiReader.readProperty("weborderusername"),"wrongpassword");
    }
    @Then("the user validates {string} error message")
    public void the_user_validates_error_message(String ExpectedMessage) {
        Assert.assertTrue(loginpage.getErroMessage(ExpectedMessage));

    }


//    @When("the user provides wrong user name and  password")  // this is hard coding it
//    public void the_user_provides_wrong_user_name_and_password() {
//loginpage.login("jafar","foughali");
//    }


    @When("the user provides wrong {string} and  {string}")
    public void the_user_provides_wrong_and(String usename, String password) {
        loginpage.login(usename,password);

    }
    @When("the user provides wrong  username and  password")
    public void the_user_provides_wrong_username_and_password() {
       loginpage.login("","");
    }



}
