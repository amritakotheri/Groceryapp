package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsInfoPage {
	public WebDriver driver;
	/*@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement managenewsmoreinfo;*/
	@FindBy(xpath = "//a[contains(@class,'btn-danger') and @onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newsfield;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	@FindBy(xpath = "//button[@class='close']")
	WebElement alert;

	public ManageNewsInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	public void manageNewsMoreInfo() {
//		managenewsmoreinfo.click();
//	}

	public ManageNewsInfoPage newbutton() {
		newbutton.click();
		return this;
	}

	public ManageNewsInfoPage enterThenews(String news) {
		newsfield.sendKeys(news);
		return this;
	}

	public ManageNewsInfoPage save() {
		// WaitUtility waitutility=new WaitUtility();
//	waitutility.waitForElementToBeClickable(driver, save);
		save.click();
		return this;
	}

	public boolean isalertdisplayed() {
		return alert.isDisplayed();
	}
}
