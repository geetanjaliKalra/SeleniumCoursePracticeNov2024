package SeleniumFundamentals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String browser = "Chrome";
		WebDriver driver;
		ReadProperty readProp = new ReadProperty();
		Properties prop = readProp.initprop();

		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser(prop.getProperty("browser"));
		brUtil.launchURL(prop.getProperty("url"));
		if (brUtil.getPageCurrentURL().contains("opencart"))
			System.out.println("URL is correct");
		if (brUtil.getPageTitle().equals("Your Store"))
			System.out.println("title is correct");
		
		brUtil.quitBrowser();
	}

}
