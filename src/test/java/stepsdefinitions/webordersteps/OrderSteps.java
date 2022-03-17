package stepsdefinitions.webordersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.webOrderPages.CreateGroupOrderPage;
import pages.webOrderPages.Loginpage;
import pages.webOrderPages.OrderPage;
import utilis.ConfiReader;
import utilis.DriverHelper;

public class OrderSteps {
    WebDriver driver= DriverHelper.getDriver();
Loginpage loginpage= new Loginpage(driver);
OrderPage orderPage= new OrderPage(driver);
CreateGroupOrderPage createGroupOrderPage= new CreateGroupOrderPage(driver);
    @Given("The user is on the web order homepage")
    public void the_user_is_on_the_web_order_homepage() {
    driver.navigate().to(ConfiReader.readProperty("weborderurl"));
    loginpage.login(ConfiReader.readProperty("weborderusername"),ConfiReader.readProperty("weborderpassword"));
    }
    @When("the user selects {string} options")
    public void the_user_selects_options(String deliveryOption) {
orderPage.getDeliveryOption(deliveryOption);
    }
    @And("the user is on the groupOrderPage")
    public void the_user_is_on_the_group_order_page() {
        orderPage.clickGroupOrder();
        orderPage.clickNextButton();
        Assert.assertEquals(driver.getTitle(),"Create Group Order - Weborder");
    }
    @And("the user sends invitatees note {string}")
    public void the_user_sends_invitatees_note(String inviteNote) {
createGroupOrderPage.sendInviteNote(inviteNote);
    }
    @When("the user send invite list {string} and {string}")
    public void the_user_send_invite_list_and(String email1, String email2) throws InterruptedException {
createGroupOrderPage.sendInviteList(email1+","+email2);
//createGroupOrderPage.clickCreateGroupButton();

    }
    @And("the user validates the {string} adress")
    public void the_user_validates_the_adress(String  expectedAdress) throws InterruptedException {
Assert.assertTrue(createGroupOrderPage.getOfficeAdress().contains(expectedAdress));
    }
    @And("the user validates {string} text")
    public void the_user_validates_text(String expectedText) throws InterruptedException {
createGroupOrderPage.clickCreateGroupButton();
Thread.sleep(1000);
Assert.assertEquals(createGroupOrderPage.getHeaderText(),expectedText);
    }
    @And("the user validates total particaipants is {int}")
    public void the_user_validates_total_particaipants_is(Integer expectwedParticipant) throws InterruptedException {
        Assert.assertEquals(createGroupOrderPage.getParticipant(),expectwedParticipant);

    }



}
