package openCartDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	ElementUtil eutil;
	@BeforeTest
	@Parameters({ "browser", "URL" })
	public void setup(String browsername, String URL) {

		switch (browsername.toLowerCase().trim()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass the right browser " + browsername);
			throw new BrowserException("WRONG BROWSER PASSED");

		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		eutil= new ElementUtil(driver);
	}

	/*
	 * @AfterTest public void tearDown() { driver.quit(); }
	 */
}
