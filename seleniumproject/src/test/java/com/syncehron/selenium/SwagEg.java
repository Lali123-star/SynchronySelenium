package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("(//input[@id='user-name'])[1]"));
		WebElement password=driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		WebElement login=driver.findElement(By.xpath("(//input[@id='login-button'])[1]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		Actions act=new Actions(driver);
		WebElement addtocart=driver.findElement(By.xpath("div[id='inventory_container'] div:nth-child(2) div:nth-child(2) div:nth-child(2) div:nth-child(1)"));
		addtocart.click();
		WebElement opentocart=driver.findElement(By.xpath("(//a[@class='shopping_cart_link'])[1]"));
		opentocart.click();
		
		
		
	}

}
