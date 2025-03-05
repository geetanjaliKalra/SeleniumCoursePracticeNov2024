package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

		driver.manage().window().maximize();

		WebElement baseElement = driver.findElement(By.xpath("//p[contains(text(),'Huaian')]"));

		System.out.println(driver.findElement(with(By.xpath("//div[@title='303']")).toRightOf(baseElement)).getText());
		
		System.out.println(driver.findElement(with(By.xpath("//p[contains(text(),'Yancheng')]"))
				.below(baseElement)).getText());

	}
}
