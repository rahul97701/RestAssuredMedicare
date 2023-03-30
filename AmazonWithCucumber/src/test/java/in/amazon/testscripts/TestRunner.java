package in.amazon.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		//features = "Features//buy_mobile_phone.feature"
	features = "Features//verify_error_msg.feature"
			,glue = "in.amazon.testscripts"
			,tags = "@regression"
			//,tags = "@multiple_usernames"
						//,dryRun = true
)

public class TestRunner extends AbstractTestNGCucumberTests{

}


