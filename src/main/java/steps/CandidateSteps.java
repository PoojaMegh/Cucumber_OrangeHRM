package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.recruitment.CandidatePage;

public class CandidateSteps {
    CandidatePage candidatePage = new CandidatePage();

    @And("user navigate to {string} stage tab")
    public void userNavigateToStageTab(String stageName) {
        candidatePage.navigateToStageTab(stageName);
    }

    @Then("user validate {string} tab row count")
    public void userValidateTabRowCount(String stageName) {
        candidatePage.getCandidateCountOnStage(stageName);
    }

    @Then("user validate sum of candidates count on {string} tabs")
    public void userValidateSumOfCandidatesCountOnTabs(String allStagesName) {
        candidatePage.getSumOfAllCandidates(allStagesName);
    }
}
