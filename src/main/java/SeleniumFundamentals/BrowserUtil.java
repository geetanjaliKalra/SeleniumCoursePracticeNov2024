package SeleniumFundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		System.out.println("Browser name is " + browserName);

		switch (browserName.trim().toLowerCase()) {
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
			System.out.println("Invalid browser name passed" + browserName);
			throw new BrowserException("Invalid browser");

		}

		return driver;
	}

	public void launchURL(String URL) {

		if (URL == null) {
			throw new BrowserException("Invalid URL");
		}
		if (URL.isEmpty() || URL.isBlank()) {
			throw new BrowserException("URL is blank or empty");
		}
		if (URL.indexOf("http") != 0) {
			throw new BrowserException("Wrong URL passed");

		}

		driver.get(URL.trim());
	}

	public String getPageTitle() {
		String title=driver.getTitle();
		if(title==null) {
			System.out.println("Title is null");
		}
		return title;
	}

	public String getPageCurrentURL() {

		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
