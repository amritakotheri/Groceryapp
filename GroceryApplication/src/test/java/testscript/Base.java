package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public   WebDriver driver;
	@BeforeMethod
	public  void browserInitialization()
	{
	  driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");//opens the url
		driver.manage().window().maximize();//methods used to maximize the window
	}
	//@AfterMethod
	public void browserQuitAndClose()
	{
		//driver.close();//close the current browser window that is open
		driver.quit();//close all the browser window
	}
	
}
