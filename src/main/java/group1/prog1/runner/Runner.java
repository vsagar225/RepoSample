package group1.prog1.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"gr1.prog1.stepdefination" },
                 features = {"src/main/resources/ui/features"}, tags = { })
public class Runner {

}
