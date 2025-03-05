package SeleniumFundamentals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil elementUtil = new ElementUtil(driver);

		By username = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

		/*
		 * elementUtil.doSendKeys(username, "gkalra88@gmail.com");
		 * elementUtil.doSendKeys(password, "abc@1234");
		 * 
		 * WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.presenceOfElementLocated(loginBtn)).click();
		 */

		elementUtil.doSendKeys(username, "gkalra88@gmail.com", 5);
		elementUtil.doSendKeys(password,"abc@1234");
		elementUtil.doClick(loginBtn, 2);
		elementUtil.waitForTitleConatins("My", 5);
	}

}
