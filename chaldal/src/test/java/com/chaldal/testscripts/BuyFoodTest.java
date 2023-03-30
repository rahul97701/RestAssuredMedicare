package com.chaldal.testscripts;


import org.testng.annotations.Test;

import com.chaldal.pages.LandingPage;

public class BuyFoodTest extends BasePage {
	
	@Test
	public void  BuyFoodTest() {
	
	
	LandingPage landingPage = new LandingPage(driver);
	landingPage.clickOnFood();

}
}
