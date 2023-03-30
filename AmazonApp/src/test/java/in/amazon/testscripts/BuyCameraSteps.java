package in.amazon.testscripts;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;


public class BuyCameraSteps {
	
	WebDriver driver;
	
	@Test
	public void launchApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		LandingPage landingPage = new LandingPage(driver);
		//landingPage.clickOnElectronicsIcon();
		//landingPage.clickOnCamerasAndPhotographyIcon();
		
		//JavascriptExecutor jse =  (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,750)");
		
	//	TakesScreenshot scrShot =((TakesScreenshot)driver);
	//	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		
		//landingPage.clickOnQuboCarDash();
		
		landingPage.hoverPointerOnHelloSignInBtn();
		
		

		
		
		landingPage.clickOnSignInBtn();
		landingPage.enterEmail();
		landingPage.clickOnContinueBtn();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
