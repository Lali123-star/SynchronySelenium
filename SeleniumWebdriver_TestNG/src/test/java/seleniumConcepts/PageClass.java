package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PageClass {
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
	
		driver.get("https://www.opencart.com/");//openBrowser
		driver.manage().window().maximize();//maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PageClass p = PageFactory.initElements(driver, PageClass.class);
		System.out.println("x="+p.login.getLocation().getX());
		driver.navigate().refresh(); //dynamic objects
		System.out.println("y="+p.login.getLocation().getY());
		driver.navigate().refresh(); //dynamic objects
		System.out.println("text ="+p.login.getText());
		p.login.click();
		
		/*
	//	WebElement login = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]"));
		driver.navigate().refresh(); //dynamic objects
		System.out.println("x="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getLocation().getX());
		driver.navigate().refresh(); //dynamic objects
		System.out.println("y="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getLocation().getY());
		driver.navigate().refresh(); //dynamic objects
		System.out.println("heigth="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getSize().height);
		driver.navigate().refresh(); //dynamic objects
		System.out.println("width="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getSize().width);
		driver.navigate().refresh(); //dynamic objects
		System.out.println("font size ="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getCssValue("font-size"));
		driver.navigate().refresh(); //dynamic objects
        System.out.println("text ="+driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).getText());
    	driver.navigate().refresh(); //dynamic objects
    	driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
		*/
		
}
@FindBy(xpath="//*[@id=\"navbar-collapse-header\"]/div/a[1]")
	public WebElement login;
}
