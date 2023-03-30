package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageSteps extends Driver{
	
	
	
	@Given ("A user is on the landing Page")
	public void A_user_is_on_the_landing_Page() {
		Assert.assertTrue(driver.getCurrentUrl().equals("http://localhost:8080/medicare"));
	}
	
	 @When ("he clicks on the SignUp link")
	 public void he_clicks_on_the_SignUp_link() throws InterruptedException {
		 landingPage.clickOnSignUpLink();
	 }
		 
	 
	@When("he enters first name in the first name text box")
	public void he_enters_first_name_in_the_first_name_text_box()throws InterruptedException  {
		signUpPage.enterFirstName();
	}
	

	
	@When("he enters last name in the last name text box")
	public void he_enters_last_name_in_the_last_name_text_box()throws InterruptedException  {
		signUpPage.enterLastName();
	}
		

	
	@When("he enters email in the email text box")
	public void he_enters_email_in_the_email_text_box()throws InterruptedException  {
		signUpPage.enterEmail();
	}
		
	
	@When("he enters contact number in the contact number text box")
	public void he_enters_contact_number_in_the_contact_number_text_box() throws InterruptedException {
		signUpPage.enterContactNumber();
	}
		
	
	@When("he enters password in the password text box")
	public void he_enters_password_in_the_password_text_box() throws InterruptedException {
		signUpPage.enterPassword();
	}
		
	
	 @When("he reenters password in the  confirm password text box")
	 public void he_reenters_password_in_the_confirm_password_text_box() throws InterruptedException {
		 signUpPage.enterConfirmPassword();
	 }
	 
	@When("he clicks on the next billing button")
	public void he_clicks_on_the_next_billing_button() throws InterruptedException {
		signUpPage.clickOnNextBillingBtn();
		
		}
	
	@When("he enters address in the address line one text box")
	public void he_enters_address_in_the_address_line_one_text_box() throws InterruptedException {
		signUpPage.enterAddress1();
		
		}

	@When("he enters address in the address line two text box")
	public void he_enters_address_in_the_address_line_two_text_box()throws InterruptedException  {
		signUpPage.enterAddress2();
		
	}
	
	@When("he enters city in the city text box")
	public void he_enters_city_in_the_city_text_box()throws InterruptedException  {
		signUpPage.enterCity();
		
		}
	
	@When("he enters postal code in the postal code text box")
	public void he_enters_postal_code_in_the_postal_code_text_box()throws InterruptedException  {
		signUpPage.enterPostalCode();
		
	}
	
	@When("he enters state in the state text box")
	public void he_enters_state_in_the_state_text_box()throws InterruptedException  {
		signUpPage.enterState();
		
	}
	
	@When("he enters country in the country text box")
	public void he_enters_country_in_the_country_text_box()throws InterruptedException  {
		signUpPage.enterCountry();
		
	}
	
	@When("he clicks on the next-confirm button")
	public void he_clicks_on_the_next_confirm_button()throws InterruptedException {
		signUpPage.hoverPointerOnNextConfirmBtn();
		
	}
	
	@When("he clicks on the confirm button")
	public void he_clicks_on_the_confirm_button()throws InterruptedException  {
		signUpPage.clickOnConfirmBtn1();
		
	}
	
	@Then("he must be able to register successfully")	
		public void he_must_be_able_to_register_successfully(){
			String ExpectedTitle = "You can use your email address as username to login!";
			String ActualTitle = driver.getTitle();
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			driver.quit();
			
		}
	}
	
	

