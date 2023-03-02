package com.RE.Submodules;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverScript;
import Utilities.Frames;

public class Engineering extends DriverScript{
	
WebDriver iDriver;
	
	public Engineering(WebDriver oDriver)
	{
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath = "//table[@class = 'in4-table']/tbody/tr")
	static List<WebElement> list;
	public static List<WebElement> recordListed() {
		return list;
	}
	
	@FindBy(xpath="//a[text()='Inventory ']")
	private static  WebElement inventory;
	public  WebElement getInventory()
	{
		return inventory;
	}
	
	@FindBy(xpath="//a[text()='Tendering ']")
	private static WebElement tendering;
	public WebElement getTendering()
	{
		return tendering;		
	}
	
	@FindBy(xpath="//a[text()='Contracting ']")
	private static WebElement contracting;
	public WebElement getContracting()
	{
		return contracting;
	}
	
	@FindBy(xpath="//a[text()='Site-Activity ']")
	private static WebElement siteactivity;
	public WebElement getSiteActivity()
	{
		return siteactivity;
	}

	@FindBy(xpath="//a[text()='Billing ']")
	private static WebElement billing;
	public WebElement getBilling()
	{
		return billing;
	}
	
	@FindBy(xpath="//a[text()='Approvals']")
	private WebElement approvals;
	public WebElement getApprovals()
	{
		return approvals;
	}
	
	@FindBy(xpath="//a[text()='Modification ']")
	private static WebElement modification;
	public WebElement getModification()
	{
		return modification;
	}
	
	@FindBy(xpath="//a[text()='ReportingTo']")
	private WebElement reportingto;
	public WebElement getReportingTo()
	{
		return reportingto;
	}
	
	@FindBy(xpath="//a[text()='Checklist ']")
	private static WebElement checklist;
	public WebElement getChecklist()
	{
		return checklist;
	}
	
	@FindBy(xpath="//a[text()='Templates ']")
	private static WebElement templates;
	public WebElement getTemplates()
	{
		return templates;
	}
	
	@FindBy(xpath="//a[text()='Portal']")
	private WebElement portal;
	public WebElement getPortal()
	{
		return portal;
	}
	
	@FindBy(xpath="//a[text()='Masters ']")
	private static WebElement masters;
	public WebElement getMasters()
	{
		return masters;
	}
	
	@FindBy(xpath="//a(text()='Utilities']")
	private WebElement utilities;
	public WebElement getUtilities()
	{
		return utilities;
	}
	
	@FindBy(xpath="//a(text()='Search']")
	private WebElement search;
	public WebElement getSearch()
	{
		return search;
	}
	
	@FindBy(xpath="//a)text()='Reports']")
	private WebElement reports;
	public WebElement getReprots()
	{
		return reports;
	}
	
	
	public static boolean clickInventory()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(inventory);
			return true;
		} catch(Exception e)
		{
			return false;
		}	
	}
	
/*	public void clickInventory() throws Exception
	{
		Frames.SubMenuFrame();
		appInd.clickObject(engg.getInventory());
	} */
	
	public static boolean clickTendering()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(tendering);
			return true;
		} catch(Exception e)
		{
			return false;
		}
	
	}
		
	public static boolean clickContracting()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(contracting);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public static boolean clickSiteActivity()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(siteactivity);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickBilling()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(billing);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickApprovals()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.getApprovals());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	public static boolean clickModifications()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(modification);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickReprotingTo()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.getReportingTo());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickChecklist()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(checklist);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickTemplates()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(templates);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickPortal()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.getPortal());
			return true;
		}catch(Exception e)
		{
			return false;			
		}
	}
	public static boolean clickMasters()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(masters);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickUtilities()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.getUtilities());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickSearch()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.clickSearch());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public static boolean clickReports()
	{
		try
		{
			Frames.SubMenuFrame();
			appInd.clickObject(engg.clickReports());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
}







