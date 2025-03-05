package openCartTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest  {
	
	@BeforeClass
	public void clickOnForgotPassword() {
		driver.findElement(By.linkText("Forgotten Password")).click();
	}
	
	@Test
	public void forgotYoutPasswordPageTest() {
		boolean isheaderdisplayed = driver.findElement(By.xpath("//h1[text()='Forgot Your Password?']")).isDisplayed();
		Assert.assertEquals(isheaderdisplayed, true);
	}
}
