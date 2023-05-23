package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.Billing_LabourPayment_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Billing_LabourPayment_List extends Billing_LabourPayment_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Billing_LabourPayment_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Labour Payment']")
	private WebElement labourPaymentlink;
	public void labourPaymentLinkClick() {
		labourPaymentlink.click();
	}
	@FindBy(name = "ddlProjectList")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	
	@FindBy(name = "ddlSubProjectList")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	@FindBy(name = "btnGo")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickBilling();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputPath);
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
   }
	public void nofilters() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		labourpaymentlist.labourPaymentLinkClick();
		Frames.rightFrame();
		labourpaymentlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
	
	public void projectfilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		labourpaymentlist.labourPaymentLinkClick();
		Frames.rightFrame();
		appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		labourpaymentlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
	
	public void subprojectfilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		labourpaymentlist.labourPaymentLinkClick();
		Frames.rightFrame();
		appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSubProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		labourpaymentlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
}

