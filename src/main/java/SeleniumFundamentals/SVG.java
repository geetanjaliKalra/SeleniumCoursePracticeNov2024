package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[local-name()='svg' and @width='16']")).click();
		//or 	driver.findElement(By.xpath("//*[name()='svg' and @width='16']")).click();
	}

}
