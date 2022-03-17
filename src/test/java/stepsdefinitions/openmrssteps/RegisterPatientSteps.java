package stepsdefinitions.openmrssteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.openMrsPages.OpenMRSMainPage;
import pages.openMrsPages.OpenMrsLoginPage;
import pages.openMrsPages.OpenMrsRegisterPage;
import utilis.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
WebDriver driver= DriverHelper.getDriver();
OpenMrsLoginPage openMrsLoginPage= new OpenMrsLoginPage(driver);
OpenMRSMainPage openMRSMainPage= new OpenMRSMainPage(driver);
OpenMrsRegisterPage openMrsRegisterPage= new OpenMrsRegisterPage(driver);

    @Given("the user logs into OpensMrs with following credentials")
    public void the_user_logs_into_opens_mrs_with_following_credentials(DataTable dataTable) {
        // you should know that:datatable will come  as a parameter when you provide data table in
        // the feature file and delete the first part of the database and import it


       Map<String,String> usernamePaswordMap=dataTable.asMap();// this is the connection between the datatable and the feature file
//      String name=  usernamePaswordMap.get("username");
//      String password=usernamePaswordMap.get("password");
//        System.out.println(name);
//        System.out.println(password);

        openMrsLoginPage.login(usernamePaswordMap.get("username"),usernamePaswordMap.get("password"));

    }
    @When("the user register a a patient with following information:")
    public void the_user_register_a_a_patient_with_following_information(DataTable dataTable) throws InterruptedException {
        Map<String,String> patientInfoMap=dataTable.asMap();
        openMRSMainPage.clickRegisterPatientButton();
        openMrsRegisterPage.sendName(patientInfoMap.get("GivenName"),patientInfoMap.get("FamilyName"));
        openMrsRegisterPage.sendGender(patientInfoMap.get("Gender"));
        openMrsRegisterPage.sendBirthDate(patientInfoMap.get("Day"),patientInfoMap.get("Month"),patientInfoMap.get("Year"));
openMrsRegisterPage.sendAdress(patientInfoMap.get("Address"));
openMrsRegisterPage.sendphoneNumber(patientInfoMap.get("PhoneNumber"));
openMrsRegisterPage.sendRelativeInfo(patientInfoMap.get("Relative"),patientInfoMap.get("RelativeName"));
openMrsRegisterPage.clickConfirmButton();
    }
    @Then("the user validate the patient name and familyName")
    public void the_user_validate_the_patient_name_and_family_name(DataTable dataTable) {
        Map<String,String> validateNameMap=dataTable.asMap();
        Assert.assertEquals(validateNameMap.get("GivenName"),openMrsRegisterPage.getGivenName());
        Assert.assertEquals(validateNameMap.get("Familly"),openMrsRegisterPage.getfamilyname());
    }


}
