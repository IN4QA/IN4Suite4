package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.PendingIndent_List_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class PendingIndent_List extends PendingIndent_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "PendingIndent_ListTest";
	public static WebDriver iDriver;
	public PendingIndent_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
   @FindBy(xpath="//a[text()='Pending Indents']")
	private WebElement pendingindents;
	public void getpendingindents() {
		pendingindents.click();
	}
	@FindBy(id = "rdoIndentStatusList_1")
	private WebElement UnfulfilledIssue;
	public void getUnfulfilledIssue() {
		UnfulfilledIssue.click();
	}
	@FindBy(id = "rdoIndentCategory_1")
	private WebElement AssetUnfulfilledPOTO;
	public void getAssetUnfulfilledPOTO() {
		AssetUnfulfilledPOTO.click();
	}
	@FindBy(id = "rdoIndentCategory_1")
	private WebElement UnfulfilledIssueAsset;
	public void getUnfulfilledIssueAsset(){
		UnfulfilledIssueAsset.click();
	}
	@FindBy(id="txtProject")
	private WebElement pro;
	public void getpro() {
		pro.click();
	}
	@FindBy(name ="txtProject")
private WebElement project;
	public WebElement getproject() {
		return project;
}
		
		@FindBy(name = "btnFilterGO")
		private WebElement go;
		public void getGo() {
			 go.click();
		}
	
	
	public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickPurchase();
	 Thread.sleep(2000);
	 //Purchase en = new Purchase(iDriver);
	//en.clickInventory();
	Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("Pending List");	
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
	// Case 1 : Listing Pending Indents for Material unfullfilledPO/To
	public void unfullfilledPOTo() throws Throwable{
		Frames.SubMenuFrame();
		PendingIndents.getpendingindents();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//singleDD(PendingIndents.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		Frames.rightFrame();
		PendingIndents.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	//Case 2 : Listing Pending Indents for Material UnfulfilledIssue/To
	public void UnfulfilledIssue() throws Throwable{
		Frames.SubMenuFrame();
		PendingIndents.getpendingindents();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//singleDD(PendingIndents.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		Frames.rightFrame();
		PendingIndents.getUnfulfilledIssue();
		 Thread.sleep(1000);
		PendingIndents.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}
	// Case 3 : Listing Pending Indents for Asset unfullfilledPO/To
	public void unfullfilledPOToAsset() throws Throwable{
		Frames.SubMenuFrame();
		PendingIndents.getpendingindents();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//singleDD(PendingIndents.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Frames.rightFrame();
		PendingIndents.getAssetUnfulfilledPOTO();
		Thread.sleep(1000);
		PendingIndents.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}
	//  Case 4 :Listing Pending Indents for Asset UnfulfilledIssueAsset
	public void UnfulfilledIssueAsset() throws Throwable{
		Frames.SubMenuFrame();
		PendingIndents.getpendingindents();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//singleDD(PendingIndents.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Frames.rightFrame();
		PendingIndents.getUnfulfilledIssue();
		PendingIndents.getUnfulfilledIssueAsset();
		Thread.sleep(1000);
		PendingIndents.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}
	
	//  Case 5 :Listing Pending Indents for Material unfullfilledPO/To with project filter
	public void project() throws Throwable{
		Frames.SubMenuFrame();
		PendingIndents.getpendingindents();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.rightFrame();
		PendingIndents.getpro();
		//Frames.rightFrame();
		PendingIndents.getproject().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//		project.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 PendingIndents.getGo();
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}

}

