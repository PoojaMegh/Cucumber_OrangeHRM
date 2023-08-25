package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\featureFiles",
        tags = "@widgets",
        glue = "steps",
        dryRun = false,
        plugin = "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
)

public class RunScenario {
}
