package in.amazon.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMsgSteps extends Driver {
	
	@Given("user is on the landing page")
	public void user_is_on_the_landing_page() {
       Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}
	
	@When("he hovers the pointer over Hello Sign in menu")
	public void he_hovers_the_pointer_over_hello_sign_in_menu() {
		landingPage.hoverPointerOverHelloSignInMenu();
	}
	
	@When("he clicks on the sign in button in the sub menu")
		public void he_clicks_on_the_sign_in_button_in_the_sub_menu() {
		landingPage.clickSignInBtn();
	}

	@When("he enters an invalid username in the username textbox")
	public void he_enters_an_invalid_username_in_the_username_textbox() {
		signIn.enterEmail("rahulsingh@gmail.com");
	}
	
	@When("he clicks on continue button")
	public void he_click_on_continue_button() {
		signIn.clickContinueBtn();

	}
	
	@Then("he must see the error message {string}")
	public void he_must_see_the_error_message(String string) {
		String expectedErrMsg = string;
		String actualErrMsg = signIn.getErrMsg();
		Assert.assertEquals(actualErrMsg,expectedErrMsg);
	}
	@When("he enters an invalid username as {string}")
		public void he_enters_an_invalid_username_as(String string) {
			signIn.enterEmail(string);
		}
	}
       
