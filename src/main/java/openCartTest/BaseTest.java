package openCartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
