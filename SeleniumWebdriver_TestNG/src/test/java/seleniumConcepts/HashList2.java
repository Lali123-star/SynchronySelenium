package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HashList2 {
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
	
		driver.get("https://www.opencart.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Retrive all links
		//List<WebElement> li = driver.findElements(By.xpath("//a"));
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links ="+li.size());
		st.assertEquals(li.size(), 81,"Number of links are mis-matching");
		
		for(WebElement x : li) {
			//if(!x.getText().isEmpty())
				//System.out.println(x.getText());
			if(x.getText().equalsIgnoreCase("Demo"))
				temp=temp+1;
			}
			st.assertTrue(temp>0,"Expected link does not exist");
			
			st.assertAll();
			
		
		
}
}
