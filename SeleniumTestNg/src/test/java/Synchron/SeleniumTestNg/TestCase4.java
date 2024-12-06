package Synchron.SeleniumTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {
@Test(groups ={"Regression","sanity"})
public void Checkboxradio() throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement databox=driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
	driver.switchTo().frame(databox);
	WebElement df=driver.findElement(By.xpath("//input[id='datepicker']"));
	df.click();
	WebElement date= driver.findElement(By.xpath("//a[@class='ui-state-default'])[5]"));
	date.click();
	
}

}
