package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectObject {
	WebDriver driver;
	String Browser ="Chrome";
	@Test
	public void testCase1() throws Throwable {
		int temp = 0;
		SoftAssert st =new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
		     driver=new ChromeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("edge"))
			 driver=new EdgeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
		    driver=new FirefoxDriver();//openBrowser
	
		driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select object
				
				//driver.findElement(By.id("curLocation")).sendKeys("Delhi");
				//select object
				Select s =new Select(driver.findElement(By.id("curLocation")));
				//s.selectByIndex(3);
				//s.selectByValue("198360");
				//s.selectByVisibleText("Delhi");
				
				//driver.findElement(By.id("curLocation")).sendKeys("Delhi");
				
//				List<WebElement> li = s.getOptions();
//				System.out.println("Total place: "+li.size());
//				
//				for(WebElement x : li) {
//					//System.out.println(x.getText());
//					if(x.getText().equalsIgnoreCase("Anand"))
//						temp++;
//				}
//				st.assertEquals(temp>0, true,"Expected place does not exist");
//				
				
				st.assertAll();
				List<WebElement> li = driver.findElements(By.xpath("//optgroup[@label='   Karnataka']/option"));
				for(WebElement x : li) {
					System.out.println(x.getText());
				}
}
}
