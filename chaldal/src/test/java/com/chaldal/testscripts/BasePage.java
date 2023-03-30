package com.chaldal.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chaldal.com/");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
