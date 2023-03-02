package com.RE.Submodules;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverScript;
import Utilities.Frames;

public class Sales extends DriverScript {

	
    WebDriver iDriver;
	
	public Sales(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Billing ']")
	private static WebElement Billing;
	public  WebElement getBilling()
	{
		return Billing;
	}
	
	@FindBy(xpath="//a[text()='Marketing ']")
	private static WebElement Marketing;
	public  WebElement getMarketing()
	{
		return Marketing;
	}
	 
	@FindBy(xpath="//a[text()='Communication ']")
	private static WebElement Communication;
	public  WebElement getCommunication()
	{
		return Communication;
	}
	
	@FindBy(xpath="//a[text()='Utilities ']")
	private static WebElement Utilities;
	public  WebElement getUtilities()
	{
		return Utilities;
	}
	
	@FindBy(xpath="//a[text()='Leads ']")
	private static WebElement Leads;
	public  WebElement getLeads()
	{
		return Leads;
	}
	
	@FindBy(xpath="//a[text()='Customers ']")
	private static WebElement Customers;
	public  WebElement getCustomers()
	{
		return Customers;
	}
	
	@FindBy(xpath="//a[text()='Engg. Milestone ']")
	private static WebElement enggMilestone;
	public  WebElement getEnggMilestone()
	{
		return enggMilestone;
	}
	
	@FindBy(xpath="//a[text()='Agent ']")
	private static WebElement Agent;
	public  WebElement getAgent()
	{
		return Agent;
	}
	
	public boolean clickBilling()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Billing);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickMerketing()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Marketing);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickCommunication()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Communication);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickUtilities()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Utilities);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}

	public boolean clickAgent()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Agent);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickLeads()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Leads);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickCustomers()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(Customers);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
	public boolean clickenggMilestone()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(enggMilestone);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
}
