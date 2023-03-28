package CapstoneProject1TestSteps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import CapstoneProject1Pages.LoginPage;

public class loginPageTestSteps {
	
     protected WebDriver driver;
	
    
	
	protected static LoginPage loginPage;

	@Test
	public void lauchApp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
	
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		loginPage = new LoginPage(driver);
		loginPage.clickOnLoginLink();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickLoginBtn();
		loginPage.clickOnAntipyreticLink();
		loginPage.clickOnAddBtn();
	
		

}
	
	@AfterTest
	public void tearDown() {
	    driver.quit();
	}
	
	    }
	








