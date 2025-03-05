package SeleniumFundamentals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert= driver.switchTo().alert();
		alert.sendKeys("hello how are you?");
		alert.accept();
		
	}

}
