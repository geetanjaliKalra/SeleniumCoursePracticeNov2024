package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		ElementUtil ele = new ElementUtil(driver);
		By searchField= By.id("twotabsearchtextbox11");
		ele.isElementDisplayed(searchField);
		ele.doIsDisplayed(searchField);
		
		driver.quit();
	}

}
