package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = "src/test/java/Features/LoginTest.feature", glue = "testSteps", monochrome = true)

public class Runner extends AbstractTestNGCucumberTests{
	
	

}
