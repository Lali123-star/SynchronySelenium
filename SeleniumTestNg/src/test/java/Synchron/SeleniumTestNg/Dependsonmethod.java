package Synchron.SeleniumTestNg;

import org.testng.annotations.Test;

public class Dependsonmethod {
	@Test
	public void login() {
		System.out.println("login");
		
	}
	@Test(dependsOnMethods= {"login"})
	public void addtocart() {
		System.out.println("add to cart");
		
	}

}
