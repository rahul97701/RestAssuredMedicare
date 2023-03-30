package com.medicare.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.medicare.pages.LandingPage;
import com.medicare.pages.SignUpPage;

import net.masterthought.cucumber.Configuration;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static SignUpPage signUpPage;
	
	@Test
	public static void init() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		//Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		//final String BASE_URl = "http://localhost:8080/medicare/";
		driver.get("http://localhost:8080/medicare/");
		landingPage = new LandingPage(driver);
		signUpPage = new SignUpPage(driver);
		landingPage.clickOnSignUpLink();
		signUpPage.enterFirstName();
		signUpPage.enterLastName();
		signUpPage.enterEmail();
		signUpPage.enterContactNumber();
		signUpPage.enterPassword();
		signUpPage.enterConfirmPassword();
		signUpPage.clickOnNextBillingBtn();
		signUpPage.enterAddress1();
		signUpPage.enterAddress2();
		signUpPage.enterCity();
		signUpPage.enterPostalCode();
		signUpPage.enterState();
		signUpPage.enterCountry();
		signUpPage.hoverPointerOnNextConfirmBtn();
		signUpPage.clickOnConfirmBtn1();
		
		signUpPage.verifyTitle();
	
		
	}

}
