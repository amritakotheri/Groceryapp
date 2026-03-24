package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	public HomePage homepage;
	public LoginPage loginpage;
	@Test(groups = "regression", description = "This test case verifies that the application allows a user to successfully log in when valid username and password are provided. Upon successful authentication, the user should be redirected to the dashboard page.")
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		// String username="admin";
//	String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		boolean alert = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(alert,Constant.LOGINWITHVALIDCREDENTIALS);
	}

	@Test(description = "This test case verifies that the application does not allow a user to log in when an incorrect (invalid) username is provided along with a valid password. The system should display an appropriate error message or alert indicating unsuccessful login.")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameValidPassword() throws IOException {
		// String username="helloadmin";
		// String password="admin";
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGINWITHINVALIDUSERNAME);
	}

	@Test(description = "This test case verifies that the application prevents login when a correct (valid) username is entered with an incorrect (invalid) password. The system should display an appropriate error message or alert indicating that authentication has failed.")
	public void verifyTheUserIsAbleToLoginUsingValidUsernameInvalidPassword() throws IOException {
		// String username="admin";
		// String password="adminos";
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
	//	loginpage.enterThePassword(password);
	    homepage=loginpage.clickOnTheSignInButton();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGINWITHINVALIDPASSWORD);
	}

	@Test(description = "This test case verifies that the application does not allow a user to log in when both the username and password are incorrect. The system should reject the login attempt and display an appropriate error message or alert indicating invalid credentials.")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameInvalidPassword() throws IOException {
		// String username="helloadmin";
		// String password="adminos";
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
	//	loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage, Constant.LOGINWITHINVALIDUSERNAMEANDPASSWORD);
	}
}
