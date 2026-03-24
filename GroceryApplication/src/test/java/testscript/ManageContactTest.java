package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	public HomePage homepage;
	public ManageContactPage managecontactpage;
	@Test(description = "This test case verifies that a valid user can log in to the application, navigate to the Manage Contact section, update the address information, and successfully save the changes. It also ensures that a confirmation alert is displayed after updating the address.")
	public void verifyTheUserIsAbleToUpdateAdress() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
	//	loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		managecontactpage=homepage.selectManageContactInfo();
		//ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.editContactDetails().editTheAdress(password).clickUpdate();
		String newadress = ExcelUtility.getStringData(0, 0, "ManagecontactPage");
		//managecontactpage.editTheAdress(newadress);
		//managecontactpage.clickUpdate();
		boolean alertshow = managecontactpage.isAlertDisplayed();
		Assert.assertTrue(alertshow,Constant.MANAGECONTACT);

	}
}
