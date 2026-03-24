package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageFooterTextPage {
	public WebDriver driver;
//	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
//	WebElement managefootertextinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @class='btn btn-sm btn btn-primary btncss']")
	WebElement editfootertext;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonenumber;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement update;
	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void clickManageFooterTextInfo() {
//		managefootertextinfo.click();
//	}

	public ManageFooterTextPage clickEditFooterText() {
		editfootertext.click();
		return this;
	}

	public ManageFooterTextPage editEmail(String mailid) {
		email.clear();
		email.sendKeys(mailid);
		return this;
	}

	public ManageFooterTextPage editPhoneNumber(String number) {
		phonenumber.clear();
		phonenumber.sendKeys(number);
		return this;
	}

	public ManageFooterTextPage clickUpdate() {
		update.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
