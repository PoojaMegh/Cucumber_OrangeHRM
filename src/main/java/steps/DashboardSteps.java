package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DashboardPage;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps {

    DashboardPage dashboardPage = new DashboardPage();
    @And("user verify Total Visible Widgets count is same as {int}")
    public void userVerifyTotalVisibleWidgetsCountIsSameAs(int expectedWidgetCount) {
        dashboardPage.waitUntilWidgetsAreLoaded();
        Assert.assertEquals("Total visible widgets are not as expected",dashboardPage.getTotalVisibleWidgets(),expectedWidgetCount);

        //Expected widget list
        List<String> expectedWidgetList = new ArrayList<>();
        expectedWidgetList.add("Quick Access");
        expectedWidgetList.add("Buzz Latest Posts");
        expectedWidgetList.add("My Actions");
        expectedWidgetList.add("Latest Documents");
        expectedWidgetList.add("Latest News");
        expectedWidgetList.add("Employees on Leave Today");
        expectedWidgetList.add("Time At Work");
        expectedWidgetList.add("Headcount by Location");
        expectedWidgetList.add("COVID-19 Report");
        expectedWidgetList.add("Current Year's Leave Taken by Department");
        expectedWidgetList.add("Leave Taken on Each Calendar Month Over the Years");
        expectedWidgetList.add("Leave Scheduled in Each Month");
        expectedWidgetList.add("Leave Taken on Each Day of the Week Over Time");

        Assert.assertEquals("Displayed widgets are different",dashboardPage.getAllWidgetsName(), expectedWidgetList);
    }

    @Then("user verify User profile is displayed")
    public void userVerifyUserProfileIsDisplayed() {
        Assert.assertTrue("User profile was not displayed on dashboard page",dashboardPage.isUserProfileDisplayed());
    }

    @And("user mouse hover on profile and click on setting icon on profile")
    public void userMouseHoverOnProfileAndClickOnSettingIconOnProfile() {
        dashboardPage
                .mouseHoverOnUserProfile()
                .clickOnSettingButton();
    }

    @Then("user verify two options are displayed on menu")
    public void userVerifyOptionsAreDisplayedOnMenu() {
        Assert.assertEquals("Displayed menu list is different",dashboardPage.getUserMenuListSize(),2);
    }

    @And("user click on About option on user menu")
    public void userClickOnAboutOptionOnUserMenu() {
        dashboardPage.clickOnUserMenuAboutLink();
    }

    @Then("user verify Employee count displayed is non-zero")
    public void userVerifyEmployeeCountDisplayedIsNonZero() {
       Assert.assertTrue("Employee count is zero",dashboardPage.getEmployeeCount()>0);
    }

    @Then("user click on OK button on popup")
    public void userClickOnOKButtonOnPopup() {
        dashboardPage.clickOnOkButton();
    }
}
