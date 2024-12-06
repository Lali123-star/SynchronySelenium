package com.syncehron.selenium;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DynamicTable {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
driver.navigate().to("https://ui.cogmento.com/");
Thread.sleep(2000);
driver.manage().window().maximize();
 
driver.findElement(By.name("username")).sendKeys("lalithyas1999@gmail.com");
driver.findElement(By.name("password")).sendKeys("L@lali12");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.switchTo().frame("mainpanel");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
 
String before="//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[";
String after="]/td[2]";
 
for(int i=1 ; i<=4 ; i++) {
	String name = driver.findElement(By.xpath(before + i + after)).getText();
	System.out.println(name);
	if(name.contains("peter john")) {
		driver.findElement(By.xpath("//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr["+i+"]/td[1]")).click();
	}
}
 
	}
 
}
 