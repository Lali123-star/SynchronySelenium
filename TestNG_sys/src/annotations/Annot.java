package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {
 @Test
	public void testCase1() {
		System.out.println("compose a mail");
	}
 
 @BeforeMethod
 public void bmethod() {
	 System.out.println("OpenBrowser,url,Login");
 }
 @AfterClass
 public void aclass() {
	 System.out.println("shutdownServer..");
 }
 @AfterMethod
 public void amethod() {
	 System.out.println("logout,CloseBrowser");
 }
 @BeforeClass
 public void bclass() {
	 System.out.println("Start server...");
 }
 @Test
	public void testCase2() {
		System.out.println("Save a mail");
}
 @Test
	public void testCase3() {
		System.out.println("Delete a mail");
 }
}