package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsPresentIsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By footerlinks = By.xpath("//a[@Class='pHiOh']|//div[@jsname='LgbsSe']");
		ElementUtil ele = new ElementUtil(driver);

		ele.isElementDisplayed(footerlinks, 7);

		driver.quit();
	}

}
