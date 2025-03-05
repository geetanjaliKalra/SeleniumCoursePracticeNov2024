package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		int blankLinks=0;
		int linksWithText=0;
		By links=By.tagName("a");
		By images=By.tagName("img");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println(linksList.size());
		
		for(WebElement e:linksList) {
			String linkText=e.getText();
			if(linkText.length()!=0) {
				linksWithText++;
				
				System.out.println(e.getText());
			}
			else
			{
				blankLinks++; 
				
			}
			
		}
		System.out.println("links with text "+linksWithText);
		System.out.println("links without text "+blankLinks);
		
		ElementUtil ele= new ElementUtil(driver);
		System.out.println(" images on the page"+ele.getElementCount(images));
		
		System.out.println(ele.getElementsText(links));
		
		driver.quit();
	}

}
