package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ToolTip {
	
	SoftAssert st =new SoftAssert();
	driver=new ChromeDriver();
	//validate tool tip msg
	driver.navigate().to("https://www.opencart.com/");
	System.out.println("Title ="+driver.getTitle());
	st.assertEquals(driver.getTitle(), "OpenCart - Open Source Shopping Cart Solution");
	//Tool tip msg
	String tooltipmsg = driver.findElement(By.xpath("html/body/header/nav/div/div[1]/a/img")).getAttribute("title");
	System.out.println("Tool tip msg: "+tooltipmsg);
	st.assertEquals(tooltipmsg, "OpenCart - Open Source Shopping Cart Solution");
	
	
	st.assertAll();
	
}
}