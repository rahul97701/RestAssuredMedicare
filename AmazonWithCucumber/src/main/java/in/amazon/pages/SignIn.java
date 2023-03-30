package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	

	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement errMsg;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmail(String userid) {
		email.clear();
		email.sendKeys(userid);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
		
	}
	
	public String getErrMsg() {
		String message = errMsg.getText();
		return message;
	}
		
		
		
		
	
}
