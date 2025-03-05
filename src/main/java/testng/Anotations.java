package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@Test(priority=1, description = "Title test")
	public void loginPageTitleTest() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login11","Title not Matched");
	}

	@Test(description="login page url test")
	public void loginPageURLTest() {

		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}
	
	@Test(description="Login Page logo test")
	public void loginPageLogoTest() {
		
		boolean logodisplayed = driver.findElement(By.className("img-responsive")).isDisplayed();
		Assert.assertTrue(logodisplayed);
	}
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
