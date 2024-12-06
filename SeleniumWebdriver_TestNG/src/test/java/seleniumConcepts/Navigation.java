package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Navigation {
	WebDriver driver;
	String Browser ="Chrome";
	@Test
	public void testCase1() throws Throwable {
		SoftAssert st =new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
		     driver=new ChromeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("edge"))
			 driver=new EdgeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
		    driver=new FirefoxDriver();//openBrowser
	
		driver.get("https://www.yahoo.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on signIn
		driver.findElement(By.linkText("Sign in")).click();//login page
		//navigate back
		driver.navigate().back(); //home page 
		//navigate forward
		driver.navigate().forward(); // loginpage
		//Enter username
		driver.findElement(By.id("login-username")).sendKeys("Tester");
		//Refresh a page
		//driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());//Refresh a page	
}
}
