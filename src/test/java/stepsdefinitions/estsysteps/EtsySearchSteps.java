package stepsdefinitions.estsysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsypages.EtsyHomepage;
import utilis.DriverHelper;

public class EtsySearchSteps {
WebDriver driver= DriverHelper.getDriver();
EtsyHomepage etsyHomepage= new EtsyHomepage(driver);
    @Given("the user naviagete to {string}")
    public void the_user_naviagete_to(String url) {
       driver.navigate().to(url);
    }
    @When("the user searches with {string}")
    public void the_user_searches_with(String  value) {
      etsyHomepage.sendSearchKeys(value);
    }
    @Then("the user validate the title {string}")
    public void the_user_validate_the_title(String excpectedTtile) {
        Assert.assertEquals(driver.getTitle(),excpectedTtile);
    }

}
