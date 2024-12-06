package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Departmentpage {

	@FindBy(xpath="//a[text()='See more']")
	public WebElement seemore;
	
	@FindBy(xpath="//span[text()='Appliances']")
	public WebElement appliances;
	
	@FindBy(xpath="//span[text()='Movies & TV']")
	public WebElement movieandtv;
	
	@FindBy(xpath="//span[text()='Sports & Outdoors']")
	public WebElement sports;
	
	public void clickonseemore() {
		seemore.click();
	}
	
	public void selectradio(String radio) {
		if(radio.equalsIgnoreCase("appliances"))
			appliances.click();
		else if(radio.equalsIgnoreCase("movieandtv"))
			movieandtv.click();
		else if(radio.equalsIgnoreCase("sports"))
			sports.click();
	}
	
	
	
}
