package com.simplilearn.testscripts;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simplilearn.pages.LandingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buySimplilearnCoursesSteps extends Driver {
	
	
	@Given ("A user is on the landingPage")
	public void A_user_is_on_the_landingPage() {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.simplilearn.com/"));
	}
	
	@When("he clicks on the free online courses link")
	public void he_clicks_on_the_free_online_courses_link() {
		landingPage.hoverPointerOverFreeOnlineCoursesLink();
	}
	
	@When ("he clicks on the log in button")
	public void he_clicks_on_the_log_in_button() {
		landingPage.clickOnLogInBtn();
	}
	
	@When("he enters emailid in the emailid textbox")
	public void he_enters_emailid_in_the_emailid_textbox() {
		landingPage.enterEmailid();
	}
	
	@When("he enter password in the password textbox")
	public void he_enter_password_in_the_password_textbox() {
		landingPage.enterPassword();
	}
	
	@When("he clicks on the login button")
	public void he_clicks_on_the_login_button() {
		landingPage.clickOnLoginBtn();
	}
	
	@Then("he successfully buy a course")
	public void he_successfully_buy_a_course() {
		String ExpectedTitle = "Free Online Courses to Power Your Future | SkillUp by Simplilearn";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.quit();
	   		
	}
	
		
		
		
	}
	


		
		

	


