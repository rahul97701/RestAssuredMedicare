package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikesAndScooters {
	
	@FindBy(xpath = "//span[contains(@class,'a-size-base a-color-base')]")
	private WebElement usasimcard;
	
	
	
	public BikesAndScooters(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnfirstScooter() {
		usasimcard.click();
		
		
	}

}
