package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// to freeze the screen to find element use
		/**
		 * after entering in search box field
		 * 
		 * setTimeout(() => {debugger}, 5000);
		 */

		WebDriver driver = new ChromeDriver();
		ElementUtil ele = new ElementUtil(driver);
		driver.get("https://www.flipkart.com/");

		
		By searchField = By.xpath("//input[@name='q']");
		By searchResults = (By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']"));
		ele.doSendKeys(searchField, "mobile");
		Thread.sleep(1000);
		ele.doSearch(searchResults, "mobile stand");
		
		driver.quit();
		

		

	}

}
