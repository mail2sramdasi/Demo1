package Cart.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import Cart.PageObject.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	public static HomePage hp = null;
	
	public void init()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		WebDriverManager.operadriver().setup();
//		driver = new OperaDriver();
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
