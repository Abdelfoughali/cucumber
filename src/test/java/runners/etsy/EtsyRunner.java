package runners.etsy;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.etsy",
        glue ="stepsdefinitions/estsysteps",
        dryRun = false,
        tags = "@regressionOutline"
)

public class EtsyRunner {
}
