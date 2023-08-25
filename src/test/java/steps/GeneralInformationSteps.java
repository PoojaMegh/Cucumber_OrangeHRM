package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import pages.hradministration.organization.GeneralInformationPage;

public class GeneralInformationSteps {
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();

    @Then("user update {string} field text")
    public void userUpdateFieldText(String text) {
        generalInformationPage.updateOrganizationName(text);
    }

    @And("user validate Number of Employees field")
    public void userValidateNumberOfEmployeesField() {
        generalInformationPage.checkNumOfEmpField();
    }
}
