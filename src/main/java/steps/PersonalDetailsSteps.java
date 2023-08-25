package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DashboardPage;
import pages.employeemanagement.myinfo.PersonalDetailsPage;
import pages.employeemanagement.myinfo.SalaryPage;

public class PersonalDetailsSteps {

    PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();
    DashboardPage dashboardPage = new DashboardPage();
    SalaryPage salaryPage = new SalaryPage();

    @Then("user verify profile name is as expected")
    public void userVerifyProfileNameIsAsExpected() {
        String firstName = personalDetailsPage.getFirstName();
        String lastName = personalDetailsPage.getLastName();
        String actualProfileName = firstName + " " + lastName;

        Assert.assertEquals(actualProfileName, dashboardPage.getProfileName());
    }

    @And("user verify personal details label is displayed")
    public void userVerifyPersonalDetailsLabelIsDisplayed() {
       Assert.assertTrue("Personal Details Label is not displayed",personalDetailsPage.isPersonalDetailsHeaderDisplayed());
    }

    @Then("user verify the payable amount is non-zero")
    public void userVerifyThePayableCTCAmountIsNonZero() {
       Assert.assertTrue("The payable (CTC) amount is zero",salaryPage.getCTCValue()>0);
    }
}
