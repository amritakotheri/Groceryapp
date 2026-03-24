package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsInfoPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	public HomePage homepage;
	public ManageNewsInfoPage manageinfopage;
	@Test(description="This test case verifies that a valid user can log in to the application, navigate to the Manage News section, create a new news entry by providing the required information, and successfully save it.")
	public void verifyTheuserIsAbleToAddNews() throws IOException
	{
		String username=ExcelUtility .getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
	//	loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		//ManageNewsInfoPage manageinfopage=new ManageNewsInfoPage(driver);
		manageinfopage=homepage.manageNewsMoreInfo();
		manageinfopage.newbutton().enterThenews(password).save();
		String news=ExcelUtility.getStringData(1, 0, "ManagenewsPage");
		//manageinfopage.enterThenews(news);
		
		//manageinfopage.save();
	boolean alertshow=manageinfopage.isalertdisplayed();
			Assert.assertTrue(alertshow,Constant.MANAGENEWS);
	}

}
