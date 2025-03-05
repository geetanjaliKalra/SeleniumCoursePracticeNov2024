package DiffBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test
	public void titleTest() {

		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "Google", "==Wrong title===");
	}

	@Test
	public void searchFieldDisplayTest() {
		By searchField = By.xpath("//textarea[@title='Search']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement issearchFieldPresent = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
		Assert.assertEquals(issearchFieldPresent.isDisplayed(), true, "==Search field is not present===");
	}

}
