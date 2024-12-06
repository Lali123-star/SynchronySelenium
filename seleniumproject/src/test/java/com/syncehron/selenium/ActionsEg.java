package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a'])[1]"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='column-b'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).perform();
	}

}
