package com.simplilearn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;
	
	@FindBy(linkText = "Free Online Courses")
	private WebElement onlinecrss;
	
	//@FindBy(linkText = "View Course")
	//private WebElement viewcourse;
	
	@FindBy(linkText = "Log in")
	private WebElement login;
	
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	public void hoverPointerOverFreeOnlineCoursesLink() {
		actions.moveToElement(onlinecrss).build().perform();
		onlinecrss.click();
		
	}
	
	//public void clickOnViewCourse() {
		//wait.until(ExpectedConditions.visibilityOf(viewcourse));
		//actions.moveToElement(viewcourse).build().perform();
		//viewcourse.click();
	//}
	
	public void clickOnLogInBtn() {
		actions.moveToElement(login).build().perform();
		login.click();
	}
	


	
	
	
	

}
