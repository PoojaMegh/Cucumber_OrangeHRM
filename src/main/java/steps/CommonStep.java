package steps;

import base.ControlActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.DashboardPage;
import pages.Navigations;

public class CommonStep extends ControlActions {
    CommonPage commonPage = new CommonPage();
    @When("user navigate to {string} dashboard left menu")
    public void userNavigateToEmployeeManagementDashboardLeftMenu(String leftMenu) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilDashboardPageIsLoaded();
        dashboardPage.clickOnDashboardLeftMenu(leftMenu);
    }


    @And("user navigate to {string} tab")
    public void userNavigateTo(String menu) {
        Navigations navigations = new Navigations();
        navigations
                .navigate_to(menu);
    }

    @When("user navigate to {string} icon")
    public void userNavigateToIcon(String icon) {
        Navigations navigations = new Navigations();
        navigations
                .navigate_icon(icon);
    }

    @Then("user validate {string} element is visible by text")
    public void userValidateElementIsVisibleByText(String elementText) {
        commonPage.isElementDisplayedByText(elementText);
    }

    @And("user mouse hover on {string} tab")
    public void userMouseHoverOnTab(String menu) {

    }
}
