package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.londonfreelance.org/courses/frames/index.html");

		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		// driver.switchTo().fra
		System.out.println(frames.size());
//		 driver.switchTo().frame("navbar");
//		 System.out.println("frame title is "+driver.getTitle());
		
		  
		  for (WebElement f : frames) {
		  
		  String frameName = f.getAttribute("name");
		  driver.switchTo().frame(frameName);
		  System.out.println("frame title is "+driver.getTitle());
		  driver.switchTo().defaultContent();
		  System.out.println("main page title is "+driver.getTitle()); }
		 

		driver.quit();
	}

}
