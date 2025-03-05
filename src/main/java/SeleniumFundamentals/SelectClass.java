package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		ElementUtil ele = new ElementUtil(driver);
		By country = By.name("Country");
		By emp = By.name("NoOfEmployees");
		/*
		 * Select select = new Select(ele.getElement(country));
		 * select.selectByIndex(11); Thread.sleep(1000);
		 * select.selectByVisibleText("Brazil"); List<WebElement>
		 * elements=select.getOptions();
		 * 
		 * for(WebElement e:elements) { System.out.println(e.getText()); }
		 */
		ele.doSelectByVisibleText(country, "India");
		ele.doSelectByVisibleText(emp, "11 - 50");
		System.out.println(ele.getAllOptions(emp));
		driver.quit();

	}

}
