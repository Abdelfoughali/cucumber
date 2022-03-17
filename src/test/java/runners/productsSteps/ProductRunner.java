package runners.productsSteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.produsts",
        glue = "stepsdefinitions/productssteps",
        dryRun=false,
        tags = "@productProjectOutline",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class ProductRunner {


}
