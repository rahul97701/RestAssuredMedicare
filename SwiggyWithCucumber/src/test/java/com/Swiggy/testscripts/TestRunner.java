package com.Swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "Features//order_food.feature"
			
		
	)

public class TestRunner extends AbstractTestNGCucumberTests{

}
