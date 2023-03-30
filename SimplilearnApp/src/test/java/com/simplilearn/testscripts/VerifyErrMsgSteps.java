package com.simplilearn.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class VerifyErrMsgSteps extends Driver {
	
	
	@Given ("A user is on the landingPage")
		public void A_user_is_on_the_landingPage(){
			Assert.assertTrue(driver.getTitle().equals("Simplilearn | Online Courses - Bootcamp & Certification Platform"));
		}
		
		@When("he clicks on the free online courses link")
		public void he_clicks_on_the_free_online_courses_link() {
			landingPage.hoverPointerOverFreeOnlineCoursesLink();
		}
		
		@When ("he clicks on the login link")
		public void he_clicks_on_the_login_link() {
			landingPage.clickOnLogInBtn();
		}
		
		@When("he enters an invalid emailid")
		public void he_enters_an_invalid_emailid() {
			landingPage.enterEmailid();
		}
		
		@When(" he enters an invalid password")
		public void he_enters_an_invalid_password() {
			landingPage.enterPassword();
		}
		
		@When("he clicks on the login button")
		public void he_clicks_on_the_login_button() {
			landingPage.clickOnLoginBtn();
		}
		
		@Then("he must see a message {String}")
		public void he_must_see_a_message(String string) {
			String ExpectedErrMsg = string;
			String ActualErrMsg = driver.g
			
		}
		
			
			
			
		}
		


			
			

		



	
	
	
	

}
