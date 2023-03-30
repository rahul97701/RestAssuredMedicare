package com.simplilearn.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features//buy_Simlilearn_Courses.feature"
		,glue = "com.simplilearn.testscripts"
		,tags = "@regression"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
