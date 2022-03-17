package pages.openMrsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsLoginPage {
    public OpenMrsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    @FindBy(id = "username")
   private WebElement username;
    @FindBy(id="password")
   private WebElement password;
    @FindBy(id="Inpatient Ward")
   private WebElement InpatientwardButton;
    @FindBy(id="loginButton")
   private WebElement loginButton;

    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        InpatientwardButton.click();
        loginButton.click();
    }


}
