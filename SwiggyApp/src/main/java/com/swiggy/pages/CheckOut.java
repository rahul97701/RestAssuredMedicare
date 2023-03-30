package com.swiggy.pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CheckOut {
	WebDriverWait wait;
	
	@FindBy(xpath = "//button[contains(@class,'_1gPB7')]")
	private WebElement checkoutbtn;
	
	public CheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	public void clickCheckOutBtn() {
		checkoutbtn.click();
	}
	

}
