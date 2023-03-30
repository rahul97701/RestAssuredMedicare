package com.flipkart.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "Features//buy_twowheelers_online.feature"
		,glue = "com.flipkart.testscripts"
		,tags = "@regression"
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
