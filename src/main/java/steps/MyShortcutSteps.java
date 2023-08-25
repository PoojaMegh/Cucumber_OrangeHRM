package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyShortcutPage;

public class MyShortcutSteps {

    MyShortcutPage myShortcutPage = new MyShortcutPage();
    @Then("user verify {int} shortcut is displayed")
    public void userVerifyShortcutIsDisplayed(int shortcutCount) {
       int actualCount = myShortcutPage.getShortcutCount();
        Assert.assertTrue("Expected number of shortcuts not visible",actualCount==shortcutCount);
    }
}
