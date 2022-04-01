package guru99_insuranceProject.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "guru99_insuranceProject/Steps_Definitions"
)

public class FailedRunner {
}
