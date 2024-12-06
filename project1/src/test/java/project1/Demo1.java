package project1;

import java.util.*;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import Ganesh.Bava;

import java.util.ArrayList;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		Bava.enter();
		WebElement ele =driver.findElement(By.xpath("//at"));
		ele.sendKeys("iwatch");
		//driver.findElement(By.xpath("input[@type='submit'])[3]")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Shop online at Amazon India']")).click();
		Thread.sleep(3000);
		//Select all = new Select(driver.findElement(By.xpath("//select[@name='url']")));
		//all.selectByVisibleText("Baby");
		//Thread.sleep(3000);
		//all.selectByIndex(3);
		
		
		

}
}
