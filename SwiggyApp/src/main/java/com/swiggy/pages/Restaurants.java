package com.swiggy.pages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurants{
	WebDriverWait wait;
	
	@FindBy(xpath = "//a[contains(@href,'mughal-darbar')]")
			private WebElement firstrestaurant;
	
	@FindBy(xpath = "//div[contains(@class,'_1RPOp')]")
	private WebElement addBtn;
	
	public Restaurants(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			}
	
	public void clickFirstRestaurant() {
		firstrestaurant.click();
		
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
}


