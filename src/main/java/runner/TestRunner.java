package runner;

//This will have a configurations to run the project

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/site/cucumber-pretty.html"},
        features = {"src/test/resources/features"},          //Location of the feature file
        glue= {"stepDefs"},                                  //Location of step definition file
        tags ="@tagTest",
        dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {


}
