package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	/*features="C:\\Users\\RUPRAJ ROY\\eclipse-workspace\\Selenium_Java\\Bdd_Cucumbers\\Features",
	glue= {"StepDefinitions"}*/
		features = "C:\\Users\\RUPRAJ ROY\\eclipse-workspace\\Selenium_Java\\Bdd_Cucumbers\\Features",
	    glue = {"stepDefinitionsPackage"},
	    plugin = {"pretty", "html:target/cucumber-reports.html"},
	    monochrome = true,
	    tags = "@tag_name"
	
		)

public class TestRunner {

}
