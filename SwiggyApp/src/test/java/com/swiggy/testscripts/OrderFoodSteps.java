package com.swiggy.testscripts;


import java.util.ArrayList;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver {
	
	
	
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_Swiggy() {
		Assert.assertTrue(driver.getTitle().equals("https://www.swiggy.com/"));

	}
	
	@When("he Enters location as {string}")
	public void he_enters_location_as(String string) {
		landingPage.enterLocation(string);

		
	}
	
     @When("he selects first location from suggested location in suggestion-box")
    		public void he_selects_first_location_from_suggested_location_in_suggestion_box() {
    			landingPage.selectLocation(); 
     }
     
    @When("he clicks on find food icon")
    public void he_clicks_on_find_food_icon() {
      landingPage.clickFindFood();
    }

 @When("he clicks on the first available restaurants on the next page")
public void he_clicks_on_the_first_available_restaurants_on_the_next_page() {
   restaurants.clickFirstRestaurant();
}

@When("he switches focus on the new tab")
public void he_switches_focus_on_the_new_tab() {
	ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
}


@When("he clicks on add button over the first available food item")
public void he_clicks_on_add_button_over_the_first_available_food_item() {
    restaurants.clickAddBtn();
}



@Then("he clicks on checkout button")
public void he_clicks_on_checkout_button() {
  checkOut.clickCheckOutBtn();
}
}
