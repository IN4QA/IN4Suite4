package com.RE.Engineering_Masters.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering_Masters.Test.BOQ_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class BOQ_List extends BOQ_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public BOQ_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='BOQ']")
	private WebElement boqlink;
	public void getboq() {
		boqlink.click();
	}
	
	@FindBy(id = "cboProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(name = "cmdGo")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();
	}
	
	@FindBy(id = "grdMain_ctl02_lblDescription")
	private WebElement projname;
	public String getprojname() {
		return projname.getText();
			}
	
	public void MenuSubMenu() throws Throwable{
		
		try {
			MainMenu mm =new MainMenu(iDriver);
			mm.clickEngineering();
			Engineering en=new Engineering(iDriver);
			Engineering.clickMasters();
			Thread.sleep(2000);
			xml=new Datatable();
			sheet=xml.excelData(sheetname,Engineering.inputPath);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	 public void VerifyProjectName() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 BOQlist.getboq();
		 Thread.sleep(4000);
		 Frames.rightFrame();
		 Thread.sleep(4000);
		 WebElement project=BOQlist.getproject();
		 project.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 BOQlist.getGoButton();
		 Thread.sleep(5000);
//		 Assert.assertEquals(getprojname(),sheet.getRow(0).getCell(1).getStringCellValue())
		 System.out.println("actual page name"+getprojname());
		 if(getprojname().equals(" EPI CENTRE") ){
			 Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname,Engineering.path);
		 }else {
			 Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname,Engineering.path);
		 }
	 }
	
}
