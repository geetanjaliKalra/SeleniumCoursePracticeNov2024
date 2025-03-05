package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromDropdownWithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		ElementUtil ele = new ElementUtil(driver);
		By emp = By.xpath("//select[@name='NoOfEmployees']/option");
		By country = By.xpath("//select[@name='Country']/option");
		
		
		List<WebElement> options = ele.getElements(emp);

		for (WebElement e : options) {
			String optionValue = e.getText();
			if (optionValue.equalsIgnoreCase("11 - 50")) {
				e.click();
				break;
			}
			
			ele.selectValueFromDropdownWithoutSelect(country, "Brazil");
		}
	}
}
