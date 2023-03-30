package com.chaldal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private WebDriverWait wait;
	private Actions actions;
	
	@FindBy(xpath = "//a[contains(@href,'/food')]")
	private WebElement food;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	
	}
	
	public void clickOnFood() {
		food.click();
		
		
	}
	

}
