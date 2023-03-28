package CapstoneProject1Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private static WebDriver driver;
	
	@FindBy(xpath = "//li[contains(@id,'login')]")
	private WebElement login;
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	private WebElement email;
	
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement password;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	private WebElement loginbtn;
	
	@FindBy(id = "a_Antipyretics")
	private WebElement antipyrectics;
	
	@FindBy(xpath = "//a[contains(@href,'/medicare/cart/add/1/product')]")
	private WebElement clickonaddbtn;
	

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLink() throws InterruptedException {
		login.click();
		Thread.sleep(500);
		
	}
	
	public void enterEmail() throws InterruptedException {
		email.sendKeys("singh.rahulllk@gmail.com");
		Thread.sleep(500);
	}
	
	public void enterPassword() throws InterruptedException {
	password.sendKeys("Safari@5529");
	Thread.sleep(500);
			
	}
	
	public void clickLoginBtn() throws InterruptedException {
		loginbtn.click();
		Thread.sleep(500);
		
		}
	
	public void clickOnAntipyreticLink() throws InterruptedException {
		antipyrectics.click();
		Thread.sleep(500);
	}
	
	public void clickOnAddBtn() throws InterruptedException {
		clickonaddbtn.click();
		Thread.sleep(500);
	}
	
	
	
	
	
}
