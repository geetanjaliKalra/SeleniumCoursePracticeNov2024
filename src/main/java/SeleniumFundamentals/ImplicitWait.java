package SeleniumFundamentals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("abc");
		driver.findElement(By.id("input-password")).sendKeys("123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
		
		//latest wait time is 5 seconds
		driver.findElement(By.xpath("//input[@value='Login1111']")).sendKeys("123");  
		
		// wait is applicable for all the elements not a particular element.
		
	
	
	}

}
