package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement hover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement top=driver.findElement(By.xpath("(//a[normalize-space()='Top'])[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(top).perform();
		act.click(top).perform();
		driver.findElement(By.xpath("(//img[@class='logoClass'])[1]"));
		
		
		

	}

}
