package com.syncehron.selenium;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertEG {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown=driver.findElement(null);
		WebElement simplealert=driver.findElement(By.xpath("//button='jsalert'"));
		simplealert.click();
		Alert alt1= driver.switchTo().alert();
		alt1.dismiss();

	}

}
