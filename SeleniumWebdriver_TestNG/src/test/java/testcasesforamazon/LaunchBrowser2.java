package testcasesforamazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchBrowser2 {
	SoftAssert st =new SoftAssert();
	WebDriver driver;
	String Browser = "edge";

	@Test
	public void testCase1() {

		if (Browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();// openBrowser
		else if (Browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();// openBrowser
		else if (Browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();// openBrowser

		driver.get("https://www.amazon.com");// openBrowser
		driver.manage().window().maximize();// maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on dismiss
		driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
		// click on todays deal
		WebElement todaysdeal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		todaysdeal.click();
		// click on seemore
		driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a")).click();
		// select "movie and tv" Radio button
		driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[18]/div/label/span/span"))
				.click();
		// Thread.sleep(6000);
		// click on first item
		driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div/a/div[1]/div/div"))
				.click();

		//click on Add2Cart
				driver.findElement(By.id("add-to-cart-button")).click();
				//verifysucessmsg
				String text = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
				System.out.println("Actual text ="+text);
				st.assertEquals(text, "Added to Cart","expected text mis-matches");
				
				driver.quit();  // kill the instance , releases memory, all tabs will closed
				//driver.close(); //not kill the instance, not releases memory, only close current tab/window
				
				st.assertAll();
	}
}
