package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtilities;

public class ManageCategoryTest extends Base {
	public HomePage homepage;
	public ManageCategoryPage managecategorypage;

	@Test(description = "This test case verifies that a valid user can log in to the application, navigate to the Manage Category section, create a new category, and successfully upload a file. It ensures that the file upload functionality works as expected during category creation.")
	public void verifyTheUserIsAbleToUploadFile() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
	//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
		//ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		FakerUtilities fakerutility=new FakerUtilities();
		String text=fakerutility.createRandomFirstName();
		managecategorypage=	homepage.clickManageCategoryInfo();
		
		managecategorypage.clickNew().clickOnDiscount().eneterCategory(text).uploadTheFile().saveButton();
		//String text = ExcelUtility.getStringData(0, 0, "ManagecategoryPage");
		//managecategorypage.eneterCategory(text);
	//	managecategorypage.clickOnDiscount();
		//managecategorypage.uploadTheFile();
	//	managecategorypage.saveButton();
		boolean alertshow=managecategorypage.isAlertDisplayed();
		 Assert.assertTrue(alertshow,Constant.MANAGECATEGORY);
	}

}
