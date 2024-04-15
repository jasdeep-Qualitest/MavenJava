package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features",
        glue="stepDefinitions",
        tags = "@jajaaja", 
        monochrome = true,
        plugin = { "pretty", "html:target/reports/htmlReport.html",
		"json:target/jsonReports/cucumber.json",
		"junit:target/junitReports/cucumber.xml"
		}
        )
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
