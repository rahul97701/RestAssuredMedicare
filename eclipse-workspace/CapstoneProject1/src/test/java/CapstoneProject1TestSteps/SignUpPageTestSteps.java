package CapstoneProject1TestSteps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Configuration;

import CapstoneProject1Pages.LandingPage;
import CapstoneProject1Pages.SignUpPageUser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpPageTestSteps {
	private  WebDriver driver;

	protected static LandingPage landingPage;
	protected static SignUpPageUser signUpPage;
	
	
	
		@Test
		public void lauchApp() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		//	Configuration.class = new ChromeOptions().addArguments("--remote-allow-origins=*");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			//driver = new ChromeDriver();
			driver.manage().window().maximize();
			//final String BASE_URl = "http://localhost:8080/medicare/";
			driver.get("http://localhost:8080/medicare/");
			
	
			landingPage = new LandingPage(driver);
			signUpPage = new SignUpPageUser(driver);
			landingPage.clickOnSignUpLink();
			signUpPage.enterFirstName();
			signUpPage.enterLastName();
			signUpPage.enterEmail();
			signUpPage.enterContactNumber();
			signUpPage.enterPassword();
			signUpPage.enterConfirmPassword();
			//signUpPage.clickSupplierIcon();
			signUpPage.clickOnNextBillingBtn();
			signUpPage.enterAddress1();
			signUpPage.enterAddress2();
			signUpPage.enterCity();
			signUpPage.enterPostalCode();
			signUpPage.enterState();
			signUpPage.enterCountry();
			signUpPage.hoverPointerOnNextConfirmBtn();
			signUpPage.clickOnConfirmBtn1();
			
			signUpPage.verifyTitle();
		
			
		}
		
		
		@AfterTest
		public void tearDown() {
			driver.quit();
			
		}

	}

