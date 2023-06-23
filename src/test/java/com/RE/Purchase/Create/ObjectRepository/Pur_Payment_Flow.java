package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.ObjectRepository.Indent_Create;
import com.RE.Purchase.Create.Test.Pur_Payment_Flow_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_Payment_Flow extends Pur_Payment_Flow_Test{
	public static XSSFSheet sheet;
	public static XSSFSheet sheetPO;
	public static XSSFSheet sheetGRN;
	public static XSSFSheet sheetAdv;
	public static XSSFSheet sheetPayment;
	public static XSSFSheet sheetBOQ;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String PurpaymentflowOutput="Pur_Payment_Flow";
	public static Indent_Create IndentCreate;
	public static String sheetname = "Indent_Create";
	public static String sheetnamePO = "PO_Create";
	public static String sheetnameGRN = "GRN_Create";
	public static String sheetnameBOQ = "BOQ_Create";
	public static String sheetnameAdv = "SuppAdvance_Create";
	public static String sheetnamePayment = "SuppPayment_Create";
	public static String Indentstartdate="May 01, 2023";
	
	public Pur_Payment_Flow(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	} 
	@FindBy(xpath = "//a[text()='Indents']")
	private WebElement indlink;
	public void getindlink() {
		indlink.click();
	}
	@FindBy(css = "input#btnCreate")
	private WebElement CreateIndBtn;
	public void getCreateIndBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateIndBtn));
		CreateIndBtn.click();
	}
	@FindBy(name = "ddlIndentType")
	private WebElement IndentTypeDD;
	public WebElement getIndentTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(IndentTypeDD));
		return IndentTypeDD;
	}
	// Project Drop down
		@FindBy(css = "select#ddlProject")
		private WebElement IndProjectDD;
		public WebElement getIndProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(IndProjectDD));
			return IndProjectDD;
		} 
		
		@FindBy(css = "select#ddlSubProject")
		private WebElement IndSubProjectDD;
		public WebElement getIndSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(IndSubProjectDD));
			return IndSubProjectDD;
		} 
		@FindBy(css = "select#ddlProjectList")
		private WebElement POProjectDD;
		public WebElement getPOProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POProjectDD));
			return POProjectDD;
		} 
		
		@FindBy(css = "select#ddlSubProject")
		private WebElement POSubProjectDD;
		public WebElement getPOSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POSubProjectDD));
			return POSubProjectDD;
		}
		
		// WO select Link
		@FindBy(css = "a#lnkSelectWorkOrder")
		private WebElement SelectWorkOrder;
		public WebElement getSelectWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectWorkOrder));
			return SelectWorkOrder;
		} 
		
		// Search WO button
		@FindBy(css = "#txtWorlOrder")
		private WebElement EnterWorkOrder;
		public WebElement getEnterWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterWorkOrder));
			return EnterWorkOrder;
		} 
		
		//search button in Select WO page
		@FindBy(css = "#btnSearch")
		private WebElement SearchWorkOrder;
		public void getSearchWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchWorkOrder));
			SearchWorkOrder.click();
		}
		
		// Select WO record 
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
		private WebElement SelectWorkOrderRadio;
		public void getSelectWorkOrderRadio() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectWorkOrderRadio));
			SelectWorkOrderRadio.click();
		} 
		
		// Accept Selected button
