package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"scr/test/resources/ApplicationFeature/InvestorLogin.feature"},
			glue= {"stepDefinations","AppHooks"},
			plugin = {"pretty"	,
					"json:target/cucumber-reports/Cucunber.json"}
		//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class LoginTestRunner {
	
	

}



