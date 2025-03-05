package SeleniumFundamentals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadProperty rp = new ReadProperty();
		Properties prop = rp.initprop();
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser(prop.getProperty("browser"));
		brUtil.launchURL(prop.getProperty("url"));
		System.out.println(brUtil.getPageTitle());
		
		ElementUtil elUtil=new ElementUtil(driver);
		
		By id= By.id("input-email");
		By pwd= By.id("input-password");
		
		elUtil.doSendKeys(id, "gkalra88@gmail.com");
		elUtil.doSendKeys(pwd, "abc@1234");
		String attributeValue=elUtil.doGetAttribute(id, "value");
		System.out.println(attributeValue);
		
		brUtil.quitBrowser();
	}

}
