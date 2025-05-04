package SeleniumFundamentals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationOfTablesMultipleOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Denmark");
		countries.add("Hong Kong");
		// String countryName = "Hong Kong";
		// By searchCountryXpath = By.xpath("//td[text()='" + countryName + "']");
		// By selectCountryXpath = By.xpath("//td[text()='" + countryName +
		// "']/..//td/input[@type='checkbox']");
		By nextBtnXpath = By.xpath("//button[@aria-label='Next']");
		Thread.sleep(20000);
		selectMultipleOptions(countries,nextBtnXpath);
	}

//1. Single country selection	
	/*
	 * public static void selectCountry(By locator, By selectCountryLocator,By
	 * nextLocator) {
	 * 
	 * while (true) {
	 * 
	 * if (driver.findElements(locator).size() > 0) {
	 * driver.findElement(selectCountryLocator).click(); break; } else {
	 * if(!driver.findElement(nextLocator).getAttribute("class").contains("disabled"
	 * )) { driver.findElement(nextLocator).click(); } }
	 * 
	 * }
	 */

	public static void selectMultipleOptions(List<String> options, By nextLocator) {

		int optionsSize = options.size();
		System.out.println("options size is "+ optionsSize);
		for (int i=0;i<optionsSize;i++) {
			String option=options.get(i);
			while (true) {
				By optionLocator = By.xpath("//td[text()='" + option + "']");
				By checkboxLocator=By.xpath("//td[text()='" + option +"']/..//td/input[@type='checkbox']");
				System.out.println("xpath of "+ option +"is "+optionLocator);
				if(driver.findElements(optionLocator).size()>0) {
					driver.findElement(checkboxLocator).click();
					break;
				}
				
	else {
		if(!driver.findElement(nextLocator).getAttribute("class").contains("disabled"))
				 driver.findElement(nextLocator).click(); 
				 
		}
				}
			}
		}

}