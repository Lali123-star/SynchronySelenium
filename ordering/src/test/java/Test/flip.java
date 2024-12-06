package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flip {
	public void load()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.flipkart.com/");
	}

}
