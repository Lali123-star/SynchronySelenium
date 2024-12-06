package annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Order2 {
	@Test(priority=1)
	public  void login() {
		//selenium code to Login
		System.out.println("Login");
	}
	@Test(priority=2,enabled = false)
	//@Test(priority=2)
	public  void composemail() {
		//selenium code to composemail
		//System.out.println("composemail");
		throw new SkipException("Reason");
	}
	@Test(priority=3)
	public void Deletemail() {
		//selenium code to Deletemail
		System.out.println("Deletemail");
	}
}
