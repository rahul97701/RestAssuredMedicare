package com.swiggy.testscripts;






import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools{

	
	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		Driver.init();
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
