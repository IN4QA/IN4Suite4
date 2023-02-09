package com.RE.Submodules;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.AppIndependentMethods;
import Utilities.DriverScript;
import Utilities.Frames;

public class Purchase extends DriverScript{
WebDriver iDriver;
	
	public Purchase(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath = "//table[@class = 'in4-table']/tbody/tr")
	static
	List<WebElement> list;
	
	public static List<WebElement> recordListed() {
		return list;
	}
	@FindBy(xpath="//a[text()='Inventory']")
	private static WebElement inventory;
	public  WebElement getInventory()
	{
		return inventory;
	}
//	public static boolean clickInventory()
	//{
	//	try
	//	{
	//		Frames.SubMenuFrame();
	//		appInd.clickObject(inventory);
	//		return true;
	//	} catch(Exception e)
	//	{
	//		return false;
	//	}	
	//}
	
	@FindBy(xpath="//a[text()='Payments ']")
	private static WebElement payments;
	public WebElement getPayments() {
		return payments;
	}
	
	public static boolean clickPayments()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(payments);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

}
