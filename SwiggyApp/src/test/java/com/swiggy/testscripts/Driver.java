package com.swiggy.testscripts;

	

import java.net.MalformedURLException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.swiggy.pages.CheckOut;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.Restaurants;

	public class Driver extends Tools {
		
		
		protected static LandingPage landingPage;
		
	    protected static Restaurants restaurants;
	    
	    protected static CheckOut checkOut;
		
	
		
		public static void init() throws MalformedURLException {
			
		
			
		
			System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
				driver.get("https://www.swiggy.com");
		
			landingPage = new LandingPage(driver);
            restaurants = new Restaurants(driver);
            restaurants.clickAddBtn();
            checkOut  = new CheckOut(driver);
            checkOut.clickCheckOutBtn();
	}
	}
		
