package com.flipkart.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.flipkart.pages.BikesAndScooters;
import com.flipkart.pages.LandingPage;


public class Driver extends Tools{

protected static LandingPage landingPage;
protected static BikesAndScooters bikesAndScooters;

@Test
	
    public static void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	    landingPage = new LandingPage(driver);
	    
		
		

		//bikesAndScooters = new BikesAndScooters(driver);
	}
	
	

}
