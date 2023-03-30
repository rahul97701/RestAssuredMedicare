package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement Hellosignin;
	
	@FindBy(linkText = "Sign in")
	private WebElement signin;
	
	//@FindBy(linkText = "Mobiles")
	//private WebElement mobiles2;
	
	//@FindBy(linkText = "Mobiles & Accessories")
	//private WebElement mobiles;
	
	//@FindBy(linkText = "OnePlus")
	//private WebElement simcards;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// TODO Auto-generated constructor stub
	}
	

	
	public void hoverAPointerOnHelloSignIn() {
		actions.moveToElement(Hellosignin).build().perform();
		
	}
	
	public void clickOnSignIn() {
		wait.until(ExpectedConditions.visibilityOf(signin));
		signin.click();
	}
	
	/*public void hoverPointerOverMobiles(){
		
		actions.moveToElement(mobiles2).build().perform();
		mobiles.click();
		wait.until(ExpectedConditions.visibilityOf(mobiles));
		
		
	}
	
	public void clickOnSimCards() {
		wait.until(ExpectedConditions.visibilityOf(simcards));
		//actions.moveToElement(simcards).build().perform();
		
		simcards.click();*/
	
	
	
	

}
