package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParmWithArray {
	@Test(dataProvider = "getdata1")
	public void testCase1(String cname,String password) {
		//selenium code to login
		System.out.println(cname+" password is "+password);
	}
	
	@DataProvider
	public Object[][] getdata1() {
		Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="pwd1";
		
		obj[1][0]="Name2";
		obj[1][1]="pwd2";
		
		obj[2][0]="Name3";
		obj[2][1]="pwd3";
		
		return obj;
	}
}
