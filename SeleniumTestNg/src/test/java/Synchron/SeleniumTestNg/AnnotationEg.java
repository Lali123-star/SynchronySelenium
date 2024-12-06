package Synchron.SeleniumTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationEg {
	@Test
	public void testcase1() {
		System.out.println("Excuting testcase1");
	}
	public void testcase2() {
		System.out.println("Excuting testcase2");
	}
	public void testcase3() {
		System.out.println("Excuting testcase3");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Opening the browser");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("closing the browser");
}
	@BeforeClass
	public void beforeclass() {
		System.out.println("DB connection opening");
}
	@AfterClass
	public void afterclass() {
		System.out.println("DB connection closing");
}
}
