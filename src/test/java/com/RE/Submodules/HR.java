package com.RE.Submodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverScript;
import Utilities.Frames;

public class HR extends DriverScript {

    WebDriver iDriver;
	public static String ListInputPath = appInd.readConfig("HRListInputPath");
	public static String ListOutPutpath = appInd.readConfig("HRListOutPutpath");
	public static String CreateInputPath = appInd.readConfig("HRCreateData");
	public static String CreateOutPutPath = appInd.readConfig("HRCreateOutput");
	public HR(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Emp List ')]")
	private static WebElement EmpList;
	public  WebElement getEmpList()
	{
		return EmpList;
	}
	
	public boolean clickEmpList()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(EmpList);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
}
