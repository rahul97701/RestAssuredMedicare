package com.flipkart.testscripts;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BuyTwowheelersOnlineSteps extends Driver {
	
	@Given("A user is on the landing page of amazon")
	public void A_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.amazon.in/"));
		
	}
	
	@And("He hovers a pointer over the mobiles link")
	public void He_hovers_a_pointer_over_the_two_mobiles_link()  {
		landingPage.hoverPointerOverMobiles();
	
		
	}
	
	@And("He clicks on the simcards")
	public void  He_clicks_on_the_simcards() {
		landingPage.clickOnSimCards();
	}
	
	@And("He clicks on the first scooters in the Bikes and Scooters menu")
	public void He_clicks_on_the_first_scooters_in_the_Bikes_and_Scooters_menu(){
		bikesAndScooters.clickOnfirstScooter();
	}
	
	@Then("He switches focus on the new tab")
	public void He_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	
	

}
