package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features="C:\\Users\\RUPRAJ ROY\\eclipse-workspace\\Selenium_Java\\Bdd_Cucumbers\\Features\\ScenarioOutline.feature",
		glue= {"StepDefinitions"},
		//dryRun=true,
		// monochrome =true,
       //plugin = {"pretty", "html:target/cucumber-reports.html"}
		 plugin = {"pretty", "json:target/cucumber-reports.json"}
      // tags="@functional"
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
