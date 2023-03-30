package com.makemytrip.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
	private WebDriver driver;
	
	
	@BeforeTest
	public void launchApplication() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruchi\\AppData\\Local\\Temp\\Temp2_chromedriver_win32 (1).zip\\chromedriver.exe");
		
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com/");
		 //driver.manage().timeouts().wait(500);
	
		 
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		 
		
		
		
		
	}

}
