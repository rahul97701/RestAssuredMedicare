package in.amazon.testscripts;


import java.util.ArrayList;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BuyMobilePhoneSteps extends Driver {
	
	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.amazon.in/"));
	}

	@When("he clicks on the Mobiles link")
	public void he_clicks_on_the_mobiles_link() {
		landingPage.clickMobiles();
	}
	
	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
		allMobileBrands.hoverPointerOnMobilesAndAccessories();
		
	}
	
	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
		allMobileBrands.clickApple();
	}
	
	@When("he clicks on the first available phone on the next page")
	public void he_clicks_on_the_first_available_phone_on_the_next_page() {
		applePhones.clickFirstPhone();
	}
	
	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	
	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
		buyPhone.clickBuyNowBtn();
	}
	
	@Then("he must be able to buy the mobile phone successfully")
	public void he_must_be_able_to_buy_the_mobile_phone_successfully() {
		String expectedTitle = "Amazon Sign In";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
}
