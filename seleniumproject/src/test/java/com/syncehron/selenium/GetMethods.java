package com.syncehron.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.getCurrentUrl();
	System.out.println();
	String title =driver.getTitle();
	System.out.println(title);
	driver.navigate().back();
	driver.navigate().forward();
	//for looping to click on check box
	List<WebElement> checks =driver.findElements(By.xpath("//input[@type='check'"));
	}
	
	

}
