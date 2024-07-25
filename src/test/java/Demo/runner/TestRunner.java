package Demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Demo/features/" ,
        glue="Demo.stepDef",
        monochrome = true,
        plugin ={ "pretty","html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
