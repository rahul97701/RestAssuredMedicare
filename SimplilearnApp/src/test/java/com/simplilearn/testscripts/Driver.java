package com.simplilearn.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.simplilearn.pages.Enter;
import com.simplilearn.pages.LandingPage;

public class Driver extends Tools {
	protected static WebDriver driver;
	
	protected static LandingPage landingPage;
	protected static Enter enter;
	
	@Test
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.simplilearn.com/");
      

		landingPage = new LandingPage(driver);
		
		
		landingPage.hoverPointerOverFreeOnlineCoursesLink();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,750)");
		
		//landingPage.clickOnViewCourse();
		
		landingPage.clickOnLogInBtn();
		
		//ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		//System.out.println(tabs1.size());
	//	driver.switchTo().window(tabs1.get(1));
		
		
		enter.enterEmailid(null);
		enter.enterPassword(null);
		enter.clickOnLoginBtn();
		enter.getErrMsg();
		
		
	   
	  
		
      
	}
	
	

}
