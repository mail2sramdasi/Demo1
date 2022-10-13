package Cart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	 public  WebDriver driver = null;
	 Actions act =null;
	 
	public HomePage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy (xpath= "//a[@title='My Account']") WebElement myAccount;
	@FindBy (xpath= "//a[text()='Register']") WebElement register;
	@FindBy (xpath= " //a[text()='Login']") WebElement login;
	@FindBy (xpath= " ") WebElement element1;
	
	
	public String registerCheck() throws Exception
	{
		Thread.sleep(1000);
		myAccount.click();
		register.click();
		return driver.getTitle();		
	}
	
	public String loginCheck() throws Exception
	{
		Thread.sleep(1500);
		myAccount.click();
		login.click();
		return driver.getTitle();
		
	}
	

}
