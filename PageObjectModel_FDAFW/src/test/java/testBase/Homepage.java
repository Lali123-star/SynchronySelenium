package testBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	//WebElements + BusinessLogics(UDFs)
		//WebElement todaysdeal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		@FindBy(xpath="//input[@data-action-type='DISMISS']") 
		public WebElement dismiss;
		
		@FindBy(xpath="//a[text()=\"Today's Deals\"]") 
		public WebElement todaysdeal;
		
		public void clickondismiss() {
			dismiss.click();
		}
		
		public void clickontodaysdeal() {
			todaysdeal.click();
		}
}
