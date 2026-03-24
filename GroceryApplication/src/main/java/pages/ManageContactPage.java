package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	public WebDriver driver;
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	//WebElement managecontactinfo;
	@FindBy(xpath = "//a[@role='button' and @class='btn btn-sm btn btn-primary btncss']")
	WebElement editcontact;
	@FindBy(xpath = "//textarea[@id='content' and @name='address']")
	WebElement adress;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;
	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void selectManageContactInfo() {
//		managecontactinfo.click();
//	}

	public ManageContactPage editContactDetails() {
		editcontact.click();
		return this;
	}

	public ManageContactPage editTheAdress(String newadress) {
		adress.clear();
		adress.sendKeys(newadress);
		return this;
	}

	public ManageContactPage clickUpdate() {
		PageUtility pageutility = new PageUtility();
		pageutility.javaScriptExecuterClick(driver, update);
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}