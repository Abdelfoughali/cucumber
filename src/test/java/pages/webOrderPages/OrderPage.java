package pages.webOrderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilis.BrowseUtilis;

import java.awt.*;

public class OrderPage {

    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="ConfirmAddressID")
    private WebElement deleiveryOptions;
    @FindBy(xpath = "//label[@class='custom-control-label']")
    private WebElement groupOrderBox;
    @FindBy(id="getAddressNextButton")
    private WebElement nextButton;

public void getDeliveryOption(String option){
    BrowseUtilis.selectBy(deleiveryOptions,option,"text");
//    Select select= new Select(deleiveryOptions);
//    select.selectByVisibleText("Office");


}
public void clickGroupOrder(){
    groupOrderBox.click();
}
public void clickNextButton(){
    nextButton.click();
}

}
