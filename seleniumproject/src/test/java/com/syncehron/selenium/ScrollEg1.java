package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://practicetestautomation.com/");
        Thread.sleep(2000);
        WebElement test =driver.findElement(By.xpath("(//a[normalize-space()='Practice Test Automation.'])[1]"));
	Actions act=new Actions(driver);
	act.scrollToElement(test).perform();
	Thread.sleep(2000);
	
	
	}

	
}
