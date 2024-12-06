package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Itemspage {	
	@FindBy(xpath="//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[1]/div/a/div[1]/div/div")
	  public WebElement firstitem;
	
	public void clickonfirstitem() {
		firstitem.click();
	}
}
