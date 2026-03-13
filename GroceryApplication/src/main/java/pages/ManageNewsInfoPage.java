package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsInfoPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[contains(@class,'btn-danger') and @onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement newsfield;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//button[@class='close']")WebElement alert;


	public  ManageNewsInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
public void managenewsmoreinfo()
{
	managenewsmoreinfo.click();
}
public void newbutton()
{
	newbutton.click();
}
public void enterThenews(String news)
{
	newsfield.sendKeys(news);
}
public void save()
{
	save.click();
}
public boolean isalertdisplayed()
{
	return alert.isDisplayed();
}
}


