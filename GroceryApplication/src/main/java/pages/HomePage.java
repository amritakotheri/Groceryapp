package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	WebElement logout;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	
	
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement managecategoryinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	WebElement managecontactinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement managefootertextinfo;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ManageNewsInfoPage manageNewsMoreInfo() {
		managenewsmoreinfo.click();
		return new ManageNewsInfoPage(driver);
	}
	
	public ManageCategoryPage clickManageCategoryInfo()
	{
		managecategoryinfo.click();
		return new ManageCategoryPage(driver);
	}

	public ManageContactPage selectManageContactInfo() {
		managecontactinfo.click();
		return new ManageContactPage(driver);
	}
	
	public ManageFooterTextPage clickManageFooterTextInfo() {
		managefootertextinfo.click();
		return new ManageFooterTextPage(driver);
	}
	
	
	
	public void clickOnAdmin() {
		admin.click();
	}

	public void clickOnNewLogout() {
		logout.click();
	}

}
