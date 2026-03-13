package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath="//a[ @href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")WebElement logout;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;

	
	
	
	public LogoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnAdmin()
	{
		admin.click();
	}
	public void clickOnNewLogout()
	{
		logout.click();
	}
	public boolean isSignInDisplayed()
	{
		return logout.isDisplayed();
		
	}
}
