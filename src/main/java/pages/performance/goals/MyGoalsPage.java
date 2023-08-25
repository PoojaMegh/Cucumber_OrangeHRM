package pages.performance.goals;

import base.ControlActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyGoalsPage extends ControlActions {

    @FindBy(xpath = "//span[text()='Create Goal']")
    private WebElement createGoalBtn;

    @FindBy(css = "input#name_value")
    private WebElement goalNameElement;

    public MyGoalsPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnCreateGoalButton(){
        clickOnElement(createGoalBtn, true);
    }


//    public void setGoalDescription(String goalDescription){
//        switchToIFrame();
//    }

}
