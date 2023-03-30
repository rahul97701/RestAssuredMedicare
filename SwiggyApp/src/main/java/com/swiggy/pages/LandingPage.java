package com.swiggy.pages;





import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class LandingPage {
	WebDriverWait wait;
	Actions actions;
	
	@FindBy(id = "location")
	private WebElement locationTextBox;
	
	@FindBy(xpath = "//span[contains(@class,'_2W-T9')]")
	private WebElement locationsuggestion;
	
	@FindBy(xpath = "//a[contains(@class,'_3iFC5')]/span")
	private WebElement findfood;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void enterLocation(String city) {
		wait.until(ExpectedConditions.visibilityOf(locationTextBox));
		locationTextBox.sendKeys(city);
	}
	
	
	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(locationsuggestion));
		locationsuggestion.click();
	}
	
	public void clickFindFood() {
		findfood.click();
	}
		
	}

