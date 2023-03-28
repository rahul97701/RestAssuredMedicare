package CapstoneProject1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	private WebDriver driver;
	//private Actions actions;
	
	@FindBy(xpath = "//li[contains(@id,'signup')]" )
	private WebElement Signup;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickOnSignUpLink() throws InterruptedException {
		//actions.moveToElement(Signup);
		Signup.click();
		Thread.sleep(500);
	}

}
