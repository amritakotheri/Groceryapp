package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
@Test
public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
{
	//String username="admin";
//	String password="admin";
	String username=ExcelUtility .getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
boolean homepage=loginpage.isDashBoardDisplayed();
Assert.assertTrue(homepage);
}
@Test
public void verifyTheUserIsAbleToLoginUsingInvalidUsernameValidPassword() throws IOException
{
	//String username="helloadmin";
	//String password="admin";
	String username=ExcelUtility .getStringData(2, 0, "LoginPage");
	String password=ExcelUtility.getStringData(2, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
	boolean homepage=loginpage.isAlertDisplayed();
	Assert.assertTrue(homepage);
}
@Test
public void verifyTheUserIsAbleToLoginUsingValidUsernameInvalidPassword() throws IOException
{
	//String username="admin";
	//String password="adminos";
	String username=ExcelUtility .getStringData(3, 0, "LoginPage");
	String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
	boolean homepage=loginpage.isAlertDisplayed();
	Assert.assertTrue(homepage);
}
@Test
public void verifyTheUserIsAbleToLoginUsingInvalidUsernameInvalidPassword() throws IOException
{
	//String username="helloadmin";
	//String password="adminos";
	String username=ExcelUtility .getStringData(4, 0, "LoginPage");
	String password=ExcelUtility.getStringData(4, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnTheSignInButton();
	boolean homepage=loginpage.isAlertDisplayed();
	Assert.assertTrue(homepage);
}
}
