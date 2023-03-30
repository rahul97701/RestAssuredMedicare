 package com.Swiggy.pages;

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
		private Actions actions ;
		private WebDriverWait wait;
		
		//@FindBy(linkText = "Job Guarantee")
		//private WebElement jobguarantee;
		
		@FindBy(id = "location")
		private WebElement location;
		
		@FindBy(xpath = "//span[contains(@class,'_2W-T9')]")
		private WebElement selectfirstlocation;
		
		@FindBy(xpath = "//div[contains(@class,'nA6kb')]")
		private WebElement clickfirstrestau;
		
		@FindBy(xpath = "//div[contains(@class,'_1RPOp')]")
		private WebElement clickonadd;
		
		@FindBy(xpath = "//div[contains(@class,'_3coNr')]")
		private WebElement clickonadd1;
		//@FindBy(xpath = "//a[contains(@class,'_3iFC5')]")
		//private WebElement findfood;
		
		//@FindBy(xpath = "//a[@href='/java-full-stack-developer-certification-training-course'][normalize-space()='View Program']")
		//private WebElement viewprogram;
		
		//@FindBy(id = "ApplyNowForm2")
		//private WebElement applynow;
		
		//@FindBy(xpath = "//div[contains(@class,'form-control')]/input")
		//private WebElement entername;
		//
		
		
		
		
		public LandingPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			actions = new Actions(driver);
			wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			
		}
		

		public void enterLocation() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(location));
			location.sendKeys("Bhopal");
			Thread.sleep(500);
		}
		 public void selectFirstLocation() {
			selectfirstlocation.click();
		}
		
		public void clickfirstrestaurant() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(clickfirstrestau));
			clickfirstrestau.click();
			Thread.sleep(500);
			
		}
		
		public void clickOnAdd() throws InterruptedException {
			clickonadd.click();
			Thread.sleep(500);
		}
		
		public void clickOnAddItem() {
			clickonadd1.click();
			
			
		}
		
		/*public void enterFindFoodIcon() {
			wait.until(ExpectedConditions.visibilityOf(findfood));
			findfood.click();
			
			
		}


		/*public void hoverPointerOnJobGuaranteeTab1() {
			actions.moveToElement(jobguarantee).build().perform();
			jobguarantee.click();
		}*/
		
		/*public void clickOnViewProgram() {
			wait.until(ExpectedConditions.visibilityOf(viewprogram));
			viewprogram.click();
		}
		
		public void clickOnApplyNow() throws InterruptedException {
			applynow.click();
			
		}*/

		


		
			
		}
			

		
		
			
	