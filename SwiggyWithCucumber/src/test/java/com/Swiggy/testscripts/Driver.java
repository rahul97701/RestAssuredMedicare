package com.Swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Swiggy.pages.LandingPage;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	
	public static void init() {
		System.setProperty("Webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		landingPage = new LandingPage(driver);
		
	}
	

}
