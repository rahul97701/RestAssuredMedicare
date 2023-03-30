package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	private WebDriver driver;
	private Actions actions;
	 private WebDriverWait wait;
	
	@FindBy(id = "nav-flyout-accountList")
	private WebElement hellosignin;
	
	
	@FindBy(linkText ="Sign in")
	private WebElement signin;
	
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id ="continue")
	private WebElement continue1;
	/*@FindBy(linkText = "Electronics")
	private WebElement electronics;
	
	@FindBy(linkText = "Cameras & Photography")
	private WebElement cameras;
	
	@FindBy(xpath = "//div[contains(@class,'ShovelerList')]/div[2]")
	private WebElement dashcam;
	
	*/
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,(30));
		
		
	}
	/*
	public void clickOnElectronicsIcon() {
		actions.moveToElement(electronics).build().perform();
		electronics.click();
		
	}
	
	public void clickOnCamerasAndPhotographyIcon() {
		cameras.click();
		
	}
	
	public void clickOnQuboCarDash() {
		dashcam.click();
		
	}*/
	
	public void hoverPointerOnHelloSignInBtn()  {
		actions.moveToElement(hellosignin).build().perform();
	
		
	}
	public void clickOnSignInBtn() {
	
	actions.moveToElement(signin).build().perform();
	signin.click();
	
	}
	
	public void enterEmail() {
		email.sendKeys("singh.rahulsingh.om07@gmail.com");
		
		
	}
	
	public void clickOnContinueBtn() {
		continue1.click();
	}

}
