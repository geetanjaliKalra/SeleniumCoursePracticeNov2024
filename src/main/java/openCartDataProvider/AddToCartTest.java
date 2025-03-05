package openCartDataProvider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

	@Parameters({ "username", "password" })
	@Test(description = "Open cart login test")
	public void loginTest(String username, String password) {

		By uname = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By logoutLink = By.linkText("Logout");

		eutil.doSendKeys(uname, username);
		eutil.doSendKeys(pwd, password);
		eutil.doClick(loginBtn);

		boolean logoutIsdisplayed = eutil.doIsDisplayed(logoutLink);
		Assert.assertEquals(logoutIsdisplayed, true, "==Login is not successfull==");

	}

	@DataProvider
	public Object getSearchData() {

		return new Object[][] {
			{ "Macbook", "MacBook Pro", 1 }, 
			{ "iPhone", "iPhone", 2 } 
		};
	}

	@Test(dependsOnMethods = "loginTest",dataProvider = "getSearchData")
	public void searchTest(String searchText,String product,int qty)  {
		By searchField = By.name("search");
		By itemLink= By.linkText(product);
		By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");
		By qtyField = By.id("input-quantity");
		By addToCartBtn= By.xpath("//button[text()='Add to Cart']");
		By successMsg=By.xpath("//div[@class='alert alert-success alert-dismissible']");
		eutil.doSendKeys(searchField, searchText);
		eutil.doClick(searchBtn);
		eutil.doClick(itemLink,5);
		eutil.doSendKeys(qtyField, String.valueOf(qty));
		eutil.doClick(addToCartBtn);
		
		String actualsuccessMsgTxt = eutil.waitForElementVisible(successMsg,5).getText().trim();
		System.out.println(actualsuccessMsgTxt);
		//Assert.assertTrue
		System.out.println((actualsuccessMsgTxt.contains("Success:You have added "+product+" to your shopping cart!")));
		
		
		
	}
}
