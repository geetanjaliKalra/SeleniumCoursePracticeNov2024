package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		ElementUtil ele = new ElementUtil(driver);
		By country = By.name("Country");
		
/*		Select select = new Select(ele.getElement(country));

		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			if (e.getText().equalsIgnoreCase("India"))
				e.click();
			break;}*/
	
		ele.selectValueFromDropdown(country, "Brazil");
			}
		
	

}
