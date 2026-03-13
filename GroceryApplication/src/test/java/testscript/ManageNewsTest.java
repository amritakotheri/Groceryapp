package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsInfoPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test
	public void verifyTheuserIsAbleToAddNews() throws IOException
	{
		String username=ExcelUtility .getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnTheSignInButton();
		ManageNewsInfoPage manageinfopage=new ManageNewsInfoPage(driver);
		manageinfopage.managenewsmoreinfo();
		manageinfopage.newbutton();
		String news=ExcelUtility.getIntegerData(1, 0, "ManagenewsPage");
		manageinfopage.enterThenews(news);
		
		manageinfopage.save();
	boolean alertshow=manageinfopage.isalertdisplayed();
			Assert.assertTrue(alertshow);
	}

}
