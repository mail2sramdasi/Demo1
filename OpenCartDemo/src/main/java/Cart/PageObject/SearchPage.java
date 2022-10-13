package Cart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver = null;
	
	public SearchPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "") WebElement element;
	@FindBy (xpath = "") WebElement element1;
	

	
	
	
	
	
}
