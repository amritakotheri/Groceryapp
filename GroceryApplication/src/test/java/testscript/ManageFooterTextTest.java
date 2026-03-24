package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	public HomePage homepage;
	public ManageFooterTextPage managefootertextpage;
	@Test(description="This test case verifies that a valid user can log in to the application, navigate to the Manage Footer Text section, update the footer details such as email and phone number, and successfully save the changes. It also ensures that a confirmation alert is displayed after updating the footer information.")
	public void verifyTheUserIsAbleToEditManageFooterText() throws IOException
	{
	String username=ExcelUtility .getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username).enterThePassword(password);
	//loginpage.enterThePassword(password);
	homepage=loginpage.clickOnTheSignInButton();
	//ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
	managefootertextpage=homepage.clickManageFooterTextInfo();
	String mailid=ExcelUtility .getStringData(0, 0, "ManagefootertextPage");
	String number=ExcelUtility .getIntegerData(1, 0, "ManagefootertextPage");
	managefootertextpage.clickEditFooterText().editEmail(mailid).editPhoneNumber(number).clickUpdate();
	//managefootertextpage.editEmail(mailid);
	//managefootertextpage.editPhoneNumber(number);
	//managefootertextpage.clickUpdate();
	boolean alertshow=managefootertextpage.isAlertDisplayed();
	Assert.assertTrue(alertshow,Constant.MANAGEFOOTERTEXT);
	}
}
