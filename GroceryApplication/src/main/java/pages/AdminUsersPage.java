package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
//	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
//	WebElement adminuserinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	public void chooseAdminUserInfo() {
//		adminuserinfo.click();
//	}

	public AdminUsersPage chooseNewButton() {
		newbutton.click();
		return this;
	}

	public AdminUsersPage enterUserName(String usernamename) {
		usernamefield.sendKeys(usernamename);
		return this;
	}

	public AdminUsersPage enterPassword(String userpassword) {
		passwordfield.sendKeys(userpassword);
		return this;
	}

	public AdminUsersPage selectUserType() {
		PageUtility page1 = new PageUtility();
		page1.dropDownByValue(usertype, "staff");
		return this;
	}

	public AdminUsersPage clickSaveButton() {
		savebutton.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
