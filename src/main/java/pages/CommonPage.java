package pages;

import base.ControlActions;
import org.openqa.selenium.WebElement;

public class CommonPage extends ControlActions {

    public boolean isElementDisplayedByText(String elementText){
        String locator = "//label[contains(text(),'"+elementText+"')] | //a[contains(text(),'"+elementText+"')] | //span[contains(text(),'"+elementText+"')] | //div[contains(text(),'"+elementText+"')]";
        return isElementDisplayed("XPATH", locator, true);
    }

    public void replaceTextIntoFeild(String textToBeSent, WebElement element){
       replaceText(textToBeSent, element);
    }
}
