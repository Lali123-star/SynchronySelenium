package com.syncehron.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement  celldata = driver.findElement(By.xpath("//table[@class='demo-table']"));
       String text= celldata.getText();
       //if(text.equalsIgnoreCase(exceptedtext)) {
	}

}
