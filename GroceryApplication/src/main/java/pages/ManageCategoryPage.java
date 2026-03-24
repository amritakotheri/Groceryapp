package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	
//	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement managecategoryinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
    @FindBy(xpath="//input[@name='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@name='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	
	public ManageCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	public void clickManageCategoryInfo()
//	{
//		managecategoryinfo.click();
//	}
	public ManageCategoryPage clickNew()
	{
		newbutton.click();
		return this;
	}
	public ManageCategoryPage eneterCategory(String text) 
	{
		category.sendKeys(text);
		return this;
	}
	public ManageCategoryPage clickOnDiscount()
	{
		discount.click();
		return this;
	}
	public ManageCategoryPage uploadTheFile() throws AWTException
	{
		
	FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(choosefile,Constant.IMAGEDATAFILE);
		return this;
	}
	public ManageCategoryPage saveButton()
	{
	
		PageUtility pageutility=new PageUtility();
		pageutility.javaScriptExecuterClick(driver, save);
		return this;
	}
	public boolean isAlertDisplayed() 
	{
		return alert.isDisplayed();
	}
}