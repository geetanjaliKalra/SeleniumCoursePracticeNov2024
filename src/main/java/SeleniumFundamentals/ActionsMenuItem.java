package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMenuItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions act= new Actions(driver);
		ElementUtil ele= new ElementUtil(driver);
		driver.get("https://www.spicejet.com/");
		By sourceElement = By.xpath("//div[text()='SpiceClub' and contains(@class,'1pzd9i8')]");
		By targetElement= By.xpath("//div[text()='Tiers' ]");
		act.moveToElement(ele.getElement(sourceElement)).perform();
		ele.getElement(targetElement).click();
		
	
	}
	
}
