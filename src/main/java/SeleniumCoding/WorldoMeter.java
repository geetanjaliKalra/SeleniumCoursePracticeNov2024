package SeleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldoMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");

		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@rel='births_today']"));

		
		System.out.println(driver.findElement(By.xpath("//span[@rel='births_today']")).getText());
			for (WebElement e : elements) {
				
				System.out.println(e.getText());
			}
		
	}

}
