package runners.webOrder;


// runner class is a way the run your all feature file from here
// run with annotation comes from jUnit it executes the feature file steps
// cucumber option is a special annotation that has some keyword
// feature:this is the location of features file(this sis one should be content root )
//glue: this is the location of the steps defintion(this one should be source root and delete java part to make it more general)
//dryRun: this is the way to gets the snips without executing the whole implementations
// it means if you make it true you will get immediately unimplemented snips

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     features = "src/test/resources/features/com.weborder", // this is path for feature files
     glue ="stepsdefinitions/webordersteps",// this is path for step definitions
        dryRun = false,
        tags = "@signpractice"
)
public class WebOrderRunner {
}
