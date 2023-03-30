package com.simplilearn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Enter {
	private Actions actions;
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	private WebElement emailid;
	
	@FindBy(xpath ="//input[contains(@type,'password')]")
	private WebElement password;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//div[contains(@id,'msg_box')]")
	private WebElement ErrMsg;
	
	
	public void enterEmailid(String userid) {
		actions.moveToElement(emailid).build().perform();
		emailid.clear();
		emailid.sendKeys(userid);
		
		
		
	}
	
	public void enterPassword(String pass) {
		actions.moveToElement(password).build().perform();
		password.clear();
		password.click();
		password.sendKeys(pass);
	}
	
	public void clickOnLoginBtn() {
		actions.moveToElement(loginbtn).build().perform();
		loginbtn.click();
	}
	
	public String getErrMsg() {
		String message = ErrMsg.getText();
		return message;
		
	}
	
	

}
