package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtilities;

public class AdminUsersTest extends Base{
	@Test(retryAnalyzer=retry.Retry.class,description="This test case verifies that a valid user is able to log in to the application and successfully add a new admin user by providing the required details. It ensures that the system displays a confirmation alert after saving the admin user information.")
	public void verifyTheUserIsAbleToGetAdminUserInformation() throws IOException
	{
	String username=ExcelUtility .getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
	//String usernamename=ExcelUtility.getStringData(1, 0, "AdminusersPage");
	//String userpassword=ExcelUtility.getStringData(1, 1, "AdminusersPage");
	AdminUsersPage  adminuserpage=new AdminUsersPage (driver);
	FakerUtilities fakerutility=new FakerUtilities();
	String usernamename=fakerutility.createRandomFirstName();
	String userpassword=fakerutility.createRandomLastName();
	adminuserpage.chooseAdminUserInfo();
	adminuserpage.chooseNewButton();
    adminuserpage.enterUserName(usernamename);
	adminuserpage.enterPassword(userpassword);
    adminuserpage.selectUserType();
	adminuserpage.clickSaveButton();
	boolean alertshow=adminuserpage.isAlertDisplayed();
	Assert.assertTrue(alertshow,Constant.GETADMINUSERINFORMATION);
	
	}
}