//		@FindBy(xpath = "//a[text()='Accept Selected']")
//		private WebElement AcceptSelected;
//		public void getAcceptSelected() {
//			w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
//			AcceptSelected.click();
//		} 
		// MM Store 
		@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[4]//select")
		private WebElement StoreDD;
		public WebElement getStoreDD() {
			w2.until(ExpectedConditions.elementToBeClickable(StoreDD));
			return StoreDD;
		} 
		
		// MM Quantity 
		@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[6]//input")
		private WebElement Quantity;
		public WebElement getQuantity() {
			w2.until(ExpectedConditions.elementToBeClickable(Quantity));
			Quantity.clear();
			return Quantity;
		}
		// Delivery Schedule downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//input[@type='image']")
		private WebElement DownArrow;
		public void getDownArrow() {
			w2.until(ExpectedConditions.elementToBeClickable(DownArrow));
			DownArrow.click();
		} 
		// Add Button
		@FindBy(css = "input#BtnAddItem")
		private WebElement AddBtn;
		public void getAddBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(AddBtn));
			AddBtn.click();
		}
		
		// Delivery Date of downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//table//tr[2]//table//tr[2]//td[3]//input")
		private WebElement DeliveryDateArrow;
		public WebElement getDeliveryDateArrow() {
			w2.until(ExpectedConditions.elementToBeClickable(DeliveryDateArrow));
			return DeliveryDateArrow;
		} 
		
		// Quantity of downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//table//tr[2]//table//tr[2]//td[4]//input")
		private WebElement QuantityArrow;
		public WebElement getQuantityArrow() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(QuantityArrow));
			QuantityArrow.clear();
			Thread.sleep(2000);
			w2.until(ExpectedConditions.elementToBeClickable(QuantityArrow));
			return QuantityArrow;
		} 
		// Remarks field in Create indent page
		@FindBy(css = "textarea#txtRemarks")
		private WebElement Remarks;
		public WebElement getRemarks() {
			return Remarks;
		} 
		
		// Create button in Create indent page
		@FindBy(css = "input#btnCreate")
		private WebElement CreateBtn;
		public WebElement getCreateBtn() {
			return CreateBtn;
		}
		// WO Summary button
		@FindBy(css = "input#btnWorkOrderSummary")
		private WebElement WorkOrderSummaryBtn;
		public void getWorkOrderSummaryBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(WorkOrderSummaryBtn));
			WorkOrderSummaryBtn.click();
		} 

		// Add Material button
		@FindBy(css = "#btnIndentAddItem")
		private WebElement IndentAddItemBtn;
		public WebElement getIndentAddItemBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(IndentAddItemBtn));
			return IndentAddItemBtn;
		} 

		//Selecting records in WO Summary
		@FindBy(xpath = "//table[@class='in4-table1 mt-5']//tr[2]//td//input[@type='checkbox']")
		private WebElement WOSummaryRecord;
		public void getWOSummaryRecord() {
			w2.until(ExpectedConditions.elementToBeClickable(WOSummaryRecord));
			WOSummaryRecord.click();
		} 
		
		// Indent Number
		@FindBy(xpath = "//div[@id='upIndentType']/..//span[@id='lblIndentNo']")
		private WebElement IndentNumber;
		public String getIndentNumber() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(IndentNumber));
			return IndentNumber.getText();
		}
		@FindBy(id = "lnkChangeStatus")
		private WebElement changestatus;
		public void getchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(changestatus));
			changestatus.click();
		}
		@FindBy(css = "select#ddlUpdateStatusList")
		private WebElement StatusDD;
		public WebElement getStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
			return StatusDD;
		}
		@FindBy(css = "a#lnkUpdateStatus")
		private WebElement updatestatus;
		public void getupdatestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(updatestatus));
			updatestatus.click();
		}
		//Purchase Order
		@FindBy(xpath = "//a[text()='Purchase Orders']")
		private WebElement POlink;
		public void getPOlink() {
			w2.until(ExpectedConditions.elementToBeClickable(POlink));
			POlink.click();
		}
		@FindBy(name = "btnCreate")
		private WebElement CreatePObutton;
		public void getCreatePObutton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreatePObutton));
			CreatePObutton.click();
		}

		@FindBy(xpath = "//table[@id='frmViewPOIndent_rdPOTypeList']//tr[1]//td[1]//input[@type='radio']")
		private WebElement DomesticPO;
		public void getDomesticPO() {
			w2.until(ExpectedConditions.elementToBeClickable(DomesticPO));
			DomesticPO.click();
		}
		@FindBy(xpath = "//table[@id='frmViewPOIndent_rdoPOCategoryList']//tr[1]//td[1]//input[@type='radio']")
		private WebElement MaterialPO;
		public void getMaterialPO() {
			w2.until(ExpectedConditions.elementToBeClickable(MaterialPO));
			MaterialPO.click();
		}
		@FindBy(css = "select#frmViewPOIndent_ddlCompanyList")
		private WebElement Company;
		public WebElement getCompany() {
			w2.until(ExpectedConditions.elementToBeClickable(Company));
			return Company;
		}
		@FindBy(xpath = "//input[@displaytext='Purchase Order Date']")
		private WebElement POdate;
		public WebElement getPOdate() {
			w2.until(ExpectedConditions.elementToBeClickable(POdate));
			return POdate;
		}
		@FindBy(css = "input#frmViewPOIndent_chkDebitable")
		private WebElement Debitable;
		public void getDebitable() {
			w2.until(ExpectedConditions.elementToBeClickable(Debitable));
			Debitable.click();
		}
		
		@FindBy(css = "select#frmViewPOIndent_ddlSupplier")
		private WebElement supplier;
		public WebElement getsupplier() {
			w2.until(ExpectedConditions.elementToBeClickable(supplier));
			return supplier;
		}
		@FindBy(id = "frmViewPOIndent_txtPORef")
		private WebElement POrefNo;
		public WebElement getPOrefNo() {
			w2.until(ExpectedConditions.elementToBeClickable(POrefNo));
			return POrefNo;
		}
		@FindBy(id = "frmViewPOIndent_txtDocThru")
		private WebElement DocumentThrough	;
		public WebElement getDocumentThrough() {
			w2.until(ExpectedConditions.elementToBeClickable(DocumentThrough));
			return DocumentThrough;
		}
		@FindBy(id = "frmViewPOIndent_btnIndent")
		private WebElement AddMaterial_Indent;
		public void getAddMaterial_Indent() {
			w2.until(ExpectedConditions.elementToBeClickable(AddMaterial_Indent));
			 AddMaterial_Indent.click();;
		}
		@FindBy(name = "txtFilterIndentNumber")
		private WebElement Indent_No;
		public WebElement getIndent_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Indent_No));
			return Indent_No;
		}
		@FindBy(name = "txtFilterWorkOrder")
		private WebElement WO_No;
		public WebElement getWO_No() {
			w2.until(ExpectedConditions.elementToBeClickable(WO_No));
			return WO_No;
		}
		@FindBy(css = "input#dtIndentFromDate_txtDate")
		private WebElement IndentFromdate;
		public WebElement getIndentFromdate() {
			w2.until(ExpectedConditions.elementToBeClickable(IndentFromdate));
			return IndentFromdate;
		}
		@FindBy(css = "input#dtIndenToDate_txtDate")
		private WebElement ToDate;
		public WebElement getToDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ToDate));
			return ToDate;
		}
		@FindBy(name = "btnFilterGO")
		private WebElement Search;
		public void getSearch() {
			w2.until(ExpectedConditions.elementToBeClickable(Search));
			 Search.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input[@type='checkbox']")
		private WebElement checkbox;
		public void getcheckbox() {
			w2.until(ExpectedConditions.elementToBeClickable(checkbox));
			checkbox.click();
		}
		
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement WOAcceptSelected;
		public void getWOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(WOAcceptSelected));
			WOAcceptSelected.click();
		}
		@FindBy(id = "lnkAcceptSelected")
		private WebElement GRNAcceptSelected;
		public void getGRNAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNAcceptSelected));
			GRNAcceptSelected.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//input[@type='text']")
		private WebElement PO_Qty;
		public WebElement getPO_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_Qty));
			return PO_Qty;
		}
		//Rate and Tax page
		@FindBy(name = "btnCreate")
		private WebElement createbutton;
		public void getcreatebutton() {
			w2.until(ExpectedConditions.elementToBeClickable(createbutton));
			createbutton.click();
		}
		@FindBy(xpath = "//a[text()='Add Rate/Tax']")
		private WebElement AddRateTax;
		public WebElement getAddRateTax() {
			w2.until(ExpectedConditions.elementToBeClickable(AddRateTax));
			return AddRateTax;
		}
		
		By ByRate = By.xpath("//td[@class='nopadding']//tr[2]//td[2]//input[@name='txtUnitRate']");
		
		@FindBy(xpath = "//td[@class='nopadding']//tr[2]//td[2]//input[@name='txtUnitRate']")
		private WebElement Rate;
		public WebElement getRate() {
			w2.until(ExpectedConditions.elementToBeClickable(Rate));
			return Rate;
		}
		@FindBy(css = "input#btnCalculate")
		private WebElement CalRate;
		public void getCalRate() {
			w2.until(ExpectedConditions.elementToBeClickable(CalRate));
			CalRate.click();
		}
		@FindBy(css = "input#btnSave")
		private WebElement SaveRate;
		public void getSaveRate() {
			w2.until(ExpectedConditions.elementToBeClickable(SaveRate));
			SaveRate.click();
		}
		@FindBy(css = "input#btnUpdate")
		private WebElement UpdateRate;
		public void getUpdateRate() {
			w2.until(ExpectedConditions.elementToBeClickable(UpdateRate));
			UpdateRate.click();
		}
		//Terms and Conditions page
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement Servcheckbox;
		public void getServcheckbox() {
			w2.until(ExpectedConditions.elementToBeClickable(Servcheckbox));
			Servcheckbox.click();
		}
		By BySelectServLink = By.xpath("//a[text()='Select']");
		
		@FindBy(xpath = "//a[text()='Select']")
		private WebElement SelectServLink;
		public WebElement getSelectServLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectServLink));
		return	SelectServLink;
		}
		@FindBy(name = "textServiceProviderName")
		private WebElement SearchBy;
		public WebElement getSearchBy() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchBy));
		return	SearchBy;
		}
		
		@FindBy(name = "btnFilterGO")
		private WebElement Gobutton;
		public void getGobutton() {
			w2.until(ExpectedConditions.elementToBeClickable(Gobutton));
			Gobutton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//a[@id='gdvServiceProviderList_ctl02_lnkServiceProviderName']")
		private WebElement ServiceProviderName;
		public void getServiceProviderName() {
			w2.until(ExpectedConditions.elementToBeClickable(ServiceProviderName));
			ServiceProviderName.click();
		}
		
		@FindBy(css = "input#FormViewTermsAndConditions_txtSupplierAdvanceAllowed")
		private WebElement SuppAdvance;
		public WebElement getSuppAdvance() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppAdvance));
			return SuppAdvance;
		}
		@FindBy(css = "input#FormViewTermsAndConditions_txtServiceCertificateAdvanceAllowed")
		private WebElement ServAdvance;
		public WebElement getServAdvance() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvance));
			return ServAdvance;
		}

		@FindBy(name = "ButtonUpdate")
		private WebElement UpdateTermandConditions;
		public void getUpdateTermandConditions() {
			w2.until(ExpectedConditions.elementToBeClickable(UpdateTermandConditions));
			 UpdateTermandConditions.click();
		}
		@FindBy(css = "a#frmViewPOIndent_lnkChangeStatus")
		private WebElement changetstaus;
		public void getchangetstaus() {
			w2.until(ExpectedConditions.elementToBeClickable(changetstaus));
			changetstaus.click();
		}
		
		@FindBy(css = "select#frmViewPOIndent_ddlUpdateStatusList")
		private WebElement stausDD;
		public WebElement getstausDD() {
			w2.until(ExpectedConditions.elementToBeClickable(stausDD));
			return stausDD;
		}
		
		@FindBy(xpath = "//a[text()='Update Status']")
		private WebElement upadtetstaus;
		public void getupadtetstaus() {
			w2.until(ExpectedConditions.elementToBeClickable(upadtetstaus));
			upadtetstaus.click();
		}
		@FindBy(css = "textarea#frmViewPOIndent_txtStatusRemark")
		private WebElement ApproverRemarks;
		public WebElement getApproverRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ApproverRemarks));
			return ApproverRemarks;
		}
		//table[@class='in4-table']//tr
		////table[@class='in4-table']//tr//td[1]
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr//td[1]")
		private List<WebElement> Charges;
		public List<WebElement> getCharges() {
			return Charges;
		}
		@FindBy(id = "frmViewPOIndent_lblPODisplayNoValue")
		private WebElement POnumber;
		public String getPOnumber() {
			w2.until(ExpectedConditions.elementToBeClickable(POnumber));
			return POnumber.getText();
		}
		@FindBy(css = "a#frmViewPOIndent_lnkChangeStatus")
		private WebElement POchangestatus;
		public void getPOchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(POchangestatus));
			POchangestatus.click();
		}
		@FindBy(css = "select#frmViewPOIndent_ddlUpdateStatusList")
		private WebElement POstatusDD;
		public WebElement getPOstatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POstatusDD));
			return POstatusDD;
		}
		@FindBy(xpath = "//a[@id='frmViewPOIndent_lnkUpdateStatus']")
		private WebElement POUpdatestaus;
		public void getPOUpdatestaus() {
			w2.until(ExpectedConditions.elementToBeClickable(POUpdatestaus));
			POUpdatestaus.click();
		}
		//GRN 
		// 'GRN' link in sub frame
		@FindBy(xpath = "//a[text()='GRN']")
		private WebElement GRN_Link;
		public void getGRN_Link() {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Link));
			GRN_Link.click();
		}
		//
		@FindBy(id = "btnCreateGRN")
		private WebElement CreateGRN;
		public void getCreateGRN() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateGRN));
			CreateGRN.click();
		}
		@FindBy(id = "ddlGRNType")
		private WebElement GRNTypeDD;
		public WebElement getGRNTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNTypeDD));
			return GRNTypeDD;
		}
		@FindBy(css = "select#ddlSupplierList")
		private WebElement SupplierDD;
		public WebElement getSupplierDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SupplierDD));
			return SupplierDD;
		}
		@FindBy(id = "ddlCertifyingCompany")
		private WebElement CompanyDD;
		public WebElement getCompanyDD() {
			w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
			return CompanyDD;
		}
		//tr[@id='trProject']//select[@class='multiselect dropdown-toggle btn btn-default']
		@FindBy(xpath = "//tr[@id='trProject']//input[@placeholder='Search']")
		private WebElement EnterGRNProject;
		public WebElement getEnterGRNProject() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterGRNProject));
			return EnterGRNProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//li")
		private List<WebElement> ListtOfGRNProject;
		public List<WebElement> getListtOfGRNProject() {
				return ListtOfGRNProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//span[@class='multiselect-selected-text']")
		private WebElement GRNProjectDD;
		public WebElement getGRNProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNProjectDD));
			return GRNProjectDD;
		}
		

		@FindBy(xpath = "//tr[@id='trSubProject']//span[@class='multiselect-selected-text']")
		private WebElement GRNSubProjectDD;
		public WebElement getGRNSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNSubProjectDD));
			return GRNSubProjectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProject']//input[@placeholder='Search']")
		private WebElement EnterGRNSubProject;
		public WebElement getEnterGRNSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterGRNSubProject));
			return EnterGRNSubProject;
		}
		@FindBy(xpath = "//tr[@id='trSubProject']//li")
		private List<WebElement> ListOfGRNSubProject;
		public List<WebElement> getListOfGRNSubProject() {
			return ListOfGRNSubProject;
		}
		
		@FindBy(id = "lbnSelectPO")
		private WebElement SelectPO;
		public WebElement getSelectPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectPO));
			return SelectPO;
		}
		@FindBy(css = "select#ddlToStore")
		private WebElement GRNTo_Store;
		public WebElement getGRNTo_Store() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNTo_Store));
			return GRNTo_Store;
		}
		@FindBy(css = "input#txtDeliveryChallanInvoiceNo")
		private WebElement Challan_No;
		public WebElement getChallan_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Challan_No));
			return Challan_No;
		}
		@FindBy(id = "dtDeliveryChallanInvoiceDate_txtDatePicker")
		private WebElement Challan_Date;
		public WebElement getChallan_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(Challan_Date));
			return Challan_Date;
		}
		@FindBy(id = "txtDCDate_txtDatePicker")
		private WebElement EditChallan_Date;
		public WebElement getEditChallan_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(EditChallan_Date));
			return EditChallan_Date;
		}
		@FindBy(id = "dtGRNDate_txtDatePicker")
		private WebElement GRN_Date;
		public WebElement getGRN_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Date));
			return GRN_Date;
		}
		@FindBy(id = "txtVehileNo")
		private WebElement Vehicle_No;
		public WebElement getVehicle_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Vehicle_No));
			return Vehicle_No;
		}
		@FindBy(id = "txtVehiNo")
		private WebElement EditVehicle_No;
		public WebElement getEditVehicle_No() {
			w2.until(ExpectedConditions.elementToBeClickable(EditVehicle_No));
			return EditVehicle_No;
		}
		@FindBy(id = "txtgateNo")
		private WebElement Gate_No;
		public WebElement getGate_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Gate_No));
			return Gate_No;
		}
		@FindBy(id = "txtRemarks")
		private WebElement GRNRemarks;
		public WebElement getGRNRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNRemarks));
			return GRNRemarks;
		}
		
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//td[2]//span//div//button")
		private WebElement PO_NoDD;
		public WebElement getPO_NoDD() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_NoDD));
			return PO_NoDD;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//input[@placeholder='Search']")
		private WebElement EnterPO_No;
		public WebElement getEnterPO_No() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterPO_No));
			return EnterPO_No;
		}

		@FindBy(xpath = "//div[@class='btn-group open']//ul[@class='multiselect-container dropdown-menu']//li")
		private List<WebElement> ListofPO;
		public List<WebElement> getListofPO() {
			
			return ListofPO;
		}
		@FindBy(id = "btnSearch")
		private WebElement SearchButton;
		public void getSearchButton() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchButton));
			 SearchButton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]")
		private WebElement PO_Radio;
		public void getPO_Radio() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_Radio));
			 PO_Radio.click();;
		}
		
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement AcceptSelected;
		public void getAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
			 AcceptSelected.click();;
		}
		//it will give the input to the first row
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[3]//input[@type='text']")
		private WebElement Received_Qty;
		public WebElement getReceived_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(Received_Qty));
			return Received_Qty;
		}
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[4]//input")
		private WebElement EditReceived_Qty;
		public WebElement getEditReceived_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(EditReceived_Qty));
			return EditReceived_Qty;
		}
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[8]//input")
		private WebElement InspectedDate;
		public WebElement getInspectedDate() {
			w2.until(ExpectedConditions.elementToBeClickable(InspectedDate));
			return InspectedDate;
		}
		@FindBy(css = "input#btnCreate")
		private WebElement GRNCreateButton;
		public void getGRNCreateButton() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNCreateButton));
			GRNCreateButton.click();
		}
		@FindBy(id = "lnkChangeStatus")
		private WebElement GRNchangestatus;
		public void getGRNchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNchangestatus));
			GRNchangestatus.click();;
		
		}
		
		@FindBy(css = "select#ddlStatus")
		private WebElement GRNStatusDD;
		public WebElement getGRNStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNStatusDD));
			return GRNStatusDD;
	}
		@FindBy(css = "a#lbnUpdateStatus")
		private WebElement GRNupdatestatus;
		public void getGRNupdatestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNupdatestatus));
			GRNupdatestatus.click();
		
		}
		@FindBy(id = "lblGrnDisplayNo")
		private WebElement GRN_Number;
		public String getGRN_Number() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Number));
			return GRN_Number.getText();
		}
		
		//ADVANCE LOCATORS 
		@FindBy(xpath = "//a[text()='Supplier Advances']")
		private WebElement SuppAdvlink;
		public void getSuppAdvlink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppAdvlink));
			SuppAdvlink.click();
		}
		
		@FindBy(id = "btnCreate")
		private WebElement CreateSuppAdvButton;
		public void getCreateSuppAdvButton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSuppAdvButton));
			CreateSuppAdvButton.click();
		}
		
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement AdvCompanyDD;
		public WebElement getAdvCompanyDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvCompanyDD));
		return	AdvCompanyDD;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
		private WebElement AdvprojectDD;
		public WebElement getAdvprojectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDD));
		return	AdvprojectDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
		private WebElement AdvprojectDDClick;
		public void getAdvprojectDDClick() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDDClick));
			AdvprojectDD.click();
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
		private WebElement AdvEnterProjDD;
		public WebElement getAdvEnterProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvEnterProjDD));
		return	AdvEnterProjDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
		private List<WebElement> AdvListofProj;
		public List<WebElement> getAdvListofProj() {
			return	AdvListofProj;
		}
		
		
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
		private WebElement AdvSubprojectDD;
		public WebElement getAdvSubprojectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvSubprojectDD));
		return	AdvSubprojectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
		private WebElement AdvEnterSubProjDD;
		public WebElement getAdvEnterSubProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvEnterSubProjDD));
		return	AdvEnterSubProjDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
		private List<WebElement> AdvListofSubProj;
		public List<WebElement> getAdvListofSubProj() {
			return	AdvListofSubProj;
		}
		
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement AdvPayCompDD;
		public WebElement getAdvPayCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPayCompDD));
		return	AdvPayCompDD;
		}
		
		@FindBy(xpath = "//a[text()='Select']")
		private WebElement SelectPOlink;
		public WebElement getSelectPOlink() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectPOlink));
		return	SelectPOlink;
		}

		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
		private WebElement PO_NumDD;
		public WebElement getPO_NumDD() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_NumDD));
		return	PO_NumDD;
		}
		//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
		private WebElement EnterAdvPO;
		public WebElement getEnterAdvPO() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterAdvPO));
		return	EnterAdvPO;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
		private List<WebElement> EnterAdvListOfPO;
		public List<WebElement> getEnterAdvListOfPO() {
		return	EnterAdvListOfPO;
		}
		
		@FindBy(id = "btnSearch")
		private WebElement SearchAdvPO;
		public void getSearchAdvPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchAdvPO));
			SearchAdvPO.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input[@type='radio']")
		private WebElement AdvPORadio;
		public void getAdvPORadio() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPORadio));
			AdvPORadio.click();
		}
		
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement AdvPOAcceptSelected;
		public void getAdvPOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPOAcceptSelected));
			AdvPOAcceptSelected.click();
		}
		@FindBy(css = "input#chkTaximpact")
		private WebElement AdvTaxImpact;
		public void getAdvTaxImpact() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvTaxImpact));
			AdvTaxImpact.click();
		}
		@FindBy(css = "input#txtInvoiceNumber")
		private WebElement AdvInvoiceNo;
		public WebElement getAdvInvoiceNo() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceNo));
			return AdvInvoiceNo;
		}
		@FindBy(css = "input#txtInvoiceAmt")
		private WebElement AdvInvoiceAmt;
		public WebElement getAdvInvoiceAmt() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceAmt));
			return AdvInvoiceAmt;
		}
		@FindBy(css = "input#invoicedt_txtDatePicker")
		private WebElement AdvInvoiceDate;
		public WebElement getAdvInvoiceDate() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceDate));
			return AdvInvoiceDate;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//input[@type='text']")
		private WebElement AdvPOQty;
		public WebElement getAdvPOQty() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPOQty));
			return AdvPOQty;
		}
		@FindBy(xpath = "//a[text()='Add Rate/Tax']")
		private WebElement Adv_AddRateTax;
		public void getAdv_AddRateTax() {
			w2.until(ExpectedConditions.elementToBeClickable(Adv_AddRateTax));
			 Adv_AddRateTax.click();
		}
		@FindBy(css = "input#txtUnitRate")
		private WebElement Adv_Rate;
		public WebElement getAdv_Rate() {
			w2.until(ExpectedConditions.elementToBeClickable(Adv_Rate));
			return Adv_Rate;
		}
		@FindBy(css = "input#txtUnitRate")
		private List<WebElement> AdvCharges;
		public List<WebElement> getAdvCharges(){
			return AdvCharges;
		}
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement AdvDedTax;
		public void getAdvDedTax(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax));
			AdvDedTax.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//div//select")
		private WebElement AdvDedTaxCategory;
		public WebElement getAdvDedTaxCategory(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory));
		return	AdvDedTaxCategory;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//div//select")
		private WebElement AdvDedTaxPer;
		public WebElement getAdvDedTaxPer(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer));
		return	AdvDedTaxPer;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//div//input")
		private WebElement AdvDedTaxableAmt;
		public WebElement getAdvDedTaxableAmt(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt));
		return	AdvDedTaxableAmt;
		}
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement AdvDedTax2;
		public void getAdvDedTax2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax2));
			AdvDedTax2.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//div//select")
		private WebElement AdvDedTaxCategory2;
		public WebElement getAdvDedTaxCategory2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory2));
		return	AdvDedTaxCategory2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//div//select")
		private WebElement AdvDedTaxPer2;
		public WebElement getAdvDedTaxPer2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer2));
		return	AdvDedTaxPer2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[5]//div//input")
		private WebElement AdvDedTaxableAmt2;
		public WebElement getAdvDedTaxableAmt2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt2));
		return	AdvDedTaxableAmt2;
		}
		@FindBy(css = "input#btnCreate")
		private WebElement AdvCreate;
		public void getAdvCreate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvCreate));
			AdvCreate.click();
		}
		
		@FindBy(css = "input#btnCalculate")
		private WebElement AdvCalRate;
		public void getAdvCalRate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvCalRate));
			AdvCalRate.click();
		}
		@FindBy(css = "input#btnSave")
		private WebElement AdvSaveRate;
		public void getAdvSaveRate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvSaveRate));
			AdvSaveRate.click();
		}
		
		@FindBy(css = "select#ddlModeOfPayment")
		private WebElement AdvModeofPay;
		public WebElement getAdvModeofPay(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvModeofPay));
			return AdvModeofPay;
		}
		@FindBy(css = "input#dtPaymentDueDate_txtDatePicker")
		private WebElement AdvPayDueDate;
		public WebElement getAdvPayDueDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvPayDueDate));
			return AdvPayDueDate;
		}
		@FindBy(id = "txtFavouring")
		private WebElement AdvFavouring;
		public WebElement getAdvFavouring(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvFavouring));
			return AdvFavouring;
		}
		
		@FindBy(css = "textarea#txtRemarks")
		private WebElement AdvRemarks;
		public WebElement getAdvRemarks(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvRemarks));
			return AdvRemarks;
		}
		
		
		@FindBy(id = "lblAdvanceNoView")
		private WebElement Advnumber;
		public String getAdvnumber(){
			w2.until(ExpectedConditions.elementToBeClickable(Advnumber));
			 return Advnumber.getText();
		}
		
		@FindBy(css = "input#btnModify")
		private WebElement AdvModify;
		public void getAdvModify(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvModify));
			AdvModify.click();
		}
		@FindBy(css = "input#btnUpdate")
		private WebElement AdvUpdate;
		public void getAdvUpdate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvUpdate));
			AdvUpdate.click();
		}
		@FindBy(id = "lnkBtnChangeStatus")
		private WebElement AdvChangestatus;
		public void getAdvChangestatus(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvChangestatus));
			AdvChangestatus.click();
		}
		@FindBy(css = "select#ddlNextStatus")
		private WebElement AdvStatusDD;
		public WebElement getAdvStatusDD(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvStatusDD));
			return AdvStatusDD;
		}
		@FindBy(css = "a#lnkBtnUpdateStatus")
		private WebElement AdvUpdateStatus;
		public void getAdvUpdateStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvUpdateStatus));
			AdvUpdateStatus.click();
		}
		
		@FindBy(css = "input#dtExpectedDate_txtDatePicker")
		private WebElement AdvExpectedDate;
		public WebElement getAdvExpectedDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvExpectedDate));
			return AdvExpectedDate;
		}
		
		@FindBy(css = "input#dtProcessedDate_txtDatePicker")
		private WebElement AdvprocessDate;
		public WebElement getAdvprocessDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvprocessDate));
			return AdvprocessDate;
		}
		@FindBy(xpath="//a[text()='Supplier Adv.']")
		private static WebElement FinPurAdv;
		public void getFinPurAdv() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurAdv));
			FinPurAdv.click();
		}
		@FindBy(css = "input#txtStatus")
		private static WebElement FinPurAdvstatus;
		public WebElement getFinPurAdvstatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurAdvstatus));
			return FinPurAdvstatus;
		}
		
		@FindBy(id = "txtAdvanceNo")
		private static WebElement FinAdvNo;
		public WebElement getFinAdvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvNo));
			return FinAdvNo;
		}
		
		@FindBy(id = "btnGo")
		private static WebElement FinAdvGo;
		public void getFinAdvGo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvGo));
			FinAdvGo.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-10']//tr[2]//a")
		private static WebElement AdvNo;
		public void getAdvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvNo));
			AdvNo.click();
		}
		@FindBy(xpath = "//a[text()='Make Bank Payment']")
		private static WebElement PaymentLink;
		public WebElement getPaymentLink() {
			w2.until(ExpectedConditions.elementToBeClickable(PaymentLink));
		return	PaymentLink;
		}
		@FindBy(css = "select#ddlBankCash")
		private static WebElement BankAccountDD;
		public WebElement getBankAccountDD() {
			w2.until(ExpectedConditions.elementToBeClickable(BankAccountDD));
		return	BankAccountDD;
		}
		@FindBy(css = "input#txtInstrumentNo")
		private static WebElement InstrumentNo;
		public WebElement getInstrumentNo() {
			w2.until(ExpectedConditions.elementToBeClickable(InstrumentNo));
		return	InstrumentNo;
		}
		@FindBy(css = "input#btnSubmit")
		private static WebElement PaymentSubmit;
		public void getPaymentSubmit() {
			w2.until(ExpectedConditions.elementToBeClickable(PaymentSubmit));
			PaymentSubmit.click();
		}
		@FindBy(id = "lblStatus")
		private static WebElement paymentstatus;
		public String getpaymentstatus() {
			w2.until(ExpectedConditions.elementToBeClickable(paymentstatus));
		return	paymentstatus.getText();
		}
		
		//Supplier Payments locators
		@FindBy(xpath = "//a[text()='Supplier Certificates']")
		private WebElement SuppCertLink;
		public void getSuppCertLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertLink));
			SuppCertLink.click();
		}
		@FindBy(id = "btnCreateNew")
		private WebElement CreateSuppCertButton;
		public void getCreateSuppCertButton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSuppCertButton));
			CreateSuppCertButton.click();
		}
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement SuppCertCompDD;
		public WebElement getSuppCertCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertCompDD));
			return SuppCertCompDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//span//button")
		private WebElement SuppCertProjectDD;
		public WebElement getSuppCertProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertProjectDD));
			return SuppCertProjectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
		private WebElement SuppCertEnterProject;
		public WebElement getSuppCertEnterProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterProject));
			return SuppCertEnterProject;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
		private List<WebElement> SuppCertProjectList;
		public List<WebElement> getSuppCertProjectList() {
			return	SuppCertProjectList;
		}
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement SuppPayCompDD;
		public WebElement getSuppPayCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppPayCompDD));
			return SuppPayCompDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
		private WebElement SuppCertSubProjectDD;
		public WebElement getSuppCertSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSubProjectDD));
			return SuppCertSubProjectDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
		private WebElement SuppCertEnterSubProject;
		public WebElement getSuppCertEnterSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterSubProject));
			return SuppCertEnterSubProject;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
		private List<WebElement> SuppCertSubProjectList;
		public List<WebElement> getSuppCertSubProjectList() {
			return	SuppCertSubProjectList;
		}
		
		@FindBy(id = "ddlSupplierList")
		private WebElement SuppCertSupplierDD;
		public WebElement getSuppCertSupplierDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSupplierDD));
			return SuppCertSupplierDD;
		}
		@FindBy(id = "ddlPoType")
		private WebElement SuppCertPOTypeDD;
		public WebElement getSuppCertPOTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOTypeDD));
			return SuppCertPOTypeDD;
		}
		@FindBy(css = "a#lbnSelectPO")
		private WebElement SuppCertSelecttPOLink;
		public WebElement getSuppCertSelecttPOLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelecttPOLink));
			return SuppCertSelecttPOLink;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//span//button")
		private WebElement SuppCertPODD;
		public WebElement getSuppCertPODD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPODD));
			return SuppCertPODD;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li//input[@placeholder='Search']")
		private WebElement SuppCertEnterPO;
		public WebElement getSuppCertEnterPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterPO));
			return SuppCertEnterPO;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li")
		private List<WebElement> SuppCertPOList;
		public List<WebElement> getSuppCertPOList() {
			return SuppCertPOList;
		}
		@FindBy(id = "btnSearch")
		private WebElement SuppCertSearchPO;
		public void getSuppCertSearchPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSearchPO));
			 SuppCertSearchPO.click();;
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input")
		private WebElement SuppCertSelcetPOcheck;
		public void getSuppCertSelcetPOcheck() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetPOcheck));
			 SuppCertSelcetPOcheck.click();;
		}
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement SuppCertPOAcceptSelected;
		public void getSuppCertPOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOAcceptSelected));
			 SuppCertPOAcceptSelected.click();;
		}
		@FindBy(css = "input#txtInvoiceNo")
		private WebElement SuppCertInvoiceNO;
		public WebElement getSuppCertInvoiceNO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceNO));
			return SuppCertInvoiceNO;
		}
		@FindBy(css = "select#ddlEInvoice")
		private WebElement SuppCertE_Invoice;
		public WebElement getSuppCertE_Invoice() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertE_Invoice));
			return SuppCertE_Invoice;
		}
		@FindBy(css = "input#txtInvoiceAmount")
		private WebElement SuppCertInvoiceAmt;
		public WebElement getSuppCertInvoiceAmt() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceAmt));
			return SuppCertInvoiceAmt;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[6]")
		private WebElement SuppCertGRNAMOUNT;
		public String getSuppCertGRNAMOUNT() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNAMOUNT));
			return SuppCertGRNAMOUNT.getText();
		}
		@FindBy(css =  "input#dtInvioceDate_txtDatePicker")
		private WebElement SuppCertInvoiceDate;
		public WebElement getSuppCertInvoiceDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceDate));
			return SuppCertInvoiceDate;
		}
		@FindBy(css = "select#ddlCertificateType")
		private WebElement SuppCertTypeDD;
		public WebElement getSuppCertTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertTypeDD));
			return SuppCertTypeDD;
		}
		
		@FindBy(xpath = "//a[text()='Select GRN']")
		private WebElement SuppCertSelcetGRNLink;
		public WebElement getSuppCertSelcetGRNLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNLink));
			return SuppCertSelcetGRNLink;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input[@type='checkbox']")
		private WebElement SuppCertSelcetGRNCheck;
		public void getSuppCertSelcetGRNCheck() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNCheck));
			 SuppCertSelcetGRNCheck.click();;
		}
		
		@FindBy(css =  "input#lnkNext_ShowMaterialSelection")
		private WebElement SuppCertAddGRN_NextButton;
		public void getSuppCertAddGRN_NextButton() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_NextButton));
			 SuppCertAddGRN_NextButton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']")
		private WebElement SuppCertGRNQty;
		public WebElement getSuppCertGRNQty() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNQty));
			return SuppCertGRNQty;
		}
		@FindBy(css =  "input#btnAcceptSelected")
		private WebElement SuppCertAddGRN_AcceptSelcet;
		public void getSuppCertAddGRN_AcceptSelcet() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_AcceptSelcet));
			 SuppCertAddGRN_AcceptSelcet.click();;
		}
		@FindBy(xpath = "//a[text()='Add Row ']")
		private WebElement SuppCertAddRowDed;
		public void getSuppCertAddRowDed() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddRowDed));
			 SuppCertAddRowDed.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select[@class='input']")
		private WebElement SuppCertDedTaxCat1;
		public WebElement getSuppCertDedTaxCat1() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat1));
			return SuppCertDedTaxCat1;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select[@class='input']")
		private WebElement SuppCertDedTaxCatPer1;
		public WebElement getSuppCertDedTaxCatPer1() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer1));
			return SuppCertDedTaxCatPer1;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select[@class='input']")
		private WebElement SuppCertDedTaxCat2;
		public WebElement getSuppCertDedTaxCat2() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat2));
			return SuppCertDedTaxCat2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select[@class='input']")
		private WebElement SuppCertDedTaxCatPer2;
		public WebElement getSuppCertDedTaxCatPer2() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer2));
			return SuppCertDedTaxCatPer2;
		}
		@FindBy(css = "input#txtOtherDeduction")
		private WebElement SuppCertOtherDed;
		public WebElement getSuppCertOtherDed() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDed));
			return SuppCertOtherDed;
		}
		@FindBy(id = "txtOthDedRemarks")
		private WebElement SuppCertOtherDedRemarksclick;
		public void getSuppCertOtherDedRemarksclick() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarksclick));
			 SuppCertOtherDedRemarksclick.click();;
		}
		@FindBy(id = "txtOthDedRemarks")
		private WebElement SuppCertOtherDedRemarks;
		public WebElement getSuppCertOtherDedRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarks));
			return SuppCertOtherDedRemarks;
		}
		@FindBy(css = "input#txtOtherAdditions")
		private WebElement SuppCertOtherAddTax;
		public WebElement getSuppCertOtherAddTax() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTax));
			return SuppCertOtherAddTax;
		}
		@FindBy(id = "txtOthAddRemarks")
		private WebElement SuppCertOtherAddTaxRemarksclick;
		public void getSuppCertOtherAddTaxRemarksclick() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarksclick));
			 SuppCertOtherAddTaxRemarksclick.click();;
		}
		@FindBy(id = "txtOthAddRemarks")
		private WebElement SuppCertOtherAddTaxRemarks;
		public WebElement getSuppCertOtherAddTaxRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarks));
			return SuppCertOtherAddTaxRemarks;
		}
		@FindBy(id = "txtRetentionPercentValue")
		private WebElement SuppCertRetentionPer;
		public WebElement getSuppCertRetentionPer() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertRetentionPer));
			return SuppCertRetentionPer;
		}
		
		@FindBy(id = "ddlPaymentMode")
		private WebElement SuppCertPayModeDD;
		public WebElement getSuppCertPayModeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayModeDD));
			return SuppCertPayModeDD;
		}
		@FindBy(css = "input#dtpDueDate_txtDatePicker")
		private WebElement SuppCertPayDueDate;
		public WebElement getSuppCertPayDueDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayDueDate));
			return SuppCertPayDueDate;
		}
		@FindBy(css = "textarea#txtRemarks")
		private WebElement SuppCertRemarks;
		public WebElement getSuppCertRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertRemarks));
			return SuppCertRemarks;
		}
		@FindBy(css = "input#btnSave")
		private WebElement SuppCertCreate;
		public void getSuppCertCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertCreate));
			 SuppCertCreate.click();
		}
		@FindBy(id = "lblCertificateNoValue")
		private WebElement suppcetNo;
		public String getsuppcetNo() {
			w2.until(ExpectedConditions.elementToBeClickable(suppcetNo));
			return suppcetNo.getText();
		}
		
		@FindBy(id = "btnModify")
		private WebElement SuppCertModify;
		public void getSuppCertModify() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertModify));
			SuppCertModify.click();
		}
		@FindBy(id = "btnUpdate")
		private WebElement SuppCertUpdate;
		public void getSuppCertUpdate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdate));
			SuppCertUpdate.click();
		}
		@FindBy(id = "lbnChangeStatus")
		private WebElement SuppCertChangeStatus;
		public void getSuppCertChangeStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatus));
			SuppCertChangeStatus.click();
		}
		@FindBy(css = "select#ddlStatus")
		private WebElement SuppCertChangeStatusDD;
		public WebElement getSuppCertChangeStatusDD(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatusDD));
			return SuppCertChangeStatusDD;
		}
		@FindBy(css = "a#lbnUpdateStatus")
		private WebElement SuppCertUpdateStatus;
		public void getSuppCertUpdateStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdateStatus));
			SuppCertUpdateStatus.click();
		}
		@FindBy(xpath="//a[text()='Purchase']")
		private static WebElement FinPurApprovals;
		public void getFinPurApprovals() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
			 FinPurApprovals.click();
		}
		@FindBy(xpath = "//a[text()='Supplier Cert.']")
		private static WebElement FinPurSuppCert;
		public void getFinPurSuppCertv() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCert));
			FinPurSuppCert.click();
		}
		@FindBy(css = "input#txtCertifyingCompPO")
		private static WebElement FinCertCompany;
		public WebElement getFinCertCompany() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
			return FinCertCompany;
		}
		
		@FindBy(css = "input#txtCertificateNo")
		private static WebElement FinCertNo;
		public WebElement getFinCertNo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertNo));
			return FinCertNo;
		}
		
		@FindBy(css = "input#btnFilterGO")
		private static WebElement FinPurSuppCertGo;
		public void getFinPurSuppCertGo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCertGo));
			FinPurSuppCertGo.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//a")
		private static WebElement FinCertNoclick;
		public void getFinCertNoclick() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertNoclick));
			FinCertNoclick.click();
		}
		
		@FindBy(css = "span#lblStatusValue")
		private static WebElement Supppaymentstatus;
		public String getSupppaymentstatus() {
			w2.until(ExpectedConditions.elementToBeClickable(Supppaymentstatus));
		return	Supppaymentstatus.getText();
		}
	
		public void MenuSubMenuIndent() {
			try {
				MainMenu mm = new MainMenu(iDriver);
				mm.clickEngineering();
				Thread.sleep(2000);
				Engineering en = new Engineering(iDriver);
				en.clickInventory();
				Thread.sleep(1000);
				xml = new Datatable();
				sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String IndentNo="";
		public void Indent() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			getindlink(); 
				try {
					Frames.rightFrame();
					getCreateIndBtn();
//	 				if WO taking from excel changes the column, accordingly update the number here
//					if(WO_Number_Data == 10) {
//						getAssetRadioBtn();
//					}
					appInd.singleDropDown(getIndentTypeDD(), sheet.getRow(1).getCell(0).getStringCellValue());
					Thread.sleep(2000);
					appInd.singleDropDown(getIndProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
					Thread.sleep(2000);
					appInd.singleDropDown(getIndSubProjectDD(), sheet.getRow(1).getCell(2).getStringCellValue());

					String parent = appInd.switchToChildWindow(getSelectWorkOrder());
					getEnterWorkOrder().sendKeys(sheet.getRow(1).getCell(9).getStringCellValue());
					getSearchWorkOrder();
					getSelectWorkOrderRadio();
					getWOAcceptSelected();
					appInd.switchToParentWindow(parent);

					Frames.rightFrame();
					getRemarks().sendKeys("working boss");
					getCreateBtn().click();
					
					IndentNo = getIndentNumber();
					IndentCreate = new Indent_Create(iDriver);
				
					WOSummary();
					//IndentCreate.BOQlevel(1);
					//IndentCreate.materialMaster(1);
					getchangestatus();
					Thread.sleep(1000);
					getStatusDD().sendKeys("Submitted");
					Thread.sleep(2000);
					getupdatestatus();
					Thread.sleep(2000);
					getchangestatus();
					Thread.sleep(1000);
					getStatusDD().sendKeys("Approved");
					Thread.sleep(2000);
					getupdatestatus();
					
					if (appInd.AlertPresent()) {
						Datatable.writeExcel("Indent", "Indent is Not Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
						System.out.println("Indent is Not Created");
					} else {
						Datatable.writeExcel(IndentNo, "Indent is Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
						System.out.println(IndentNo+"  Indent is Created");
					}
				} catch (Exception e) {
					Datatable.writeExcel("Indent", "Indent is not Created-Exception", PurpaymentflowOutput,Purchase.OutputCreatePath);
					System.out.println("Indent is Not Created Exception");
				}
			}
		
		
		public void WOSummary() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
				getWorkOrderSummaryBtn();
				String parent = appInd.switchToChildWindow(getIndentAddItemBtn());
				getWOSummaryRecord();
				getWOAcceptSelected();
				appInd.switchToParentWindow(parent);
				Frames.rightFrame();
				appInd.singleDropDown(getStoreDD(), sheet.getRow(1).getCell(5).getStringCellValue());
				getQuantity().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
		

				for (int j = 0; j < 4; j++) {

					try {
						getDownArrow();
					} catch (Exception e) {
					}
					if (DeliveryDateArrow.isDisplayed()) {
						break;
					}
				}
				appInd.seletDate(getDeliveryDateArrow(), appInd.CurrentDateIn_MMM_DD_YYYY());
				getQuantityArrow().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
				appInd.isAlertPresent();
				getAddBtn();
		
			}catch (Exception e) {
				System.out.println("Work Order ummary exception"+e);
			
			}
		}
		public void MenuSubMenuPO() {
			try {
//				MainMenu mm = new MainMenu(iDriver);
//				mm.clickEngineering();
//				Thread.sleep(2000);
//				Engineering en = new Engineering(iDriver);
//				en.clickInventory();
//				Thread.sleep(1000);
				xml = new Datatable();
				sheetPO = xml.excelData(sheetnamePO, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String PurchaseOrder_No="";
		public void PurchaseOrder()throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				try {
			Frames.SubMenuFrame();
			getPOlink();
			Frames.rightFrame();
			getCreatePObutton();
			getMaterialPO();
			getDomesticPO();
			getCompany().sendKeys(sheetPO.getRow(1).getCell(0).getStringCellValue());
			appInd.seletDate(getPOdate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			getsupplier().sendKeys(sheetPO.getRow(1).getCell(1).getStringCellValue());
			getPOrefNo().sendKeys("refNo"+appInd.RandomNumbers(5));
			getDocumentThrough().sendKeys("E-Mail");
			getAddMaterial_Indent();
			Frames.iFrame();
			Thread.sleep(3000);
			appInd.singleDropDown(getPOProjectDD(),(sheetPO.getRow(1).getCell(2).getStringCellValue()));
			Thread.sleep(3000);
			appInd.singleDropDown(getPOSubProjectDD(), (sheetPO.getRow(1).getCell(3).getStringCellValue()));
			Thread.sleep(3000);
			getIndent_No().sendKeys(IndentNo);
			//getWO_No().sendKeys(sheet.getRow(1).getCell(9).getStringCellValue());
			appInd.seletDate(getIndentFromdate(), Indentstartdate);
			appInd.seletDate(getToDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			getSearch();
			getcheckbox();
			Thread.sleep(3000);
			getAcceptSelected();
			Frames.rightFrame();
			getPO_Qty().clear();
			Thread.sleep(3000);
			getPO_Qty().sendKeys(sheetPO.getRow(1).getCell(6).getStringCellValue());
			Thread.sleep(3000);
			getcreatebutton();
			Thread.sleep(3000);
			String parent1 = appInd.switchToChildWindow(getAddRateTax());
			getRate().clear();
			appInd.isAlertPresent();
			getRate().sendKeys(sheetPO.getRow(1).getCell(7).getStringCellValue());
			getCalRate();
			Thread.sleep(3000);
			getCalRate();
			int chargecount=0;
			for(int j=0; j<=getCharges().size(); j++) {
				chargecount++;
				if(getCharges().get(j).getText().equals("OTHER CHARGES"))
				{
					chargecount = chargecount + 1;
					////table[@class='in4-table mt-5']//tr[4]//td[2]//input
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).clear();
					Thread.sleep(3000);
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).sendKeys(sheetPO.getRow(1).getCell(8).getStringCellValue());
					break;		
				}
			}
			
			getCalRate();
			getSaveRate();
			Thread.sleep(3000);
			appInd.switchToParentWindow(parent1);
			Frames.rightFrame();
			Thread.sleep(3000);
			getUpdateRate();
			String parent2 = appInd.switchToChildWindow(getSelectServLink());
			getSearchBy().sendKeys(sheetPO.getRow(1).getCell(9).getStringCellValue());
			getGobutton();
			getServiceProviderName();
			appInd.switchToParentWindow(parent2);
			Frames.rightFrame();
			Thread.sleep(3000);
			getServAdvance().clear();
			Thread.sleep(3000);
			getServAdvance().sendKeys(sheetPO.getRow(1).getCell(11).getStringCellValue());
			getServcheckbox();
			Thread.sleep(3000);
			getServcheckbox();
			try {
			Thread.sleep(3000);
			getSuppAdvance().clear();
			Thread.sleep(3000);
			getSuppAdvance().sendKeys(sheetPO.getRow(1).getCell(10).getStringCellValue());
			}catch(Exception e) {
				System.out.println("getSuppAdvance  "+e);
			}
			Thread.sleep(2000);
			getUpdateTermandConditions();
			Thread.sleep(3000);
			getPOchangestatus();
			Thread.sleep(2000);
			getPOstatusDD().sendKeys("Submitted");
			appInd.AlertPresent();
			Thread.sleep(2000);
			getPOUpdatestaus();
			Thread.sleep(1000);
			getPOchangestatus();
			Thread.sleep(2000);
			getPOstatusDD().sendKeys("Approved");
			Thread.sleep(1000);
			getApproverRemarks().sendKeys("PO CREATED and APPROVED THROUGH AUTOMATION");
			Thread.sleep(1000);
			getPOUpdatestaus();
			Thread.sleep(2000);
			Thread.sleep(1000);
			PurchaseOrder_No=getPOnumber();
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("PurchaseOrder", "is Not Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
				System.out.println("  Purchase Order is Not Created");
			}else{
				
				Datatable.writeExcel(PurchaseOrder_No, "PO is Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
				System.out.println(PurchaseOrder_No+"  Purchase Order is Created");
			}
				}catch (Exception e) {
					Datatable.writeExcel("Purchase Order", "is Not Created -Exception ", PurpaymentflowOutput,Purchase.OutputCreatePath);
					System.out.println("Not Created -Exception---"+e);
					System.out.println("  Purchase Order is Not Created Exception");
				}
		}
		public void MenuSubMenuGRN() {
			try {
//				MainMenu mm = new MainMenu(iDriver);
//				mm.clickEngineering();
//				Thread.sleep(2000);
//				Engineering en = new Engineering(iDriver);
//				en.clickInventory();
//				Thread.sleep(1000);
				xml = new Datatable();
				sheetGRN = xml.excelData(sheetnameGRN, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String GRN_No="";
		public void GRN() throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
			Frames.SubMenuFrame();
			getGRN_Link();
			Frames.rightFrame();
			getCreateGRN();
			appInd.singleDropDown(getGRNTypeDD(), sheetGRN.getRow(1).getCell(0).getStringCellValue());
			appInd.singleDropDown(getSupplierDD(), sheetGRN.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getCompanyDD(), sheetGRN.getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(2000);
			getGRNProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getGRNProjectDD(), getEnterGRNProject(), sheetGRN.getRow(1).getCell(3).getStringCellValue(), getListtOfGRNProject());
			Thread.sleep(1000);
			getGRNSubProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getGRNSubProjectDD(), getEnterGRNSubProject(), sheetGRN.getRow(1).getCell(4).getStringCellValue(), getListOfGRNSubProject());
			Thread.sleep(1000);
			String parent=appInd.switchToChildWindow(getSelectPO());
			Thread.sleep(2000);
			getPO_NoDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getPO_NoDD(), getEnterPO_No(), PurchaseOrder_No, getListofPO());
			Thread.sleep(1000);
			getSearchButton();
			Thread.sleep(2000);
			getPO_Radio();
			getAcceptSelected();
			appInd.switchToParentWindow(parent);
			Thread.sleep(1000);
			Frames.rightFrame();
			getChallan_No().sendKeys(appInd.RandomNumbers(5));
			appInd.seletDate(getChallan_Date(), appInd.CurrentDateIn_MMM_DD_YYYY());
			Thread.sleep(1000);
			appInd.seletDate(getGRN_Date(), appInd.CurrentDateIn_MMM_DD_YYYY());
			Thread.sleep(1000);
			getVehicle_No().sendKeys("KA 05 J 5296");
			Thread.sleep(1000);
			getGate_No().sendKeys(appInd.RandomNumbers(1));
			Thread.sleep(1000);
			getRemarks().sendKeys("GRN CREATED THROUGH AUTOMATION");
			Thread.sleep(1000);
			getReceived_Qty().sendKeys(sheetGRN.getRow(1).getCell(7).getStringCellValue());
			Thread.sleep(2000);
			getGRNCreateButton();
			Thread.sleep(5000);
			GRN_No=getGRN_Number();
			Thread.sleep(1000);
			getGRNchangestatus();
			Thread.sleep(3000);
			getGRNStatusDD().sendKeys("Submitted");
			Thread.sleep(3000);
			getGRNupdatestatus();
			Thread.sleep(3000);
			getGRNchangestatus();
			Thread.sleep(3000);
			getGRNStatusDD().sendKeys("Approved");
			Thread.sleep(5000);
			getGRNupdatestatus();
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("GRN", "Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("  GRN is Not Created");
			}else {
				Datatable.writeExcel(GRN_No, "GRN is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println(GRN_No + "  GRN IS CREATED ");
			}
			}catch (Exception e) {
				Datatable.writeExcel("GRN", "Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("  GRN is Not Created Exception");
			}
		}
		
	
	//Crating Supplier Advance
		public void MenuSubMenuAdvance()throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickPurchase();
				Thread.sleep(2000);
				Purchase en=new Purchase(iDriver);
				en.clickPayments();
				Thread.sleep(2000);
				xml = new Datatable();
				sheetAdv = xml.excelData(sheetnameAdv, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String Supplier_Advance_No;
		public void CreateSuppAdvanace() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			getSuppAdvlink();
			Frames.rightFrame();
			getCreateSuppAdvButton();
			appInd.singleDropDown(getAdvCompanyDD(), sheetAdv.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			getAdvprojectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getAdvprojectDD(), getAdvEnterProjDD(), sheetAdv.getRow(1).getCell(1).getStringCellValue(), getAdvListofProj());
			Thread.sleep(1000);
			getAdvSubprojectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getAdvSubprojectDD(), getAdvEnterSubProjDD(), sheetAdv.getRow(1).getCell(3).getStringCellValue(), getAdvListofSubProj());
			Thread.sleep(1000);
			String parentPOSelect=appInd.switchToChildWindow(SelectPOlink);
			getPO_NumDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getPO_NumDD(), getEnterAdvPO(), PurchaseOrder_No, getEnterAdvListOfPO());
			Thread.sleep(1000);
			getSearchAdvPO();
			getAdvPORadio();
			Thread.sleep(2000);
			getAdvPOAcceptSelected();
			appInd.switchToParentWindow(parentPOSelect);
			Frames.rightFrame();
			getAdvInvoiceNo().sendKeys("ADVIN"+appInd.RandomNumbers(4));
			getAdvInvoiceAmt().sendKeys(sheetAdv.getRow(1).getCell(5).getStringCellValue());;
			appInd.seletDate(getAdvInvoiceDate(), appInd.getDateAsSpecified(0));
			getAdvTaxImpact();
			getAdvPOQty().clear();
			appInd.isAlertPresent();
			Thread.sleep(2000);
			getAdvPOQty().sendKeys(sheetAdv.getRow(1).getCell(6).getStringCellValue());
			String parentRateTax=appInd.switchToChildWindow(Adv_AddRateTax);
			getAdv_Rate().clear();
			appInd.isAlertPresent();
			getAdv_Rate().sendKeys(sheetAdv.getRow(1).getCell(7).getStringCellValue());
			getAdvCalRate();
			getAdvSaveRate();
			appInd.switchToParentWindow(parentRateTax);
			Frames.rightFrame();
			appInd.singleDropDown(getAdvModeofPay(), sheetAdv.getRow(1).getCell(9).getStringCellValue());
			getAdvFavouring().sendKeys(sheetAdv.getRow(1).getCell(10).getStringCellValue());
			getAdvPayDueDate().sendKeys(appInd.getBackDatedDate(-30));
			getAdvRemarks().sendKeys("Supplier Advance Created Through Automation");
			getAdvDedTax();
			appInd.singleDropDown(getAdvDedTaxCategory(), sheetAdv.getRow(1).getCell(11).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getAdvDedTaxPer(), sheetAdv.getRow(1).getCell(12).getStringCellValue());
			Thread.sleep(2000);
			//getAdvDedTaxableAmt().sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
			getAdvDedTax2();
			appInd.singleDropDown(getAdvDedTaxCategory2(),sheetAdv.getRow(1).getCell(13).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getAdvDedTaxPer2(),sheetAdv.getRow(1).getCell(14).getStringCellValue());
			//getAdvDedTaxableAmt2().sendKeys(sheet.getRow(0).getCell(14).getStringCellValue());
			Thread.sleep(2000);
			getAdvCreate();
			Thread.sleep(2000);
			Supplier_Advance_No=getAdvnumber();
			if(appInd.AlertPresent())
			{
				Datatable.writeExcel("Supplier Advance", "is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				
			}else {
				Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is  Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("Supplier Advance Number(Created) ----------"+Supplier_Advance_No);
			}
		}catch (Exception e) {			Datatable.writeExcel("Supplier Advance", "is Not Created-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
			}
			getAdvChangestatus();
			getAdvStatusDD().sendKeys("Approved");
			getAdvUpdateStatus();
			getAdvChangestatus();
			getAdvStatusDD().sendKeys("Processed");
			appInd.seletDate(getAdvExpectedDate(), appInd.getDateAsSpecified(-30));
			Thread.sleep(2000);
			appInd.seletDate(getAdvprocessDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(2000);
			getAdvUpdateStatus();
			Thread.sleep(1000);
			AdvPayment(); //Supplier Payment Process From Finance Module
			}

		public void AdvPayment() throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickFinance();
				Thread.sleep(2000);
				Finance en=new Finance(iDriver);
				//en.clickFinApprovals();
				//Thread.sleep(2000);
				xml = new Datatable();
				sheetAdv = xml.excelData(sheetnameAdv, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
			Frames.SubMenuFrame();
			getFinPurApprovals();
			Frames.tabFrame();
			getFinPurAdv();
			try {
			Frames.innerFrame();
			WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
			searchcompny.sendKeys(sheetAdv.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			searchcompny.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			searchcompny.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		//	getFinPurAdvstatusDD().clear();
		
			getFinAdvNo().sendKeys(Supplier_Advance_No);
			Thread.sleep(2000);
			getFinAdvGo();
			Thread.sleep(100);
			getAdvNo();
			Frames.innerFrame();
			String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
			Thread.sleep(1000);
			appInd.singleDropDown(getBankAccountDD(),sheetAdv.getRow(1).getCell(15).getStringCellValue());
			Thread.sleep(1000);
			appInd.isAlertPresent();
			Thread.sleep(1000);
			getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
			Thread.sleep(1000);
			getPaymentSubmit();
			Thread.sleep(2000);
			appInd.switchToParentWindow(Parent_Payment);
			Frames.innerFrame();
			Thread.sleep(3000);
		//	String AdvancePaymentStatus=getpaymentstatus();
			if(getpaymentstatus().equals("Paid")) {
				Datatable.writeExcel(Supplier_Advance_No, "Advance is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
			}else {
				Datatable.writeExcel(Supplier_Advance_No, "Advance is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
			}
			}catch (Exception e) {
				Datatable.writeExcel(Supplier_Advance_No, "Advance is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("Advance is Not Paid-Exception---------"+e);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
		}
		}
		public void MenuSubMenuSupPayment()throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickPurchase();
				Thread.sleep(2000);
				Purchase en=new Purchase(iDriver);
				en.clickPayments();
				Thread.sleep(2000);
				xml = new Datatable();
				sheetPayment = xml.excelData(sheetnamePayment, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}

		String SupperCertNo;
		public void SupplierPaymentCreation() throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
				MenuSubMenuSupPayment();
			getSuppCertLink();
			Frames.rightFrame();
			getCreateSuppCertButton();
			appInd.singleDropDown(getSuppCertCompDD(), sheetPayment.getRow(1).getCell(0).getStringCellValue());
			SuppCertMultiproject();
		//	appInd.singleDropDown(getSuppPayCompDD(), sheet.getRow(i).getCell(2).getStringCellValue());
			SuppCertMultiSubproject();
			appInd.singleDropDown(getSuppCertSupplierDD(), sheetPayment.getRow(1).getCell(4).getStringCellValue());
			appInd.singleDropDown(getSuppCertPOTypeDD(), sheetPayment.getRow(1).getCell(5).getStringCellValue());
			String ParentSelectPO=appInd.switchToChildWindow(SuppCertSelecttPOLink);
			SuppCertMultiPO();
			Thread.sleep(2000);
			getSuppCertSearchPO();
			getSuppCertSelcetPOcheck();
			getSuppCertPOAcceptSelected();
			Thread.sleep(1000);
			appInd.switchToParentWindow(ParentSelectPO);
			Thread.sleep(3000);
			Frames.rightFrame();
			getSuppCertInvoiceNO().sendKeys("INNO"+appInd.RandomNumbers(4));
			appInd.singleDropDown(getSuppCertE_Invoice(),sheetPayment.getRow(1).getCell(7).getStringCellValue());
			appInd.seletDate(getSuppCertInvoiceDate(), appInd.getDateAsSpecified(0));
			appInd.singleDropDown(getSuppCertTypeDD(), sheetPayment.getRow(1).getCell(8).getStringCellValue());
			String ParentSelectGRN=appInd.switchToChildWindow(SuppCertSelcetGRNLink);
			getSuppCertSelcetGRNCheck();
			String GRNAMOUNT=getSuppCertGRNAMOUNT();
			getSuppCertAddGRN_NextButton();
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) iDriver;  
			try {
				jsExecutor.executeScript("document.getElementByXpath('//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']').value='0.1'");
			}catch(Exception e) {
				jsExecutor.executeScript("arguments[0].value='0.1'", getSuppCertGRNQty());  
			}
			Thread.sleep(2000);
			getSuppCertAddGRN_AcceptSelcet();
			appInd.isAlertPresent();		
			appInd.switchToParentWindow(ParentSelectGRN);
			Frames.rightFrame();
			getSuppCertInvoiceAmt().sendKeys("50000");
			Thread.sleep(2000);
			getSuppCertAddRowDed();
			Thread.sleep(2000);
			appInd.singleDropDown(getSuppCertDedTaxCat1(),sheetPayment.getRow(1).getCell(10).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getSuppCertDedTaxCatPer1(),sheetPayment.getRow(1).getCell(11).getStringCellValue());
			Thread.sleep(1000);
			getSuppCertAddRowDed();
			Thread.sleep(2000);
			appInd.singleDropDown(getSuppCertDedTaxCat2(),sheetPayment.getRow(1).getCell(12).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getSuppCertDedTaxCatPer2(),sheetPayment.getRow(1).getCell(13).getStringCellValue());
			getSuppCertOtherDed().sendKeys(sheetPayment.getRow(1).getCell(14).getStringCellValue());
			getSuppCertOtherDedRemarksclick();
			Thread.sleep(1000);
			getSuppCertOtherDedRemarks().sendKeys("Other Deductions for Delay");
			getSuppCertOtherAddTax().sendKeys(sheetPayment.getRow(1).getCell(15).getStringCellValue());
			getSuppCertOtherAddTaxRemarksclick();
			Thread.sleep(1000);
			getSuppCertOtherAddTaxRemarks().sendKeys("Other Addition Tax");
			getSuppCertRetentionPer().sendKeys(sheetPayment.getRow(1).getCell(16).getStringCellValue());
			appInd.singleDropDown(getSuppCertPayModeDD(),sheetPayment.getRow(1).getCell(17).getStringCellValue());
			appInd.seletDate(getSuppCertPayDueDate(), appInd.getDateAsSpecified(-30));
			getSuppCertRemarks().sendKeys("Supplier Certificate Created Through Automation");
			Thread.sleep(3000);
			getSuppCertCreate();
			Thread.sleep(3000);
		 SupperCertNo=getsuppcetNo();
			if (appInd.AlertPresent()) {
				Datatable.writeExcel("Supplier Certificate ",  "is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
			} else {
				
				Datatable.writeExcel("Certificate No. "+SupperCertNo,  "is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
			}
			}catch (Exception e) {
				Datatable.writeExcel("Supplier Certificate ",  "is Not Created-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
			}
			
			//Approved
			getSuppCertChangeStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatusDD().sendKeys("Approved");
			Thread.sleep(2000);
			getSuppCertUpdateStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatusDD().sendKeys("Processed");
			Thread.sleep(2000);
			getSuppCertUpdateStatus();
			Thread.sleep(3000);
			SupplierPayment(); //Supplier Payment Process From Finance Module
		}
			
			public void SupplierPayment() throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickFinance();
				Thread.sleep(2000);
				Finance en=new Finance(iDriver);
				//en.clickFinApprovals();
				//Thread.sleep(2000);
				xml = new Datatable();
				sheetPayment = xml.excelData(sheetnamePayment, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
			Frames.SubMenuFrame();
			getFinPurApprovals();
			Frames.tabFrame();
			getFinPurSuppCertv();
			try {
			Frames.innerFrame();
			WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
			searchcompny.sendKeys(sheetPayment.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			searchcompny.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			searchcompny.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		//	getFinPurAdvstatusDD().clear();
		
			getFinCertNo().sendKeys(SupperCertNo);
			Thread.sleep(1000);
			getFinPurSuppCertGo();
			Thread.sleep(100);
			getFinCertNoclick();
			Frames.innerFrame();
			String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
			Thread.sleep(1000);
			appInd.singleDropDown(getBankAccountDD(),sheetPayment.getRow(1).getCell(24).getStringCellValue());
			Thread.sleep(1000);
			appInd.isAlertPresent();
			Thread.sleep(1000);
			getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
			Thread.sleep(1000);
			getPaymentSubmit();
			Thread.sleep(2000);
			appInd.switchToParentWindow(Parent_Payment);
			Frames.innerFrame();
			Thread.sleep(3000);
		//	String AdvancePaymentStatus=getpaymentstatus();
			if(getSupppaymentstatus().equals("Paid")) {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
			}else {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
			}
			}catch (Exception e) {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
		}
		}
		
			
			

			public void multi() throws Throwable {
				JavascriptExecutor js = (JavascriptExecutor) oBrowser;
				try {
				js.executeScript("arguments[0].click();", getPO_NoDD());
				}catch(Exception e) {
					System.out.println(e);
				}
				w2.until(ExpectedConditions.elementToBeClickable(getEnterPO_No()));
				getEnterPO_No().sendKeys(PurchaseOrder_No);
				for (WebElement e : getListofPO()) {
					if (e.getText().contains("Select")) {
						Thread.sleep(2000);
						e.click();
						break;
					}
				}
				try {
				js.executeScript("arguments[0].click();", getPO_NoDD());
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			public void Multiproject() throws Throwable {
				JavascriptExecutor js = (JavascriptExecutor) oBrowser;
				try {
				js.executeScript("arguments[0].click();", getGRNProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
				w2.until(ExpectedConditions.elementToBeClickable(getEnterGRNProject()));
				getEnterGRNProject().sendKeys(sheetGRN.getRow(1).getCell(3).getStringCellValue());
				for (WebElement e : getListtOfGRNProject()) {
					if (e.getText().contains("Select")) {
						Thread.sleep(2000);
						e.click();
						break;
					}
				}
				try {
				js.executeScript("arguments[0].click();", getGRNProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			public void MultiSubProject() throws Throwable {
				JavascriptExecutor js = (JavascriptExecutor) oBrowser;
				try {
				js.executeScript("arguments[0].click();", getGRNSubProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
				w2.until(ExpectedConditions.elementToBeClickable(getEnterGRNSubProject()));
				getEnterGRNSubProject().sendKeys(sheetGRN.getRow(1).getCell(4).getStringCellValue());
				for (WebElement e : getListOfGRNSubProject()) {
					if (e.getText().contains("Select")) {
						Thread.sleep(2000);
						e.click();
						break;
					}
				}
				try {
				js.executeScript("arguments[0].click();", getGRNSubProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
			}	
		
		public void multiDDspecific(WebElement projectClick, WebElement entrProjectName, String projectname,List<WebElement> ListedRecordsDD) throws Throwable {

			JavascriptExecutor js = (JavascriptExecutor) oBrowser;
			try {
			js.executeScript("arguments[0].click();", projectClick);
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
			w2.until(ExpectedConditions.elementToBeClickable(entrProjectName));
			entrProjectName.sendKeys(projectname);
			for (WebElement e : ListedRecordsDD) {
				if (e.getText().contains("Select")) {
					Thread.sleep(2000);
					e.click();
					break;
				}
			}
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
			js.executeScript("arguments[0].click();", projectClick);
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
		}
		public void SuppCertMultiproject() throws Throwable {
			JavascriptExecutor js = (JavascriptExecutor) oBrowser;
			try {
			js.executeScript("arguments[0].click();", getSuppCertProjectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterProject()));
			getSuppCertEnterProject().sendKeys(sheetPayment.getRow(1).getCell(1).getStringCellValue());
			for (WebElement e : getSuppCertProjectList()) {
				if (e.getText().contains("Select")) {
					Thread.sleep(2000);
					e.click();
					break;
				}
			}
			try {
			js.executeScript("arguments[0].click();", getSuppCertEnterProject());
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				js.executeScript("arguments[0].click();", getSuppCertProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
				appInd.clickOutside();
		}
		public void SuppCertMultiSubproject() throws Throwable {
			JavascriptExecutor js = (JavascriptExecutor) oBrowser;
			try {
			js.executeScript("arguments[0].click();", getSuppCertSubProjectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterSubProject()));
			getSuppCertEnterSubProject().sendKeys(sheetPayment.getRow(1).getCell(3).getStringCellValue());
			for (WebElement e : getSuppCertSubProjectList()) {
				if (e.getText().contains("Select")) {
					Thread.sleep(2000);
					e.click();
					break;
				}
			}
			try {
			js.executeScript("arguments[0].click();", getSuppCertEnterSubProject());
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				js.executeScript("arguments[0].click();", getSuppCertSubProjectDD());
				}catch(Exception e) {
					System.out.println(e);
				}
				appInd.clickOutside();
		}
		public void SuppCertMultiPO() throws Throwable {
			JavascriptExecutor js = (JavascriptExecutor) oBrowser;
			try {
			js.executeScript("arguments[0].click();", getSuppCertPODD());
			}catch(Exception e) {
				System.out.println(e);
			}
			w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterPO()));
			getSuppCertEnterPO().sendKeys(sheetPayment.getRow(1).getCell(6).getStringCellValue());
			for (WebElement e : getSuppCertPOList()) {
				if (e.getText().contains("Select")) {
					Thread.sleep(2000);
					e.click();
					break;
				}
			}
			try {
			js.executeScript("arguments[0].click();", getSuppCertEnterPO());
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				js.executeScript("arguments[0].click();", getSuppCertPODD());
				}catch(Exception e) {
					System.out.println(e);
				}
				appInd.clickOutside();
		}
		
		

}
