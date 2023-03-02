package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.ServiceProviderMasters_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class ServiceProviderMasters_List extends ServiceProviderMasters_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName="ServiceProviderMasters_List";
	public static WebDriver iDriver;
	public   ServiceProviderMasters_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		
	}
	@FindBy(xpath="//a[text()='Service Provider']")
	private WebElement serviceprovider;
	public void getserviceprovider() {
		serviceprovider.click();
	}
	
	@FindBy(name = "Button1")
	private WebElement go;
	public void getgo() {
		go.click();
	}
	
	@FindBy(id="ddlStatus")
	private WebElement status;
	public WebElement getstatus() {
		return status;
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
			sheet=xml.excelData("ServiceProviderMasters List");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
			
		}
	}
	
	public static void go() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		serviceproviderlist.getserviceprovider();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		serviceproviderlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, SheetName);
		Thread.sleep(1000);
		
	}
	
	public static void status() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		serviceproviderlist.getserviceprovider();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(serviceproviderlist.getstatus(), sheet.getRow(0).getCell(1).getStringCellValue());
		serviceproviderlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, SheetName);
		Thread.sleep(1000);
		
	}
}

