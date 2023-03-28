package CapstoneProject1Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPageUser {
	
	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//input[contains(@id,'firstName')]")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[contains(@id,'lastName')]")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@id,'email')]")
	private WebElement email;
	
	@FindBy(xpath = "//input[contains(@id,'contactNumber')]")
	private WebElement contactnumber;
	
	@FindBy(xpath = "//input[contains(@id,'password')]")
	private WebElement password;
	
	@FindBy(xpath = "//input[contains(@id,'confirmPassword')]")
	private WebElement confirmpassword;
	
	@FindBy(xpath = "//input[contains(@id,'role2')]")
	private WebElement supplier;
	
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement nextbillingbtn;
	
	@FindBy(xpath = "//input[contains(@id,'addressLineOne')]")
	private WebElement address1;
	
	@FindBy(xpath = "//input[contains(@id,'addressLineTwo')]")
	private WebElement address2;
	
	@FindBy(xpath = "//input[contains(@id,'city')]")
	private WebElement city;
	
	@FindBy(xpath = "//input[contains(@id,'postalCode')]")
	private WebElement postalcode;
	
	@FindBy(xpath = "//input[contains(@id,'state')]")
	private WebElement state;
	
	@FindBy(xpath = "//input[contains(@id,'country')]")
	private WebElement country;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-offset-4 col-md-8')]/button[2]")
	private WebElement nextconfirm;
	
	
	@FindBy(xpath = "//a[contains(@href,'eventId_submit')]")
	private WebElement confirm;
	
	@FindBy(xpath = "//div[contains(@class,'text-center')]/h6")
	private WebElement verifyTitle;
	
	
	
	public SignUpPageUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 30);
	}
	
	public void enterFirstName() throws InterruptedException {
		firstname.sendKeys("Rahul Singh");
		Thread.sleep(500);
	}
	
	public void enterLastName() throws InterruptedException {
		lastname.sendKeys("Kichi");
		Thread.sleep(500);
	}
	
	public void enterEmail() throws InterruptedException {
		email.sendKeys("singh.rahulllk@gmail.com");
		Thread.sleep(500);
	}
	
	public void enterContactNumber() throws InterruptedException {
		contactnumber.sendKeys("9999999999");
		Thread.sleep(500);
	}
	
	public void enterPassword() throws InterruptedException {
		password.sendKeys("Safari@5529");
		Thread.sleep(500);
	}
	
	public void enterConfirmPassword() throws InterruptedException {
		confirmpassword.sendKeys("Safari@5529");
		Thread.sleep(500);
	}
	
	/*public void clickSupplierIcon() throws InterruptedException {
		supplier.click();
		Thread.sleep(500);
		
	}*/
	
	public void clickOnNextBillingBtn() throws InterruptedException {
		nextbillingbtn.click();
		Thread.sleep(500);
	}
	
	public void enterAddress1() throws InterruptedException {
		address1.sendKeys("LIG 329 ");
		Thread.sleep(500);
	}
	
	public void enterAddress2() throws InterruptedException {
		address2.sendKeys("RAJIV NAGAR BYPASS ROAD BHOPAL");
		Thread.sleep(500);
	}
	
	public void enterCity() throws InterruptedException {
		city.sendKeys("Bhopal");
		Thread.sleep(500);
	}
	
	public void enterPostalCode() throws InterruptedException {
		postalcode.sendKeys("462041");
		Thread.sleep(500);
	}
	
	public void enterState() throws InterruptedException {
		state.sendKeys("MADHYA PRADESH");
		Thread.sleep(500);
	}
	
	public void enterCountry() throws InterruptedException {
		country.sendKeys("INDIA");
		Thread.sleep(500);
		}
	
	public void hoverPointerOnNextConfirmBtn() throws InterruptedException {
		//actions.moveToElement(nextconfirm).build().perform();
		nextconfirm.click();
		//Thread.sleep(500);
	}
	
	public void clickOnConfirmBtn1() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(confirm));
		actions.moveToElement(confirm).build().perform();
		confirm.click();
	}
	
	public String verifyTitle() {
		String title = verifyTitle.getText();
		return title;
	}

}
