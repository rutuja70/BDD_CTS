package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Feature",
		glue= {"StepDefinitions","Hooks"}, 
		plugin= {"pretty","html:target/report.html"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
