package in.SwiggyApp.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
	WebDriver driver;
	
	
	@BeforeTest
	public void launchApplication() {
		
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.simplilearn.com/");
		driver.get("https://www.swiggy.com/");
		
		
	
		
		//driver.get("https://www.simplilearn.com/job-guarantee-programs/");
		
		
       // driver.get("https://www.simplilearn.com/java-full-stack-developer-certification-training-course");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	

}
