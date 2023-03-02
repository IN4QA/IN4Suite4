package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Send_Email_SMS_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Send_Email_SMS_List extends Send_Email_SMS_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public Send_Email_SMS_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Send Email - SMS')]")
	private WebElement sendEmailSMSLink;
	public void getsendEmailSMSLink() {
		sendEmailSMSLink.click();
	}
	
	@FindBy(css = "select#ddlProject")
	private WebElement proj;
	public WebElement getProj() {
		return proj;
	}
	
	@FindBy(css = "input#btnSearch")
	private WebElement search;
	public void getSearch() {
		search.click();
	}
	
	@FindBy(css = "select#ddlTemplate")
	private WebElement tempName;
	public WebElement gettempName() {
		return tempName;
	}
	
			
	@FindBy(css = "label[for=rdoSendingOption_1]")
	private WebElement sms;
	public void getSMS() {
		 sms.click();;
	}		
	
	@FindBy(css = "label[for=rdoSendingOption_2]")
	private WebElement whatsApp;
	public void getWhatsApp() {
		 whatsApp.clear();
	}	
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickCommunication();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void emailCount() throws Throwable {
		Frames.SubMenuFrame();
		getsendEmailSMSLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(gettempName(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getProj(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		getSearch();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
	public void smsCount() throws Throwable {
		Frames.SubMenuFrame();
		getsendEmailSMSLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		getSMS();
		Thread.sleep(1000);
		appInd.singleDropDown(gettempName(), sheet.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getProj(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		getSearch();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
	public void whatsAppCount() throws Throwable {
		Frames.SubMenuFrame();
		getsendEmailSMSLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		getWhatsApp();
		Thread.sleep(1000);
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		appInd.singleDropDown(gettempName(), sheet.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getProj(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		getSearch();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
}
