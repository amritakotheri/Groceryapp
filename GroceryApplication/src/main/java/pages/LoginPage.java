package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,' alert-dismissible')]")
	WebElement alert;
///@FindBy(xpath="//div[contains(@class,' alert-dismissible')]") WebElement drop;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public LoginPage enterTheUserName(String username) {
		usernamefield.sendKeys(username);
		return this;
	}

	public LoginPage enterThePassword(String password) {
		passwordfield.sendKeys(password);
		return this;
	}

	public HomePage clickOnTheSignInButton() {
		signin.click();
		return new HomePage(driver);
	}

	/*
	 * public void dropDown() { PageUtility pageutility=new PageUtility();
	 * pageutility.dropDownVisibleText(drop,"india"); }
	 */
	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
