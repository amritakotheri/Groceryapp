package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisibleText(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void dropDownByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void dropDownByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public void actionDragAndDrop(WebDriver driver,WebElement source,WebElement target )
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	public void actionRightClick(WebDriver driver,WebElement rightclick)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).perform();
	}
	public void actionMouseOver(WebDriver driver,WebElement mouseover)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseover).perform();
	}
	public void actionDoubleClick(WebDriver driver,WebElement doubleclick)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclick).perform();
	}
	public void alertSimple(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();	
}
	public void alertConfirmtionCancel(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.dismiss();		
} 
	public void alertConfirmtionOk(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void alertPromptOk(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();	
}
	public void alertPromptCancel(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();	
		alert.dismiss();	
	}
	public void alertPromptText(WebDriver driver,String text)
	{
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
	}
	public void javaScript(WebDriver driver,WebElement webelementname,String value)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';",webelementname);
	
	}
	public void javaScript(WebDriver driver,WebElement webelementname)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",webelementname);
	}
	

}
