package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test
	public void verifyTheUserIsAbleToLogout() throws IOException
	{
		String username=ExcelUtility .getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnTheSignInButton();
		
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.clickOnAdmin();
		logoutpage.clickOnNewLogout();
		
		boolean homepage=logoutpage.isSignInDisplayed();
		Assert.assertTrue(homepage);
		
	}
	

}
