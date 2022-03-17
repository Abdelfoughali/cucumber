package pages.openMrsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.BrowseUtilis;

public class OpenMrsRegisterPage {
    public OpenMrsRegisterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(name="givenName")
    private WebElement givenName;
    @FindBy(name = "familyName")
    private WebElement familyName;
    @FindBy(id = "next-button")
    private WebElement nextButton;
    @FindBy(id="gender-field")
    private WebElement selectGender;//selectgender
    @FindBy(name = "birthdateDay")
    private WebElement birthDay;
    @FindBy(id="birthdateMonth-field")
    private WebElement SelectBirthMonth;
    @FindBy(xpath = "//input[@name='birthdateYear']")
    private WebElement birthYear;
    @FindBy(id="address1")
    private WebElement adress;
    @FindBy(name = "phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id="relationship_type")
    private WebElement relationType;
    @FindBy(xpath = "//input[@placeholder='Person Name']")
    private WebElement relativeName;
    @FindBy(id="submit")
    private WebElement confirmButton;
    @FindBy(xpath = "//span[@class='PersonName-givenName']")
           private WebElement validategivenName;
    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    private WebElement validatefamilyName;

    public void sendName(String name,String familyName){
        givenName.sendKeys(name);
        this.familyName.sendKeys(familyName);
        nextButton.click();
    }
public void sendGender(String gender) throws InterruptedException {
    BrowseUtilis.selectBy(selectGender,gender,"text");
    Thread.sleep(3000);
    nextButton.click();

}
public void sendBirthDate(String day, String month,String year) throws InterruptedException {
        birthDay.clear();
        birthDay.sendKeys(day);
        BrowseUtilis.selectBy(SelectBirthMonth,month,"text");
        birthYear.clear();
        birthYear.sendKeys(year);
    Thread.sleep(3000);
        nextButton.click();

}
public void sendAdress(String address) throws InterruptedException {
        this.adress.sendKeys(address);
    Thread.sleep(3000);
        nextButton.click();
}
public void sendphoneNumber(String phoneNumber) throws InterruptedException {
        this.phoneNumber.sendKeys(phoneNumber);
    Thread.sleep(3000);
        nextButton.click();
}
public void sendRelativeInfo(String relationType,String relativeName) throws InterruptedException {
        BrowseUtilis.selectBy(this.relationType,relationType,"text");
        this.relativeName.sendKeys(relativeName);
        Thread.sleep(3000);
        nextButton.click();
}
public void clickConfirmButton() throws InterruptedException {
        confirmButton.click();
        Thread.sleep(300);
}
public String getGivenName(){
        return validategivenName.getText().trim();
}
public String getfamilyname(){
        return  validatefamilyName.getText().trim();
}
}
