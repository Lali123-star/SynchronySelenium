package com.syncehron.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AtersEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int size=links.size();
		for(WebElement link :links) {
			System.out.println(link.getText());
		}
		

	}

}
