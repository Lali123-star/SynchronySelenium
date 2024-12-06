package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Primepage {
	@FindBy(xpath="//span[text()=' Regular Price ']")
	  public WebElement regularprice;
	
	@FindBy(id="add-to-cart-button")
	public WebElement add2cart;
	
	public void selectregularpriceradio() {
		regularprice.click();
	}
	
	public void clickonadd2cart() {
		add2cart.click();
	}
}