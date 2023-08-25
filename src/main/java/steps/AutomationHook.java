package steps;

import base.ControlActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AutomationHook {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Before Scenario..... " + scenario.getName());
        ControlActions.start();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.attach(ControlActions.takeScreenShot(), "image/jpeg", "failed_" + scenario.getName());
        }
        System.out.println("Scenario Passed....");
        System.out.println("After Scenario.....");
        ControlActions.closeBrowser();
    }
}
