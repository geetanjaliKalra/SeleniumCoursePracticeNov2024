package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//a[@Class='pHiOh']|//div[@jsname='LgbsSe']"));
		
		System.out.println(footerLinks.size());
		
		
		for (WebElement e : footerLinks) {
			String optionValue = e.getText();
			System.out.println(optionValue);
	}

}
}