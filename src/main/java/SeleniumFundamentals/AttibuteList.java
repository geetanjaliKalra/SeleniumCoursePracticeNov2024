package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttibuteList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		ElementUtil ele = new ElementUtil(driver);
		By links = By.tagName("a");
		driver.get("https://www.bigbasket.com/");
		/*
		 * List<WebElement> elements = ele.getElements(img);
		 * 
		 * for(WebElement e:elements) { String attrValue = e.getAttribute("src");
		 * if(attrValue!=null) System.out.println(e.getAttribute("src")); }
		 */
		ele.doGetElementsAttribute(links,"href");
		driver.quit();
	}

}
