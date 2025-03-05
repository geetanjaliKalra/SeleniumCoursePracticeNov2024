package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		ElementUtil eleutil=new ElementUtil(driver);
		Actions act=new Actions(driver);
		Alert alert;
		By sourceElement= By.xpath("//span[text()='right click me']");
		
		
		act.contextClick(eleutil.getElement(sourceElement)).perform();
		
		List<WebElement> elements = driver.findElements(By.cssSelector("ul.context-menu-list > li.context-menu-item >span"));
		
		for(WebElement e:elements) {
			act.contextClick(eleutil.getElement(sourceElement)).perform();
			e.click();
			alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
			
			
			
		}
		
		
		
	}

}
