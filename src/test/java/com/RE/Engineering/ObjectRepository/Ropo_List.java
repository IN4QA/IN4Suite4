package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.Ropo_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Ropo_List extends Ropo_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname ;
	public static WebDriver iDriver;
	public Ropo_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	@FindBy(xpath = "//a[text()='ROPO Mapping']")
	private WebElement ropoMapping;
	public void getropoMapping(){
		ropoMapping.click();
	}
	@FindBy(id="ddlFilterProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(id="ddlFilterMaterialTypeList")
	private WebElement materialtype;
	public WebElement getmaterialtype() {
		return materialtype;
	}
	@FindBy(id="btnFilterGO")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	public  void MenuSubMenu()
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
	 sheet = xml.excelData(sheetname,Engineering.inputPath);	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	public static void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
}
	public  void ropoproject() throws Throwable{
		RopoList.getropoMapping();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(RopoList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		RopoList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
		
	}
	
	public  void ropomaterial() throws Throwable {
		Frames.SubMenuFrame();
		RopoList.getropoMapping();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(RopoList.getmaterialtype(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		RopoList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
	}

}
