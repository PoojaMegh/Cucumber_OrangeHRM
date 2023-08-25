package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.hradministration.ManageUserRolesPage;

public class ManageUserRolesPaginationSteps {

    ManageUserRolesPage manageUserRolesPage = new ManageUserRolesPage();

    @Then("user verify by default {int} records should be displayed in table")
    public void userVerifyByDefaultRecordsShouldBeDisplayedInTable(int defaultRecordCount) {
        Assert.assertEquals("Displayed default record summary is not 50","50",manageUserRolesPage.getPaginationDefaultValue());
    }

    @And("user verify correct record summary is displayed at right corner of page")
    public void userVerifyCorrectRecordSummaryIsDisplayedAtRightCornerOfPage() {
        int expectedRowCount = manageUserRolesPage.getTotalTableRows();
        int actualRowCount = manageUserRolesPage.getTotalRowsFromSummary();
        Assert.assertTrue("Displayed record summary is not correct",expectedRowCount==actualRowCount);
    }
}
