package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("admin");
		//name locators
		WebElement password=driver.findElement(By.id("password"));
		//class name 
		WebElement login= driver.findElement(By.className("42ft_44fy"));
		login.click();
		WebElement forgotpassword=driver.findElement(By.linkText("forgot password"));
		forgotpassword.click();
		//partial link text
		WebElement forgotpassword1=driver.findElement(By.partialLinkText("forgot password1"));
		forgotpassword.click();
		//xpath 
		WebElement createaccount =driver.findElement(By.xpath("//html[1]/body[1]/div[1]"));
		createaccount.click();
		
		
	}

}
