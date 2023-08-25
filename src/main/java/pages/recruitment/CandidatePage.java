package pages.recruitment;

import base.ControlActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CandidatePage extends ControlActions {

    @FindBy(css = "div.oxd-table-body>div")
    private List<WebElement> candidateListElement;

    public CandidatePage() {
        PageFactory.initElements(driver, this);
    }

    public CandidatePage navigateToStageTab(String stageName) {
        getElement("XPATH", "//p[text()='" + stageName + "']", true).click();
        return this;
    }

    public int getCandidateCountOnPage() {
        return getListOfElementCount(candidateListElement);
    }

//    WebElement nextBtnElement = getElement("XPATH","//button//i[contains(@class,'right')]",true);

    public int getCandidateCountOnStage(String stageName) {
        WebElement nextBtnElement = getElement("XPATH", "//button//i[contains(@class,'right')]", true);
        int candidateCount = 0;
        do {
            int count = getCandidateCountOnPage();
            candidateCount = candidateCount + count;

            if (driver.findElements(By.xpath("//button//i[contains(@class,'right')]")).size() > 0) {
                nextBtnElement.click();
                if(driver.findElements(By.xpath("//button//i[contains(@class,'right')]")).size() > 0)
                    nextBtnElement = getElement("XPATH", "//button//i[contains(@class,'right')]", true);
            }
//        if(nextBtnElement.isDisplayed()) {
//            nextBtnElement.click();
//            nextBtnElement = getElement("XPATH", "//button//i[contains(@class,'right')]", true);
//        }
        }
        while (driver.findElements(By.xpath("//button//i[contains(@class,'right')]")).size() > 0);

        System.out.println("Candidate count on stage " + stageName + " : " + candidateCount);
        return candidateCount;
    }

    public int getSumOfAllCandidates(String allStagesName) {
        int allCandidateCount = 0;
        String[] allStagesNameArr = allStagesName.split(", ");
        for (int index = 0; index <= allStagesNameArr.length; index++) {
            navigateToStageTab(allStagesNameArr[index]);
            int stageCandidateCount = getCandidateCountOnStage(allStagesNameArr[index]);
            allCandidateCount = allCandidateCount + stageCandidateCount;
        }
        return allCandidateCount;
    }
}
