package com.RE.Submodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverScript;
import Utilities.Frames;

public class Finance extends DriverScript{
	WebDriver iDriver;
	
	public Finance(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	@FindBy(xpath="//a[text()='Approvals']")
	private static WebElement FinApprovals;
	public WebElement getApprovals() {
		return FinApprovals;
	}
	
	public  boolean clickFinApprovals()
	{
		try
		{
			Frames.SubMenuFrame();

			appInd.clickObject(FinApprovals);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

}
