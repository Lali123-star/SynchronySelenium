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

public class WebTableDemo {
	WebDriver driver;
	String Browser ="Chrome";
	@Test
	public void testCase1() throws Throwable {
		SoftAssert st =new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
		     driver=new ChromeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("edge"))
			 driver=new EdgeDriver();//openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
		    driver=new FirefoxDriver();//openBrowser
	
		driver.get("https://money.rediff.com/gainers");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		st.assertAll();
//		List<WebElement> li = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table"));
//		for(WebElement x : li) {
//			System.out.println(x.getText());
//}
		//WebTable
		List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
		System.out.println("rows ="+li.size());
		for(WebElement x : li) {
			if(x.getText().equalsIgnoreCase("TCM Ltd.")) {
				x.click();
				break;
			}
		}
		
		System.out.println(driver.getTitle());
}
}