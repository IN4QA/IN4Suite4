package com.RE.Purchase.ObjectRepository;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.SupplierMaster_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SupplierMaster_List extends SupplierMaster_List_Test{
	
			public static XSSFSheet sheet;
			public static Datatable xml;
			public static String SheetName="SupplierMaster_List";
			public static WebDriver iDriver;
			public  SupplierMaster_List(WebDriver oDriver) {
				iDriver = oDriver;
				PageFactory.initElements(iDriver, this);
			}
			
			@FindBy(xpath="//a[text()='Supplier']")
			private WebElement supplier;
			public void getsupplier() {
				supplier.click();
			}
			@FindBy(name = "ddlStatus")
			private static WebElement status;
			public static WebElement getstatus() {
				return status;
			}
			
			@FindBy(name = "btnSearch")
			private WebElement go;
			public void getgo() {
				go.click();
			}
			
			public static void  MenuSubMenu() {
				try {
					MainMenu mm=new MainMenu(iDriver);
					mm.clickPurchase();
					Thread.sleep(2000);
					Purchase en=new Purchase(iDriver);
					en.clickmasters();
					Thread.sleep(1000);
					xml =new Datatable();
					sheet=xml.excelData("Supplier Master");
				} 
				catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed:"+e);
					
				}
			}
			
			public static void go() throws Throwable{
				String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
				suppliermaster.getsupplier();
				Thread.sleep(1000);
				Frames.rightFrame();
				suppliermaster.getgo();
				Thread.sleep(1000);
				ListPageCount.PageCount(nameofCurrentMethod, SheetName);
				Thread.sleep(1000);
			}
			
			public static void status() throws Throwable{
				String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
				Frames.SubMenuFrame();
				suppliermaster.getsupplier();
				Thread.sleep(1000);
				Frames.rightFrame();
				appInd.singleDropDown(getstatus(),sheet.getRow(0).getCell(1).getStringCellValue());
				Thread.sleep(1000);
				suppliermaster.getgo();
				Thread.sleep(1000);
				ListPageCount.PageCount(nameofCurrentMethod, SheetName);
				Thread.sleep(1000);
			}
			
}

