package steps;

import io.cucumber.java.en.And;
import pages.performance.goals.MyGoalsPage;

public class PerformanceGoalSteps {
    MyGoalsPage myGoalsPage = new MyGoalsPage();

    @And("user click on Create Goal button")
    public void userClickOnCreateGoalButton() {
        myGoalsPage.clickOnCreateGoalButton();
    }

    @And("user set text {string} into Goal Name")
    public void userSetTextIntoGoalName(String arg0) {
    }

//    @And("user set text {string} into Goal Description")
//    public void userSetTextIntoGoalDescription(String goalDescription) {
//        myGoalsPage.setGoalDescription();
//    }
}
