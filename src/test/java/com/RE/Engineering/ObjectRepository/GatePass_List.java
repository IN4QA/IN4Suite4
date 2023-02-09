package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.GatePass_List_Test;
import com.RE.Engineering.Test.Issue_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class GatePass_List extends GatePass_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "GatePass_List";
	public static WebDriver iDriver;
	public GatePass_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	@FindBy(xpath = "//a[text() = 'Gate Pass']")
	private WebElement gatepass;
	public void getgatepass() {
	gatepass.click();
	}
	@FindBy(name="ddlGatePassType")
	private WebElement GPType;
	public WebElement getGPType() {
		return GPType;
	}
	@FindBy(name="btnGo")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	
	
	public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickInventory();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("GatePass List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	public static void singleDD(WebElement comPath, String gatepass_type) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(gatepass_type);
	}
		
	public static void trasfer() throws Throwable {
		Frames.SubMenuFrame();
		GatePass.getgatepass();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		GatePass.getGPType();
		singleDD(GatePass.getGPType(), sheet.getRow(0).getCell(1).getStringCellValue());
		GatePass.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		}
	
	public static void returnable() throws Throwable {
		Frames.SubMenuFrame();
		GatePass.getgatepass();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		GatePass.getGPType();
		singleDD(GatePass.getGPType(), sheet.getRow(1).getCell(1).getStringCellValue());
		GatePass.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		}
	public static void nonreturnable() throws Throwable {
		Frames.SubMenuFrame();
		GatePass.getgatepass();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		GatePass.getGPType();
		singleDD(GatePass.getGPType(), sheet.getRow(2).getCell(1).getStringCellValue());
		GatePass.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	
	
}
}
