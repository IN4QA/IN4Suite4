package com.RE.Submodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverScript;
import Utilities.Frames;

public class Expenses extends DriverScript{

    WebDriver iDriver;
	public static String CreateInputPath = appInd.readConfig("ExpensesCreateData");
	public static String CreateOutPutPath = appInd.readConfig("ExpensesCreateOutput");
	public Expenses(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Budget'][@id='defTab']")
	private static WebElement Budget;
	public  WebElement getBudget()
	{
		return Budget;
	}
	
	@FindBy(xpath="//a[text()='Work Order ']")
	private static WebElement WorkOrder;
	public  WebElement getWorkOrder()
	{
		return WorkOrder;
	}
	
	@FindBy(xpath="//a[text()='Payments ']")
	private static WebElement Payments;
	public  WebElement getPayments()
	{
		return Payments;
	}
	
	public boolean clickBudget()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Budget);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickWorkOrder()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(WorkOrder);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickPayments()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Payments);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
}
