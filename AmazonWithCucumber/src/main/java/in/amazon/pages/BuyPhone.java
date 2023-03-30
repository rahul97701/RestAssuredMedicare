package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPhone {
	WebDriverWait wait;
	
	@FindBy(id ="buy-now-button")
	private WebElement buyNowBtn;
	
	public BuyPhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
		}
		public void clickBuyNowBtn() {
			buyNowBtn.click();
		}

}

