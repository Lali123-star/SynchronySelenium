package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.Departmentpage;
import pageFactory.Itemspage;
import pageFactory.Primepage;
import pageFactory.Successmsgpage;

public class TestBase {
	public static Properties prop;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;
	public static Homepage hp;
	public static Departmentpage dp;
	public static Itemspage ip;
	public static Primepage pp;
	public static Successmsgpage sp;
	
	@BeforeSuite
	public static void openBrowser() throws Throwable {
		st = new SoftAssert();
		prop=new Properties();
		prop.load(new FileReader("src\\test\\java\\conflect\\Global.properties"));
		Browser=prop.getProperty("Browser");
		System.out.println("Browser choosen is "+Browser);
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();	
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initclass();
	}
	public static void initclass() {
		 hp = PageFactory.initElements(driver, Homepage.class);
		 dp = PageFactory.initElements(driver, Departmentpage.class);
		 ip = PageFactory.initElements(driver, Itemspage.class);
		 pp = PageFactory.initElements(driver, Primepage.class);
		 sp = PageFactory.initElements(driver, Successmsgpage.class);
	}
	@AfterSuite
	public static void closeBrowser() {
		driver.quit();
	}
}
