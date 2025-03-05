package DiffBrowsers;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test(description = "==Login test==")
	public void loginTest() {
		driver.findElement(By.id("input-email")).sendKeys("gkalra88@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean logoutIsdisplayed = driver.findElement(By.linkText("Logout")).isDisplayed();
		Assert.assertEquals(logoutIsdisplayed, true);
	}

	@Test(description="==Login page title test==")
	public void loginPageTitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
}
