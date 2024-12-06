package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.Departmentpage;
import pageFactory.Itemspage;
import pageFactory.Primepage;
import pageFactory.Successmsgpage;
import testBase.Homepage;
import testBase.TestBase;

public class Test2 extends TestBase {
	@Test
	public void testCase2() throws Throwable {
	//	openBrowser();
		//Homepage hp=new Homepage();
//		Homepage hp = PageFactory.initElements(driver, Homepage.class);
//		Departmentpage dp = PageFactory.initElements(driver, Departmentpage.class);
//		Itemspage ip = PageFactory.initElements(driver, Itemspage.class);
//		Primepage pp = PageFactory.initElements(driver, Primepage.class);
//		Successmsgpage sp = PageFactory.initElements(driver, Successmsgpage.class);
//		
		hp.clickondismiss();
		hp.clickontodaysdeal();
		dp.clickonseemore();
		dp.selectradio("Movies & TV");
		ip.clickonfirstitem();
		pp.selectregularpriceradio();
		pp.clickonadd2cart();
		sp.verifysuccessmsg();
		
	//	closeBrowser();
	}
}
