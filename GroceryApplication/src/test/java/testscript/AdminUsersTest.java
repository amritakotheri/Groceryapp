package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
	@Test
	public void verifyTheUserIsAbleToGetAdminUserInformation() throws IOException
	{
	String username=ExcelUtility .getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
	String usernamename=ExcelUtility.getStringData(1, 0, "AdminusersPage");
	String userpassword=ExcelUtility.getStringData(1, 1, "AdminusersPage");
	AdminUsersPage  adminuserpage=new AdminUsersPage (driver);
	adminuserpage.chooseAdminUserInfo();
	adminuserpage.chooseNewButton();
    adminuserpage.enterUserName(usernamename);
	adminuserpage.enterPassword(userpassword);
    adminuserpage.selectUserType();
	adminuserpage.clickSaveButton();
	boolean alertshow=adminuserpage.isAlertDisplayed();
	Assert.assertTrue(alertshow);
	
	}
}
