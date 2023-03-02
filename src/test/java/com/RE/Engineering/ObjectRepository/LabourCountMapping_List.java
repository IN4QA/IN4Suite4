package com.RE.Engineering.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.LabourCountMapping_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class LabourCountMapping_List extends LabourCountMapping_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public LabourCountMapping_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Labour Counter Mapping']")
	private WebElement labourCountMaplink;
	public void labourCountMapLinkClick() {
		labourCountMaplink.click();
	}
	@FindBy(id = "ddlProject")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	
	@FindBy(xpath = "(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	
	@FindBy(xpath = "(//input[@class='form-control multiselect-search'])[1]")
	private WebElement subProjectsearch;
	public  WebElement SubProjectSearchBox() {
		return subProjectsearch;
	}
	
	@FindBy(xpath= "//table[@id='Table3']//td[4]//li ")   //ul[@class='multiselect-container dropdown-menu']//li
	private List<WebElement> listedrecordSubProjectDD;
	public List<WebElement> listedrecordSubProjectDD() {
		return listedrecordSubProjectDD;
	}
	
	
	@FindBy(name = "btngo")
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
	 en.clickSiteActivity();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname);
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
   }
		
	public void projectfilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		labourcountmaplist.labourCountMapLinkClick();
		Frames.rightFrame();
		appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		labourcountmaplist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname);
		Thread.sleep(1000);
		}
	
	public void subprojectfilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		labourcountmaplist.labourCountMapLinkClick();
		Frames.rightFrame();
		appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(500);
		appInd.multiDD_withText_SingleClick(labourcountmaplist.getSubProjectDD(),labourcountmaplist.SubProjectSearchBox(),sheet.getRow(1).getCell(1).getStringCellValue(), labourcountmaplist.listedrecordSubProjectDD());
		Thread.sleep(3000);
		labourcountmaplist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname);
		Thread.sleep(1000);
		}
}



