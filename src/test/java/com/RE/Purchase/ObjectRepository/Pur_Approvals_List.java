package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.Pur_Approvals_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Pur_Approvals_List extends Pur_Approvals_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;

	public Pur_Approvals_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[contains(@href,'ListRoPoMapping')][contains(@href,'Approvals')]")
	private WebElement ROPO;

	public void getropolink() {
		w2.until(ExpectedConditions.elementToBeClickable(ROPO));

		ROPO.click();
	}

	@FindBy(xpath = "//a[contains(@href,'QuotationList')][contains(@href,'Approvals')]")
	private WebElement Quotaion;

	public void getQuotaion() {
		w2.until(ExpectedConditions.elementToBeClickable(Quotaion));
		Quotaion.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListStoreTO')][contains(@href,'Approvals')]")
	private WebElement TransferOrder;

	public void getTO() {
		w2.until(ExpectedConditions.elementToBeClickable(TransferOrder));
		TransferOrder.click();
	}

	@FindBy(xpath = "//a[contains(@href,'RateComparisonList')][contains(@href,'Approvals')]")
	private WebElement RateComparision;

	public void getRateComparision() {
		w2.until(ExpectedConditions.elementToBeClickable(RateComparision));
		RateComparision.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListMaterialSales')][contains(@href,'Approvals')]")
	private WebElement MaterialSales;

	public void getMaterialSales() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialSales));
		MaterialSales.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListMaterialSalesReceipt')][contains(@href,'Approvals')]")
	private WebElement MaterialSalesReceipt;

	public void getMaterialSalesReceipt() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialSalesReceipt));
		MaterialSalesReceipt.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListSupplierCertApprovals')][contains(@href,'Approvals')]")
	private WebElement SuppCertificates;

	public void getSuppCertificates() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertificates));
		SuppCertificates.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListSupplierAdvances')][contains(@href,'Approvals')]")
	private WebElement SuppAdvance;

	public void getSuppAdvance() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppAdvance));
		SuppAdvance.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListSupplierDebitNotes')][contains(@href,'Approvals')]")
	private WebElement SuppDN;

	public void getSuppDN() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDN));
		SuppDN.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListPurchaseOrderDebitNoteWaiveOff')][contains(@href,'Approvals')]")
	private WebElement SuppDNWaiveOff;

	public void getSuppDNWaiveOff() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNWaiveOff));
		SuppDNWaiveOff.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListPurchaseOrderDebitNoteReceipt')][contains(@href,'Approvals')]")
	private WebElement SuppDNReceipt;

	public void getSuppDNReceipt() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceipt));
		SuppDNReceipt.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListSuppliers')][contains(@href,'Masters')]")
	private WebElement SuppMaster;

	public void getSuppMaster() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppMaster));
		SuppMaster.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListServiceCertificate')][contains(@href,'Approvals')]")
	private WebElement ServCertificates;

	public void getServCertificates() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertificates));
		ServCertificates.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderAdvance')][contains(@href,'Approvals')]")
	private WebElement ServAdvances;

	public void getServAdvances() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvances));
		ServAdvances.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderDebitNote')][contains(@href,'Approvals')]")
	private WebElement ServDN;

	public void getServDN() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN));
		ServDN.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderDebitNoteReceipt')][contains(@href,'Approvals')]")
	private WebElement ServDNReceipt;

	public void getServDNReceipt() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceipt));
		ServDNReceipt.click();
	}

	@FindBy(name = "txtCertifyingComp")
	private WebElement company;

	public WebElement getcompany() {
		w2.until(ExpectedConditions.elementToBeClickable(company));
		return company;
	}

	@FindBy(name = "txtProject")
	private WebElement project;

	public WebElement getproject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(name = "btnFilterGO")
	private WebElement GoButton;

	public void getGoButton() {
		w2.until(ExpectedConditions.elementToBeClickable(GoButton));
		GoButton.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListServiceProviders')][contains(@href,'ServiceProvider')]")
	private WebElement ServiceProvider;

	public void getServiceProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServiceProvider));
		ServiceProvider.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListPOTermination')][contains(@href,'Approvals')]")
	private WebElement POTermination;

	public void getPOTermination() {
		w2.until(ExpectedConditions.elementToBeClickable(POTermination));
		POTermination.click();
	}

	public void MainSubmenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en = new Purchase(iDriver);
			en.clickapprovals();
			Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Purchase.inputpath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}

	}

	public void PurchaseOrder() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(4000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ROPOMapping() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(4000);
			approvalslist.getropolink();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(4000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void Quotaion() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(4000);
			approvalslist.getQuotaion();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(4000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void TransferOrder() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getTO();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void RateCmparision() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getRateComparision();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void MaterialSales() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getMaterialSales();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void MaterialSalesReceipt() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getMaterialSalesReceipt();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppCertificates() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppCertificates();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppAdvances() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {

			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppAdvance();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppDN() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppDN();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppDNWaiveOff() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppDNWaiveOff();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppDNReceipt() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppDNReceipt();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void SuppMaster() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getSuppMaster();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ServCertificates() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getServCertificates();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ServAdvances() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getServAdvances();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ServDN() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getServDN();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ServDNReceipt() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getServDNReceipt();
			Thread.sleep(2000);
			Frames.rightFrame();
			WebElement comp = getcompany();
			comp.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			comp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			comp.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement proj = getproject();
			proj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			proj.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			proj.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			approvalslist.getGoButton();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void ServiceProvider() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getServiceProvider();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}

	public void POTermination() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Thread.sleep(2000);
			approvalslist.getPOTermination();
			Thread.sleep(2000);
			Frames.rightFrame();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", sheetname, Purchase.path);
		}
	}
}
