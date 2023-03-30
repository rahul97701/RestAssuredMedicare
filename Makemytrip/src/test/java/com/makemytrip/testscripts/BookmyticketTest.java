package com.makemytrip.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.makemytrip.pages.LandingPage;

public class BookmyticketTest extends BasePage{
	
	WebDriver driver;
	
	@Test
	public void bookmyticket() throws InterruptedException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickFromCityBox();
		
		
		
		
	}
	
	
	
	

}
