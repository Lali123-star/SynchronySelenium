package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
	@Test
	public void hardAssert() {
		
		int Explinks=10;
		int Actlinks=12; //Selenium code
		
		System.out.println("A");
		//try {
		Assert.assertEquals(Actlinks, Explinks);
		//}catch(Throwable t ) {
		//	System.out.println(t.getMessage());
		}
	//	System.out.println("B");
	}