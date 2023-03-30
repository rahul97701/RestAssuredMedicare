package com.medicare.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//fill_SignUp_form.feature"
		,glue = "com.medicare.testscripts"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
