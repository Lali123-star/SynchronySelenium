package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Jclass {
	SoftAssert st =new SoftAssert();
	WebDriver driver;
	String Browser = "firefox";

	@Test
	public void testCase1() {

		if (Browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();// openBrowser
		else if (Browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();// openBrowser
		else if (Browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();// openBrowser

		driver.get("https://jqueryui.com/");// openBrowser
		driver.manage().window().maximize();// maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on selectable
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/aside[1]/ul/li[4]/a")).click();
		driver.switchTo().fr
		driver.findElement(By.xpath("/html/body/ol/li[4]")).click();
		
}
}