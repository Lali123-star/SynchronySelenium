package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FrameConsept {
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
	
		driver.get("https://jqueryui.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on Selectable
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
		//click on item4
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		
		driver.switchTo().frame(0);
		driver.switchTo().parentFrame(); //switch to parent frame
		driver.switchTo().parentFrame().switchTo().parentFrame();//switch to grandparent frame
		
		driver.switchTo().frame(0).switchTo().frame(1);
	
}
}
