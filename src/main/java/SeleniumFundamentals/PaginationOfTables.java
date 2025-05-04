package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationOfTables {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		String countryName = "Hong Kong";
		By searchCountryXpath = By.xpath("//td[text()='" + countryName + "']");
		By selectCountryXpath = By.xpath("//td[text()='" + countryName + "']/..//td/input[@type='checkbox']");
		By nextBtnXpath=By.xpath("//button[@aria-label='Next']");
		Thread.sleep(10000);
		selectCountry(searchCountryXpath,selectCountryXpath,nextBtnXpath);
	}

//1. Single country selection	
	public static void selectCountry(By locator, By selectCountryLocator,By nextLocator) {

		while (true) {

			if (driver.findElements(locator).size() > 0) {
				driver.findElement(selectCountryLocator).click();
				break;
			}
			else {
				if(!driver.findElement(nextLocator).getAttribute("class").contains("disabled")) {
					driver.findElement(nextLocator).click();
				}
			}
				
		}

	}
}