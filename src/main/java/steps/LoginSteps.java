package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user login using {string} credentials")
    public void user_login_using_admin_credntials(String userType) {
        Assert.assertTrue("Logo not displayed", loginPage.isLogoDisplayed());
        loginPage.doLogin("Admin", "Rs77kA@dKL");
    }

    @When("user enter user name as {string} to login")
    public void user_enter_user_name_as(String userName) {
        loginPage.enterUserName(userName);
    }

    @When("user enter password as {string} to login")
    public void user_enter_password_as(String password) {
        loginPage.enterPasswordName(password);
    }

    @When("user click on {string} button")
    public void user_click_on_button(String buttonName) {
        loginPage.clickOnSubmitButton();
    }

    @When("user verify logo is displayed on Login Page")
    public void userVerifyLogoIsDisplayedOnLoginPage() {
        Assert.assertTrue(loginPage.isLogoDisplayed());
    }

    @Then("user verify Employee Management Header is Displayed")
    public void userVerifyEmployeeManagementHeaderIsDisplayed() {
       Assert.assertTrue(new DashboardPage().isEmployeeManagementHeaderDisplayed());
    }

    @Then("user verify Invalid Toast Message is Displayed")
    public void userVerifyInvalidToastMessageisDisplayed() {
        Assert.assertTrue(loginPage.isInvalidToastMessageIsDisplayed());
    }
}
