package com.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	private WebDriver driver;
	
	@FindBy(linkText = "Sign Up" )
	private WebElement Signup;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignUpLink() throws InterruptedException {
		Signup.click();
		Thread.sleep(500);
	}

}
