package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test(description = "This test case verifies that a user can successfully log out of the application after logging in with valid credentials. Upon logout, the user should be redirected to the login page, and the sign-in option should be visible.")
	public void verifyTheUserIsAbleToLogout() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnTheSignInButton();

		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickOnAdmin();
		logoutpage.clickOnNewLogout();

		 boolean homepage=logoutpage.isSignInDisplayed();
		 Assert.assertTrue(homepage,Constant.USERLOGOUT);

	}

}
