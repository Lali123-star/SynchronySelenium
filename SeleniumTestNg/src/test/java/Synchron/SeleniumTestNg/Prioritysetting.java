package Synchron.SeleniumTestNg;

import org.testng.annotations.Test;

public class Prioritysetting {
	@Test(priority=0)
	public void launchbrowser() {
		System.out.println("Launching browswe");
		
	}
	@Test(priority=1)
	public void login() {
		System.out.println("logging in");
		
	}
	
	

}
