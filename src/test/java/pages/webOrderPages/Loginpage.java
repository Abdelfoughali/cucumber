package pages.webOrderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="Email")
 private    WebElement username;
    @FindBy(id="Password")
   private WebElement password;
    @FindBy(xpath = "//button[.='Sign In']")
   private WebElement signButton;
    @FindBy(xpath = "//div[contains(text(),'Sign in Failed')]")
    private  WebElement errorMesage;

    public  void login(String username,String password){
        this.username.clear();
        this.password.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.signButton.submit();

    }
public boolean getErroMessage(String errorMessage){
        return this.errorMesage.getText().trim().equals(errorMessage);
}




}
