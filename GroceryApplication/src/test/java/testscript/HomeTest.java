package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	public HomePage homepage;
	@Test(description = "This test case verifies that a user can successfully log out of the application after logging in with valid credentials. Upon logout, the user should be redirected to the login page, and the sign-in option should be visible.")
	public void verifyTheUserIsAbleToLogout() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();

		//HomePage homepage = new HomePage(driver);
		homepage.clickOnAdmin();
		loginpage=homepage.clickOnNewLogout();

		 boolean alertshow=homepage.isSigninDisplayed();
		 Assert.assertTrue(alertshow,Constant.USERLOGOUT);

	}


}
