package Ganesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bava {
	WebDriver driver;
	public Bava(	WebDriver driver)
	{
		this.driver=driver;
	}

	 public  WebDriver enter() throws InterruptedException{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}

}
