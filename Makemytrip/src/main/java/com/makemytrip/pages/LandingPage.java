package com.makemytrip.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	private WebDriver driver ;
	private Actions actions; 
	WebDriverWait wait;
	
	//@FindBy( linkText = "Flights")
	@FindBy(xpath = "//*[@id=\"react-autowhatever-1-section-0-item-1\"]/div/div[1]/p[2]")
	//@FindBy(linkText = "from")
	private WebElement from;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		 wait = new WebDriverWait(driver, 30);
		
	}
	
	public void clickFromCityBox() throws InterruptedException {
		
		//actions.moveToElement(from).build().perform();
		wait.until(ExpectedConditions.visibilityOf(from));
		Thread.sleep(500);
		from.click();
		//from.sendKeys("Bhopal");
		
	}
	
	

}
