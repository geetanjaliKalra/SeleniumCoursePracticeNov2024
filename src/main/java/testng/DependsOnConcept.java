package testng;

import org.testng.annotations.Test;


public class DependsOnConcept {
	
	@Test
	//(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		
		System.out.println("login test");
		//int i=9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	
	public void searchTest() {
		System.out.println("search test");
	}
	
@Test(dependsOnMethods = "searchTest")
	
	public void addToCartTest() {
		System.out.println("add to cart test");
	}
}
