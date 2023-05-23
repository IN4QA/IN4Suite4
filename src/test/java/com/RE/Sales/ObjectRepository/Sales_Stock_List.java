package com.RE.Sales.ObjectRepository;


import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Sales.Test.Sales_Stock_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Sales_Stock_List extends Sales_Stock_Test{

	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static String fDate = "Jan 01, 2000";
	public Sales_Stock_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text() = 'Sales Stock']")
	private WebElement SalesStockLink;
	public void getSalesStockLink() {
		SalesStockLink.click();
	}
	
	@FindBy(css = "input[name='btnGenerateText']")
	private WebElement GenerateBtn;
	public void getGenerateBtn() {
		GenerateBtn.click();
	}
	
	@FindBy(xpath = "//table[@class = 'in4-table-stock']//tr//div//input[contains(@id,'gdvStockList')]")
	private List<WebElement> stockListDD;
	public List<WebElement> getStockListDD() {
		return stockListDD;
	}
	
	@FindBy(xpath = "//table[@class = 'in4-table-stock']//tr[contains(@id,'gdvStockList')]//div")
	private List<WebElement> unitList;
	public List<WebElement> getUnitList() {
		return unitList;
	}
	
	@FindBy(xpath = "//table[@class = 'in4-table-stock']//tr[contains(@id,'gdvStockList')]//div")
	private WebElement singleUnit;
	public WebElement getsingleUnit() {
		return singleUnit;
	}
	
	@FindBy(css = "select[name='ddlProjectList']")
	private WebElement projDD;
	public WebElement getProjDD() {
		return projDD;
	}
	
	@FindBy(css = "select[name='ddlUnitStatus']")
	private WebElement unitStatusDD;
	public WebElement getUnitStatusDD() {
		return unitStatusDD;
	}
	
	@FindBy(xpath = "//span[@id= 'lblUnitPageTitle']")
	private WebElement AvailableUnitsPageName;
	public String getAvailableUnitsPageName() {
		return AvailableUnitsPageName.getText();
	}
	
	@FindBy(xpath = "//span[@id= 'lblViewPageTitle']")
	private WebElement SoldUnitsPageName;
	public String getSoldUnitsPageName() {
		return SoldUnitsPageName.getText();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			//en.clickSalesStock();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname , Sales.inputPath);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void noFilter() throws Throwable {
		Frames.mainFrame();
		Thread.sleep(2000);
		getGenerateBtn();
		Thread.sleep(2000);
		getUnitCount();
	}
	
	public void availableUnit() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.mainFrame();
		Thread.sleep(2000);
		appInd.singleDropDown(getProjDD(), "BURDWAN TOWNSHIP PHASE -2, Burdwan");
		Thread.sleep(2000);
		appInd.singleDropDown(getUnitStatusDD(), "Available");
		Thread.sleep(2000);
		getGenerateBtn();
		Thread.sleep(2000);
		getsingleUnit().click();
		//Assert.assertEquals("View Unit Details", getAvailableUnitsPageName());
		if (getAvailableUnitsPageName().equals("View Unit Details")) {
			Datatable.writeExcel(nameofCurrMethod,"PASS", sheetname , Sales.path);
			
		} else {
			
			Datatable.writeExcel(nameofCurrMethod,"FAIL", sheetname , Sales.path);

		}
	}
	
	public void soldUnit() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		getSalesStockLink();
		Frames.mainFrame();
		Thread.sleep(2000);
		appInd.singleDropDown(getProjDD(), "BURDWAN TOWNSHIP PHASE -2, Burdwan");
		Thread.sleep(2000);
		appInd.singleDropDown(getUnitStatusDD(), "Sold");
		Thread.sleep(2000);
		getGenerateBtn();
		Thread.sleep(2000);
		getsingleUnit().click();
		Thread.sleep(3000);	
		w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("AccountDetails"));
		//Assert.assertEquals("Booking Details", getSoldUnitsPageName());
		if (getSoldUnitsPageName().equals("Booking Details")) {
			Datatable.writeExcel(nameofCurrMethod,"PASS", sheetname , Sales.path);
		} else {
			Datatable.writeExcel(nameofCurrMethod,"FAIL", sheetname , Sales.path);
		}
	}
	
	public void holdUnit() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		getSalesStockLink();
		Frames.mainFrame();
		Thread.sleep(2000);
		appInd.singleDropDown(getProjDD(), "BURDWAN TOWNSHIP PHASE -2, Burdwan");
		Thread.sleep(2000);
		appInd.singleDropDown(getUnitStatusDD(), "Hold");
		Thread.sleep(2000);
		getGenerateBtn();
		Thread.sleep(2000);
		getsingleUnit().click();
		Thread.sleep(2000);
		//Assert.assertEquals("View Unit Details", getAvailableUnitsPageName());
		if (getAvailableUnitsPageName().equals("View Unit Details")) {
			Datatable.writeExcel(nameofCurrMethod,"PASS", sheetname , Sales.path);
		} else {
			Datatable.writeExcel(nameofCurrMethod,"FAIL", sheetname , Sales.path);
		}
	}
	
	public void blockedUnit() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		getSalesStockLink();
		Frames.mainFrame();
		Thread.sleep(2000);
		appInd.singleDropDown(getProjDD(), "BURDWAN TOWNSHIP PHASE -2, Burdwan");
		Thread.sleep(2000);
		appInd.singleDropDown(getUnitStatusDD(), "Blocked");
		Thread.sleep(2000);
		getGenerateBtn();
		Thread.sleep(2000);
		getsingleUnit().click();
		Thread.sleep(2000);
		//Assert.assertEquals("View Unit Details", getAvailableUnitsPageName());
		if (getAvailableUnitsPageName().equals("View Unit Details")) {
			Datatable.writeExcel(nameofCurrMethod,"PASS", sheetname , Sales.path);
		} else {
			Datatable.writeExcel(nameofCurrMethod,"FAIL", sheetname , Sales.path);
		}
	}
	
	int units = 0;
	int i = 1;
	WebElement oEL = null; 	
	public void getUnitCount() {
		int count = 0;
		WebElement UNDD = null;
		for(int i=1;i<getStockListDD().size();i++) {
			
			if(count == 0) {
				units = getUnitList().size();
				count++;
				System.out.println(units);
			}else {
				try {
					Thread.sleep(3000);
					iDriver.findElement(By.xpath("(//table[@class = 'in4-table-stock']//tr//div//input[contains(@id,'gdvStockList')][contains(@src,'feather-arrow')])["+i+"]")).click();
					Thread.sleep(3000);
					}catch(Exception e) {
						System.out.println(e);
					}
				units = units + getUnitList().size();
				System.out.println(units);
			}
			try {
			Thread.sleep(3000);
			iDriver.findElement(By.xpath("(//table[@class = 'in4-table-stock']//tr//div//input[contains(@id,'gdvStockList')][contains(@src,'feather-arrow')])["+i+"]")).click();
			Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Number of units displayed: "+units);
	}
}
