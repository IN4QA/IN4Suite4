package com.RE.Submodules;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.DriverScript;
import Utilities.Frames;
public class Purchase extends DriverScript{
WebDriver iDriver;

//public static String path="Purchase";
//public static String inputpath="Purchase";
public static String path="D:\\myworkspace\\IN4Suite4\\test-output\\PurchaseOutput.xlsx";
public static String inputpath="D:\\myworkspace\\IN4Suite4\\Configuration\\PurchaseData.xlsx";
public static String InputCreatePath=appInd.readConfig("Purchasecreate");
public static String OutputCreatePath=appInd.readConfig("PurchaseCreateOutput");
//D:\myworkspace\IN4Suite4\test-output
	
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
	
	@FindBy(xpath="//a[text()='Quotation ']")
	private static WebElement quotation;
	public WebElement getquotation() {
		return quotation;
	}
	
	@FindBy(xpath="//a[text()='Masters ']")
	private static WebElement masters;
	public WebElement getmasters() {
		return masters;
	}
	
	@FindBy(xpath="//a[text()='Search ']")
	private static WebElement search;
	public WebElement getsearch() {
		return search;
	}
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private static WebElement approavls;
	public WebElement getapprovals() {
		return approavls;
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
	
	public  boolean clickPayments()
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
	
	public  boolean clickquotation()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(quotation);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickmasters()
	{
		try {
			
			Frames.SubMenuFrame();
			appInd.clickObject(masters);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean clicksearch() 
	{
		try {
			//Frames.SubMenuFrame();
			appInd.clickObject(search);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean clickapprovals()
	{
		try {
			Frames.SubMenuFrame();
			appInd.clickObject(approavls);
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}

}
