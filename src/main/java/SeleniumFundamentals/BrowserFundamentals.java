package SeleniumFundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFundamentals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		WebDriver driver1= new EdgeDriver();
		driver.get("https:/www.google.com");
		driver1.get("https:/www.google.com");
		
		
	}

}
