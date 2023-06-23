package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Engineering.Createpages.ObjectRepository.Indent_Create;
import com.RE.Purchase.Create.Test.Pur_Transaction_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_Transaction_Create extends Pur_Transaction_Create_Test{
	public static XSSFSheet sheet;
	public static XSSFSheet sheetPO;
	public static XSSFSheet sheetGRN;
	public static XSSFSheet sheetBOQ;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String PurTransactionOutput="Pur_Transaction_Create";
	public static Indent_Create IndentCreate;
	public static String sheetname = "Indent_Create";
	public static String sheetnamePO = "PO_Create";
	public static String sheetnameGRN = "GRN_Create";
	public static String sheetnameBOQ = "BOQ_Create";
	public static String Indentstartdate="May 01, 2023";
	
	public Pur_Transaction_Create(WebDriver oDriver) {
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
// 				if WO taking from excel changes the column, accordingly update the number here
//				if(WO_Number_Data == 10) {
//					getAssetRadioBtn();
//				}
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
					Datatable.writeExcel("Indent", "Indent is Not Created", PurTransactionOutput,Purchase.OutputCreatePath);
					System.out.println("Indent is Not Created");
				} else {
					Datatable.writeExcel(IndentNo, "Indent is Created", PurTransactionOutput,Purchase.OutputCreatePath);
					System.out.println(IndentNo+"  Indent is Created");
				}
			} catch (Exception e) {
				Datatable.writeExcel("Indent", "Indent is not Created-Exception", PurTransactionOutput,Purchase.OutputCreatePath);
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
//			MainMenu mm = new MainMenu(iDriver);
//			mm.clickEngineering();
//			Thread.sleep(2000);
//			Engineering en = new Engineering(iDriver);
//			en.clickInventory();
//			Thread.sleep(1000);
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
			Datatable.writeExcel("PurchaseOrder", "is Not Created", PurTransactionOutput,Purchase.OutputCreatePath);
			System.out.println("  Purchase Order is Not Created");
		}else{
			
			Datatable.writeExcel(PurchaseOrder_No, "PO is Created", PurTransactionOutput,Purchase.OutputCreatePath);
			System.out.println(PurchaseOrder_No+"  Purchase Order is Created");
		}
			}catch (Exception e) {
				Datatable.writeExcel("Purchase Order", "is Not Created -Exception ", PurTransactionOutput,Purchase.OutputCreatePath);
				System.out.println("Not Created -Exception---"+e);
				System.out.println("  Purchase Order is Not Created Exception");
			}
	}
	public void MenuSubMenuGRN() {
		try {
//			MainMenu mm = new MainMenu(iDriver);
//			mm.clickEngineering();
//			Thread.sleep(2000);
//			Engineering en = new Engineering(iDriver);
//			en.clickInventory();
//			Thread.sleep(1000);
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
			Datatable.writeExcel("GRN", "Not Created", PurTransactionOutput, Purchase.OutputCreatePath);
			System.out.println("  GRN is Not Created");
		}else {
			Datatable.writeExcel(GRN_No, "GRN is Created", PurTransactionOutput, Purchase.OutputCreatePath);
			System.out.println(GRN_No + "  GRN IS CREATED ");
		}
		}catch (Exception e) {
			Datatable.writeExcel("GRN", "Not Created Exception", PurTransactionOutput, Purchase.OutputCreatePath);
			System.out.println("  GRN is Not Created Exception");
		}
	}
	
}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
