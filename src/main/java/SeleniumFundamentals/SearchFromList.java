package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFromList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		ElementUtil ele = new ElementUtil(driver);
		By searchField= By.id("twotabsearchtextbox");
		ele.doSendKeys(searchField, "mobile");
		Thread.sleep(1000);
		By searchResult= By.xpath("//div[@class='s-suggestion-container']//div[@role='button']");
		System.out.println(ele.getElementsText(searchResult));
		ele.doSearch(searchResult, "mobile 5+g");
		
		
		driver.quit();
	}

}
