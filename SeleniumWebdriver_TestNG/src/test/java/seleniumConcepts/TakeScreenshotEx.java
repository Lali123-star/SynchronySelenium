package seleniumConcepts;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;
import java.util.selenium.io.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class TakeScreenshotEx {
	WebDriver driver;
	String Browser ="Chrome";
	@Test
	public void testCase1() throws Throwable  {
		SoftAssert st =new SoftAssert();
		driver=new ChromeDriver();
	
		driver.get("https://www.drikpanchang.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Take screen shot
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("Testpic.png"));
		Shutterbug.shootPage(drive,Capture.FULL).withName("Fullpageimg").save();
		
		WebElement logo = driver.findElement(By.xpath("/html/body/header/a[2]/img"));
		//Shutterbug.shootElement(driver, logo).withName("ExpLogo").save();
		
		boolean results = Shutterbug.shootElement(driver, logo).equals(ImageIO.read(new File("screenshots\\ExpLogo.png")));
		//st.assertEquals(results, true);
		st.assertTrue(results);
		
		st.assertAll();
}		
	}
