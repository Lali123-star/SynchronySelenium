package Synchron.SeleniumTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertingEg {
	@Test
public void softassertion() throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String expectedtitle="orange";
	String actualtitle=driver.getTitle();
	SoftAssert   soft =new SoftAssert();
	soft.assertEquals(actualtitle, expectedtitle);
	//hard assertion
	Assert.assertEquals(actualtitle, expectedtitle);
	driver.get("https://www.orangehrm.com/");
	Thread.sleep(2000);
}
}
