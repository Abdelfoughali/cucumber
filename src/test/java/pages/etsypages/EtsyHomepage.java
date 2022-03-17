package pages.etsypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.image.Kernel;

public class EtsyHomepage {
    public EtsyHomepage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    @FindBy(id="global-enhancements-search-query")
    private WebElement searchBox;

    public void sendSearchKeys(String seacrchValue){
        searchBox.sendKeys(seacrchValue, Keys.ENTER);
    }

}
