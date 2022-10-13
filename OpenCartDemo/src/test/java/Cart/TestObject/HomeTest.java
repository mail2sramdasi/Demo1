package Cart.TestObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Cart.Base.BaseClass;
import Cart.PageObject.HomePage;


public class HomeTest  extends BaseClass
{
	
	public static HomePage hp = null;
	
	
	
	@Test(priority = 1)
	public void startUpHomePage()
	{
		init();
		hp= new HomePage(driver);
	}
			
	@Test(priority = 2)
	public void clickRegister() throws Exception
	{		
		Assert.assertEquals(hp.registerCheck(), "Register Account");
	}
	
	@Test (priority = 3)
	public void loginCheck() throws Exception
	{
		Assert.assertEquals(hp.loginCheck(), "Account Login");
	}
	
	
//	@Test (priority = 10, enabled = false)
//	public void test01()
//	{
//		
//	}

	
	
	
}
