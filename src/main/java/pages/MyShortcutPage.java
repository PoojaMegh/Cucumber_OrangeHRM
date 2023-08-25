package pages;

import base.ControlActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyShortcutPage extends ControlActions {

    @FindBy(css = "my-shortcut div.shortcut-panel-body>div")
    private List<WebElement> listOfShortcut;

    public MyShortcutPage(){
        PageFactory.initElements(driver, this);
    }

    public int getShortcutCount(){
        return getListOfElementCount(listOfShortcut);
    }
}
