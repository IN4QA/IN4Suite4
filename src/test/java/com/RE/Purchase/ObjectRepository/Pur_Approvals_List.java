package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
		ROPO.click();
	}
	
	@FindBy(xpath="//a[contains(@href,'QuotationList')][contains(@href,'Approvals')]")
	private WebElement Quotaion;
	public void getQuotaion() {
		Quotaion.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListStoreTO')][contains(@href,'Approvals')]")
	private WebElement TransferOrder;
	public void getTO() {
		TransferOrder.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'RateComparisonList')][contains(@href,'Approvals')]")
	private WebElement RateComparision;
	public void getRateComparision() {
		RateComparision.click();
	}

	@FindBy(xpath = "//a[contains(@href,'ListMaterialSales')][contains(@href,'Approvals')]")
	private WebElement MaterialSales;
	public void getMaterialSales() {
		MaterialSales.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListMaterialSalesReceipt')][contains(@href,'Approvals')]")
	private WebElement MaterialSalesReceipt;
	public void getMaterialSalesReceipt() {
		MaterialSalesReceipt.click();
	}
	@FindBy(xpath = "//a[contains(@href,'ListSupplierCertApprovals')][contains(@href,'Approvals')]")
	private WebElement SuppCertificates;
	public void getSuppCertificates() {
		SuppCertificates.click();
	}
	@FindBy(xpath = "//a[contains(@href,'ListSupplierAdvances')][contains(@href,'Approvals')]")
	private WebElement SuppAdvance;
	public void getSuppAdvance() {
		SuppAdvance.click();
	}
	@FindBy(xpath = "//a[contains(@href,'ListSupplierDebitNotes')][contains(@href,'Approvals')]")
	private WebElement SuppDN;
	public void getSuppDN() {
		SuppDN.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListPurchaseOrderDebitNoteWaiveOff')][contains(@href,'Approvals')]")
	private WebElement SuppDNWaiveOff;
	public void getSuppDNWaiveOff() {
		SuppDNWaiveOff.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListPurchaseOrderDebitNoteReceipt')][contains(@href,'Approvals')]")
	private WebElement SuppDNReceipt;
	public void getSuppDNReceipt() {
		SuppDNReceipt.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListSuppliers')][contains(@href,'Masters')]")
	private WebElement SuppMaster;
	public void getSuppMaster() {
		SuppMaster.click();
	}
	

	@FindBy(xpath = "//a[contains(@href,'ListServiceCertificate')][contains(@href,'Approvals')]")
	private WebElement ServCertificates;
	public void getServCertificates() {
		ServCertificates.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderAdvance')][contains(@href,'Approvals')]")
	private WebElement ServAdvances;
	public void getServAdvances() {
		ServAdvances.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderDebitNote')][contains(@href,'Approvals')]")
	private WebElement ServDN;
	public void getServDN() {
		ServDN.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListServiceProviderDebitNoteReceipt')][contains(@href,'Approvals')]")
	private WebElement ServDNReceipt;
	public void getServDNReceipt() {
		ServDNReceipt.click();
	}
	
	@FindBy(name = "txtCertifyingComp")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	@FindBy(name = "txtProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(name = "btnFilterGO")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListServiceProviders')][contains(@href,'ServiceProvider')]")
	private WebElement ServiceProvider;
	public void getServiceProvider() {
		ServiceProvider.click();
	}
	@FindBy(xpath = "//a[contains(@href,'ListPOTermination')][contains(@href,'Approvals')]")
	private WebElement POTermination;
	public void getPOTermination() {
		POTermination.click();
	}
	
	
	public static void MainSubmenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en=new Purchase(iDriver);
			en.clickapprovals();
			Thread.sleep(2000);
			xml=new Datatable();
			sheet = xml.excelData(sheetname,Purchase.inputpath);
			} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
		}
		
	}
	
	public void PurchaseOrder() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void ROPOMapping() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(4000);
		approvalslist.getropolink();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void Quotaion() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(4000);
		approvalslist.getQuotaion();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void TransferOrder() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getTO();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void RateCmparision() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getRateComparision();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void MaterialSales() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getMaterialSales();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void MaterialSalesReceipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getMaterialSalesReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void SuppCertificates() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppCertificates();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void SuppAdvances() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppAdvance();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void SuppDN() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppDN();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void SuppDNWaiveOff() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppDNWaiveOff();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void SuppDNReceipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppDNReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void SuppMaster() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getSuppMaster();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void ServCertificates() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getServCertificates();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	public void ServAdvances() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getServAdvances();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void ServDN() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getServDN();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void ServDNReceipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getServDNReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		WebElement comp=getcompany();
		comp.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		comp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		comp.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement proj=getproject();
		proj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		proj.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		proj.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		approvalslist.getGoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void ServiceProvider() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getServiceProvider();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
	
	public void POTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		approvalslist.getPOTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Purchase.path);
		Thread.sleep(2000);
	}
}

