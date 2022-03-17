package pages.webOrderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.BrowseUtilis;

public class CreateGroupOrderPage {
    public CreateGroupOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="InviteNote")
    private WebElement inviteNote;
    @FindBy (id="InviteList")
    private WebElement inviteList;
    @FindBy(id = "addressPreview")
    private WebElement ofiiceAdress;
    @FindBy(id="createGroupOrder")
    private WebElement createGroupButton;
    @FindBy(xpath = "//h1[.='View Group Order']")
    private WebElement headerText;
    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
    private WebElement totalParticipants;

    public void sendInviteNote(String noteInviatation){
        inviteNote.sendKeys(noteInviatation);
    }
    public void sendInviteList(String invitationList){
        inviteList.sendKeys(invitationList);
    }
    public String getOfficeAdress() throws InterruptedException {
        Thread.sleep(4000);
        return ofiiceAdress.getText().trim();
    }
public void clickCreateGroupButton() throws InterruptedException {
    Thread.sleep(1000);
        createGroupButton.click();
}
public String getHeaderText() throws InterruptedException {
        Thread.sleep(1000);
    return headerText.getText();
}
public Integer  getParticipant() throws InterruptedException {
    Thread.sleep(1000);
  return Integer.parseInt(totalParticipants.getText());
}

}
