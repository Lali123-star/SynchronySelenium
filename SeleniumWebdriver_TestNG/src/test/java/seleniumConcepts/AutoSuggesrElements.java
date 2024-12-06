package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutoSuggesrElements {
	WebDriver driver;
	String Browser ="Chrome";
	@Test
	public void testCase1() throws Throwable {
		int temp=0;
		SoftAssert st =new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
		     driver=new ChromeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("edge"))
			 driver=new EdgeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
		    driver=new FirefoxDriver();//openBrowser
	
		driver.get("https://www.yahoo.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter bang in the search box
		driver.findElement(By.id("ybar-sbq")).sendKeys("bang");
		//Auto suggest element
		List<WebElement> li = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("Total suggested items ="+li.size());
		Iterator<WebElement> it = li.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next().getText());
			WebElement cElement = it.next();
			if(cElement.getText().equalsIgnoreCase("Bangkok Airways")) {
				cElement.click();
				break;
			}
		}
		System.out.println("title="+driver.getTitle());
}
}
