package openCartTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
	
	@BeforeClass
	public void loginOpenCart() {
		driver.findElement(By.id("input-email")).sendKeys("gkalra88@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	

	@Test(description = "===Homepage title test====")
	public void homepagetitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "My Account");
	}

	@Test(description = "===Search field present test===")
	public void homepagesearchFieldTest() {
		boolean isSearchdisplayed = driver.findElement(By.xpath("//input[@name='search']")).isDisplayed();
		Assert.assertEquals(isSearchdisplayed, true);
	}
}
