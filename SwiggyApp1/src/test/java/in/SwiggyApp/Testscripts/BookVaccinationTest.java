package in.SwiggyApp.Testscripts;


import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.SwiggyApp.Pages.LandingPage;


public class BookVaccinationTest extends BasePage {
	LandingPage landingPage;
	
	
	@Test
	public  void BookVaccinationTest() throws InterruptedException {
		
		landingPage = new LandingPage(driver);
		landingPage.enterLocation();
		landingPage.clickfirstrestaurant();
		landingPage.clickOnAdd();
		//landingPage.enterFindFoodIcon();
	/* landingPage.hoverPointerOnJobGuaranteeTab1();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)","");
		
		landingPage.clickOnViewProgram();
		
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		
		landingPage.clickOnApplyNow();
	}
		
		public void verifyText() {

			String expectedTitle = "Please enter the following details to initiate your application for Full Stack Java Developer Job Guarantee Program with Job Guarantee Program";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.quit();*/
			
		
		
	
	
	  
		
	}
	
		
		
		
		
	}
