package com.Swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver {
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.swiggy.com/"));
	}
	
	@When("he type location on location textbox")
	public void he_type_location_on_location_textbox() throws InterruptedException {
		landingPage.enterLocation();
	}
	
	@When("he selects the first location")
	public void he_selects_the_first_location() {
		landingPage.selectFirstLocation();
	}
	
	@When("he clicks on first restaurant")
	public void he_clicks_on_first_restaurant() throws InterruptedException {
		landingPage.clickfirstrestaurant();;
	}
	
	@When("he clicks on add button")
	public void he_clicks_on_add_button() throws InterruptedException {
		landingPage.clickOnAdd();
	}
	
	@Then("he click on add item button")
	public void he_click_on_add_item_button() {
	landingPage.clickOnAddItem();
	}


}
