package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		WebElement frame1= driver.findElement(By.xpath("//iframe[@id='pact1']"));
	
		
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Hello");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact2']")));
		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("love");
		driver.switchTo().parentFrame(); // switch to main parent frame
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().defaultContent(); //will redirect to main page
		System.out.println(driver.getTitle());
		
	}

}
