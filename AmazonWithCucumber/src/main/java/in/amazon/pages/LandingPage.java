package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement helloSignIn;
	
	@FindBy(linkText ="Sign in")
	private WebElement signInBtn;
	
public LandingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
}
	
	public void clickMobiles() {
		mobiles.click();
	}

	public void hoverPointerOverHelloSignInMenu() {
		actions.moveToElement(helloSignIn).build().perform();
	
	
	}
	
	public void clickSignInBtn() {
		wait.until(ExpectedConditions.visibilityOf(signInBtn));
		signInBtn.click();
		
				
	}
}
