package com.RE.Engineering.Createpages.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.BOQ_Create_Test;
import com.RE.Engineering.Createpages.Test.Engg_BOQ_WO_Abstract_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Engg_BOQ_WO_Abstract_Create extends Engg_BOQ_WO_Abstract_Create_Test {
	public static WebDriver iDriver;
	public static Datatable xml;
	public static XSSFSheet sheetBOQ;
	public static XSSFSheet sheetWO;
	public static XSSFSheet sheetAbstract;
	public static String sheetnameBOQ="BOQ_Create";
	public static String sheetnameWO="Workorder_Create";
	public static String sheetnameAbstract ="Abstract_Create";
	public static String EnggTransactionOutput="Engg_BOQ_WO_Abstract_Create";
	
	
	
	
	
	
	
//--------------------------------------- BOQ page elements------------------------------//
	@FindBy(xpath = "//a[text()='BOQ']")
	private WebElement BOQlink;
	public void getBOQlink() {
		BOQlink.click();
	}
	@FindBy(id = "cmdCreateBOQ")
	private WebElement Createboqbutton;
	public void getCreateboqbutton() {
		w2.until(ExpectedConditions.visibilityOf(Createboqbutton));
		Createboqbutton.click();
	}
	@FindBy(name = "ddlProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(id = "ddlSubProject")
	private WebElement subproject;
	public WebElement getsubproject() {
		return subproject;
	}
	@FindBy(xpath = "//select[@id='ddlWorkCategory']")
	private WebElement WorkCat;
	public WebElement getWorkCat() {
		return WorkCat;
	}
	@FindBy(css = "select#ddlWorkSubCategory")
	private WebElement WorkSubCat;
	public WebElement getWorkSubCat() {
		return WorkSubCat;
	}
	@FindBy(css = "input#txtBOQItemName")
	private WebElement BOQName;
	public WebElement getBOQName() {
		return BOQName;
	}
	@FindBy(css = "textarea#txtBOQDescription")
	private WebElement BOQDesc;
	public WebElement getBOQDesc() {
		return BOQDesc;
	}
	@FindBy(id = "ddlUOM")
	private WebElement UOM;
	public WebElement getUOM() {
		return UOM;
	}
	@FindBy(xpath = "//input[@name='txtBOQQuantityCost']")
	private WebElement QtyCost;
	public WebElement getQtyCost() {
		return QtyCost;
	}
	@FindBy(xpath = "//input[@name='txtBOQRateCost']")
	private WebElement Rate;
	public WebElement getRate() {
		return Rate;
	}
	@FindBy(xpath = "//textarea[@name='txtBOQNotes']")
	private WebElement Note;
	public WebElement getNote() {
		return Note;
	}
	@FindBy(xpath = "//tr[1]//td[@class='vertical-middle in4-tabletitle']//input[@name='imbMaterial']")
	private WebElement MaterialDiv;
	public void getMaterialDiv() {
		MaterialDiv.click();
	}
	@FindBy(name = "imbAssets")
	private WebElement AssetDiv;
	public WebElement getAssetDiv() {
		return AssetDiv;
	}
	

	@FindBy(id = "lbnAddMaterialNew")
	private WebElement AddMaterial;
	public WebElement getAddMaterial() {
		w2.until(ExpectedConditions.elementToBeClickable(AddMaterial));
		return AddMaterial;
	}
	@FindBy(id = "lbnAddAssetNew")
	private WebElement AddAssetLink;
	public void getAddAssetLink() {
		 AddAssetLink.click();;
	}
	@FindBy(xpath = "//select[@name='ddlMaterialType']")
	private WebElement MaterilTypeDD;
	public WebElement getMaterilTypeDD() {
		return MaterilTypeDD;
	}
	@FindBy(xpath = "//select[@id='ddlMaterialSubtype']")
	private WebElement MaterilSubTypeDD;
	public WebElement getMaterilSubTypeDD() {
		return MaterilSubTypeDD;
	}
	@FindBy(xpath = "//select[@id='ddlMaterial']")
	private WebElement MaterilDD;
	public WebElement getMaterilDD() {
		return MaterilDD;
	}
	@FindBy(xpath = "//input[@id='btnSearch']")
	private WebElement Search;
	public void getSearch() {
		 Search.click();;
	}
	@FindBy(xpath = "//table[@class='in4-table1 mt-5']//tr[2]//input[@type='checkbox']")
	private WebElement SelectCheckbox;
	public void getSelectCheckbox() {
		SelectCheckbox.click();;
	}
	@FindBy(xpath = "//a[text()='Accept Selected']")
	private WebElement AcceptSelcted;
	public void getAcceptSelcted() {
		AcceptSelcted.click();;
	}
	
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//select[@class='input']")
	private WebElement MaterialUOM;
	public WebElement getMaterialUOM() {
		return MaterialUOM;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[5]//select[@class='input']")
	private WebElement MaterialUOM2;
	public WebElement getMaterialUOM2() {
		return MaterialUOM2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[@class='nopadding info']//tr[1]//td[1]//input[@class='input']")
	private WebElement COEfactor;
	public WebElement getCOEfactor() {
		return COEfactor;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[@class='nopadding info']//tr[1]//td[1]//input[@class='input']")
	private WebElement COEfactor2;
	public WebElement getCOEfactor2() {
		return COEfactor2;
	}
	
	@FindBy(name = "btnCreate")
	private WebElement CreateButton;
	public void getCreateButton() {
		CreateButton.click();;
	}
	
	@FindBy(name = "btnModify")
	private WebElement ModifyButton;
	public void getModifyButton() {
		ModifyButton.click();;
	}
	
	@FindBy(css = "input#btnUpdate")
	private WebElement updateButton;
	public void getupdateButton() {
		updateButton.click();;
	}
	@FindBy(name = "btnBack")
	private WebElement backButton;
	public void getbackButton() {
		backButton.click();;
	}
	@FindBy(xpath = "//a[text()='Change Status ']")
	private WebElement changestatus;
	public void getchangestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(changestatus));
		changestatus.click();
	}
	@FindBy(css = "select#ddlStatus")
	private WebElement BOQStatusDD;
	public WebElement getBOQStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(BOQStatusDD));
		return BOQStatusDD;
	}
	
	@FindBy(xpath = "//a[text()='Update Status']")
	private WebElement Updatestatus;
	public void getUpdatestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(Updatestatus));
		Updatestatus.click();
	}
	@FindBy(css = "span#lblStatusValue")
	private WebElement currentstatus;
	public String getcurrentstatus() {
		return currentstatus.getText();
	}
	
	@FindBy(css = "span#lblBOQIdValue")
	private WebElement BOQID;
	public WebElement getBOQID() {
		w2.until(ExpectedConditions.visibilityOf(BOQID));
		return BOQID;
	}	
	
	//--------------------------------------- work order page elements------------------------------//
	//projects link
		@FindBy(xpath="//a[text()='Projects']")
		public WebElement projectLink;
		public void projectLinkClick() {
			w2.until(ExpectedConditions.visibilityOf(projectLink));
			projectLink.click();
		}	
		//subproject text field
		@FindBy(id="txtSubProject")
		public WebElement subProjectField;
		public WebElement getSubprojectField() {
			return subProjectField;
		}	
		//Clicking on subproject hyperlink
		@FindBy(xpath="(//table[@class='in4-table']//a)[2]")
		public WebElement subprojectHL;
		public void subprojectHLClick() {
			 w2.until(ExpectedConditions.visibilityOf(subprojectHL));
			 subprojectHL.click();
		}	
		//go button
		@FindBy(css="input#btnGo")
		public WebElement goBtnWO;
		public void goBtnClickWO() {
			goBtnWO.click();
		}
		//workorder tab
		@FindBy(xpath="//td[text()='Work Order']")
		public WebElement workordertab;
		public void workorderTabClick() {
			w2.until(ExpectedConditions.visibilityOf(workordertab));
			workordertab.click();
		}
		
		//------ workorder list page elements----- //
		//create button
		@FindBy(id="btnCreateDotNet")
		public WebElement createWOBtn;
		public void creatWOBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(createWOBtn));
			createWOBtn.click();
		}
		//go button
		@FindBy(css="input#btnFilterGO")
		public WebElement goBtnList;
		public void goBtnListClick() {
			w2.until(ExpectedConditions.visibilityOf(goBtnList));
			goBtnList.click();
		}
		//workorder number field
		@FindBy(css="input#txtFilterWorkOrder")
		public WebElement WOnoFieldinWOCreate;
		public WebElement getWONoFieldinWOcreate() {
			w2.until(ExpectedConditions.visibilityOf(WOnoFieldinWOCreate));
			return WOnoFieldinWOCreate;
		}
		//work order number hyperlink after searching
		@FindBy(xpath="(//table[@class='in4-table']//td//a)[1]")
		public WebElement WOnoHL;
		public void WOnoHLClick() {
			w2.until(ExpectedConditions.visibilityOf(WOnoHL));
			WOnoHL.click();
		}
		
		//-----work order create page elements-----//
		
		//WO currency type DD
		@FindBy(id="ddlWOCurrencyType")
		public WebElement WOcurrencyDD;
		public WebElement getWOcurrencyDD() {
			return WOcurrencyDD;
		}
		//WO scope DD
		@FindBy(id="ddlWorkorderscope")
		public WebElement WOscopeyDD;
		public WebElement getWOscopeDD() {
			return WOscopeyDD;
		}
		//WO type DD
		@FindBy(css="select#ddlWorkorderType")
		public WebElement WOtypeDD;
		public WebElement getWOtypeDD() {
			return WOtypeDD;
		}
		//work category DD
		@FindBy(css="select#ddlCategoryist")
		public WebElement workCatDDWO;
		public WebElement getWorkCatDDWO() {
			return workCatDDWO;
		}
		//work subcategory DD
		@FindBy(id="ddlSubCategoryList")
		public WebElement workSubCatDDWO;
		public WebElement getWorkSubCatDDWO() {
			return workSubCatDDWO;
		}
		//contractor select link
		@FindBy(xpath="//div[@id='updtPnlContractor']//a//b")
		public WebElement selectContHL;
		public WebElement selectContHL() {
			return selectContHL;
		}
		//work order payment from
		@FindBy(id="ddlCtWOPaymentFrom")
		public WebElement WOPayFrom;
		public WebElement WOPayFromDD() {
			return WOPayFrom;
		}
		
				
			//contractor select popup		
			@FindBy(css="input#btnFilterGO")
			public WebElement contrPopGoBtn;
			public WebElement getContrPopGoBtn() {
			return contrPopGoBtn;
			}		
			// contractor name selection	
			@FindBy(xpath="//table[@id='gvFirmList']//a[1]")
			public WebElement contractorHL;
			public void contractorHLClick() {
			 contractorHL.click();
			}
			
		
		
		//scope of work text area
		@FindBy(css="textarea#txtCtScopeOfWork")
		public WebElement scopeofWorkTxtArea;
		public WebElement getScopeofWorkTxtArea() {
			return scopeofWorkTxtArea;
		}
		//work description text area
		@FindBy(css="textarea#txtCtWorkDescription")
		public WebElement workDescTxtArea;
		public WebElement getWorkDescTxtArea() {
			return workDescTxtArea;
		}
		//From date picker
		@FindBy(id="dtpCtFromDt_txtDate")
		public WebElement fromDatePicker;
		public WebElement getFromDatePicker() {
			return fromDatePicker;
		}
		//To date picker
		@FindBy(id="dtpCtToDt_txtDate")
		public WebElement toDatePicker;
		public WebElement getToDatePicker() {
			return toDatePicker;
		}
					
		//----Tax addition Grid----///
		@FindBy(css="a#lnkAddNewTaxAddition")
		public WebElement addNewTaxAdd;
		public void addNewTaxAddLinkClick() {
			addNewTaxAdd.click();
		}
		//Tax category dropdown1
		@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[2]//select")
		public WebElement taxCategoryDD;
		public WebElement getTaxCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[2]//select//option[2]")));
			return taxCategoryDD;
		}
		//Tax dropdown2
		@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[3]//select")
		public WebElement taxDD;
		public WebElement getTaxDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[3]//select/option[2]")));
			return taxDD;
		}
		//Tax Type dropdown3
		@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[5]//select")
		public WebElement taxTypeDD;
		public WebElement getTaxTypeDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[5]//select//option[2]")));
			return taxTypeDD;
		}
		//% work order value field
		@FindBy(xpath="(//table[@class='in4-table']//tr[2]//td[6]//input)[1]")
		public WebElement percentofWOvalue;
		public WebElement getPercentOfWOValueField() {
			return percentofWOvalue;
		}
		
		//contact person
		@FindBy(css="input#txtCtContactPerson")
		public WebElement contactPersonField;
		public WebElement getContactPersonField() {
			return contactPersonField;
		}
		
		//remarks terms and conditions text area
		@FindBy(css="textarea#txtCtTermsAndConditions")
		public WebElement remarksTermAndCondTxtArea;
		public WebElement getRemarksTermAndCondTxtArea() {
			return remarksTermAndCondTxtArea;
		}
		
		//Mobilization Guarantee Expiry Date picker --- locator only work in create page
		@FindBy(css="input#dtpCtMobilGaurantExpDt_txtDate")  
		public WebElement mobGuaExpDatePicker;
		public WebElement getMobGuaExpDatePicker() {
			return mobGuaExpDatePicker;
		}
		
		//Performance Guarantee Expiry Date picker --- locator only work in create page
		@FindBy(css="input#dtpCtPerformanceGaurantExpDt_txtDate")
		public WebElement perGuaExpDatePicker;
		public WebElement getPerGuaExpDatePicker() {
			return perGuaExpDatePicker;
		}
		
		
	//Tax deduction grid elements
		@FindBy(css="a#lnkAddNewTaxDeduction")
		public WebElement addNewDedTax;
		public void getAddNewDedTaxClick() {
			addNewDedTax.click();
		}
		
		//Tax category dropdown1
		@FindBy(xpath="//table[@id='grvTaxDeductionDetail']//td[2]//select")
		public WebElement dedTaxCategoryDD;
		public WebElement getDedTaxCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='grvTaxDeductionDetail']//td[2]//select//option[2]")));
			return dedTaxCategoryDD;
		}
		//Tax dropdown2
		@FindBy(xpath="//table[@id='grvTaxDeductionDetail']//td[3]//select")
		public WebElement dedTaxDD;
		public WebElement getDedTaxDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='grvTaxDeductionDetail']//td[3]//select/option[2]")));
			return dedTaxDD;
		}
		
		//create button
		@FindBy(id="btnCtCreate")
		public WebElement createBtninWOCreate;
		public void createBtnClickinWOCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(createBtninWOCreate));
			createBtninWOCreate.click();
		}
				
		
	//---- Work order View page Elements-----//
		
		//view page title
		@FindBy(id="lblCreatePageTitle")
		public WebElement viewPageTitle;
		public WebElement getViewPageTitle() {
			return viewPageTitle;
		}
		
		//work order no field element to get work order number
		@FindBy(id="lblvwWONo")
		public WebElement WOnumber;
		public String getWOnumber() {
			return WOnumber.getText();
		}
		
		//workorder tab link
		@FindBy(id="lnkWorkOrderDetail")
		public WebElement WOtablink;
		public void WOTabLinkClick() {
			WOtablink.click();
		}
		
		//BOQ tab link
		@FindBy(id="lnkWorkOrderBOQs")
		public WebElement BOQTablink;
		public void BOQTablinkClick() {
			BOQTablink.click();
		}
		//Add boq link
		@FindBy(id="lnkAddNewBOQs")
		public WebElement addBOQlink;
		public WebElement getaddBOQLink() {
			return addBOQlink;
		}
		//Modify button
		@FindBy(id="btnvwModify")
		public WebElement modifyBtninWOView;
		public void modifyBtninWOViewClick() {
			modifyBtninWOView.click();
		}
		
		//status field element
		@FindBy(id="lblvwStatus")
		public WebElement getStatus;
		public String getCurrentStatus() {
			return getStatus.getText();
		}
		
		//Change status link	
		@FindBy(css="a#lnkChangeStatus")
		public WebElement changeStatusLink;
		public void changeStatusLinkClick() {
			changeStatusLink.click();
		}
		
		//change status dropdown
		@FindBy(css="select#ddlUpdateStatusList")
		public WebElement changeStatusDDinWO;
		public WebElement getChangeStatusDDinWO() {
			w2.until(ExpectedConditions.visibilityOf(changeStatusDDinWO));
			return changeStatusDDinWO;
		}
		
		//update status link
		@FindBy(css="a#lnkUpdateStatus")
		public WebElement updateStatusLink;
		public void updateStatusLinkClick() {
			w2.until(ExpectedConditions.visibilityOf(updateStatusLink));
			updateStatusLink.click();
		}
		
		//Status change Remarks text area
		@FindBy(css="textarea#txtStatusRemarks")
		public WebElement remarksTxtAreaforWOStatus;
		public WebElement getRemarksTxtAreaforWOStatus() {
			w2.until(ExpectedConditions.visibilityOf(remarksTxtAreaforWOStatus));
			return remarksTxtAreaforWOStatus;
		}
				
	//--- Add BOQ popup window -----//
		//BOQ ID field
		@FindBy(id="txtFilterBoqId")
		public WebElement BOQIdfield;
		public WebElement getBOQIdfield() {
			w2.until(ExpectedConditions.visibilityOf(BOQIdfield));
			return BOQIdfield;
		}
		//Go button in add boq popup
		@FindBy(css="input#btnFilterGO")
		public WebElement goBtnAddBOQ;
		public void goBtnAddBOQClick() {		
			goBtnAddBOQ.click();
		}
		//check all -checkbox
		@FindBy(xpath="//table[@id='tblWorkOrderBoqItems']//th//input")
		public WebElement selectAllCheckBox;
		public void selectAllCheckBoxClick() {
			w2.until(ExpectedConditions.visibilityOf(selectAllCheckBox));
			selectAllCheckBox.click();
		}
		// Quantity field
		@FindBy(xpath="(//tr[@class='rowBOQ']//tr//td[5]//input)[1]")
		public WebElement qtyField;
		public WebElement getQtyField() {
			return qtyField;
		}
		//Rate Field
		@FindBy(xpath="(//tr[@class='rowBOQ']//tr//td[6]//input)[1]")
		public WebElement rateField;
		public WebElement getRateField() {
			return rateField;
		}
		//add button
		@FindBy(id="btnAddBoqs")
		public WebElement addBtn;
		public void addBtnClick() {
			addBtn.click();
		}
		
		
		
//--------------------------------------- Abstract page elements------------------------------//		

		//------Abstract List page Elements----//
		
		//Abstract submenu link
		@FindBy(xpath="//a[text()='Abstracts']")
		public WebElement abstractLink;
		public void abstractLinkClick() {
			w2.until(ExpectedConditions.visibilityOf(abstractLink));
			abstractLink.click();
		}
		
		//Project dropdown
		@FindBy(css="select#ddlProjectList")
		public WebElement projectDDinAbstract;
		public WebElement getProjectDDinAbstract() {
			w2.until(ExpectedConditions.visibilityOf(projectDDinAbstract));
			return projectDDinAbstract;
		}
		
		//Subproject dropdown
		@FindBy(css="select#ddlSubProjectList")
		public WebElement subprojectDD;
		public WebElement getSubProjectDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProjectList']//option[2]")));
			return subprojectDD;
		}
		
		//create abstract button
		@FindBy(css="input#btnCreate")
		public WebElement createAbstBtn;
		public void createAbstBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(createAbstBtn));
			createAbstBtn.click();
		}	
		
		//Go button
		@FindBy(css="input#btnFilterGO")
		public WebElement goBtninAbstractList;
		public void goBtninAbstractListClick() {
			goBtninAbstractList.click();
		}
		
		
	//----- Create page elements -----//
		
		//work category dropdown
		@FindBy(id="ddlWorkCategoryList")
		public WebElement workCatDD;
		public WebElement getWorkCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkCategoryList']//option[2]")));
			return workCatDD;
		}
			
		//work subcategory dropdown
		@FindBy(id="ddlWorkSubCategoryList")
		public WebElement workSubCatDD;
		public WebElement getWorkSubCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkSubCategoryList']//option[2]")));
			return workSubCatDD;
		}
			
		//workorder dropdown
		@FindBy(css="select#ddlWorkOrderList")
		public WebElement workorderDD;
		public WebElement getWorkorderDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkOrderList']//option[2]")));
			return workorderDD;
		}
			
		//Reference/Bill number field
		@FindBy(css="input#txtRefBillNo")
		public WebElement billNo;
		public WebElement getBillNo() {
			return billNo;
		}	
			
		//work order value label
		@FindBy(css="span#lblWOValue")
		public WebElement woValueLabel;
		public WebElement getWOValueLabel() {
			w2.until(ExpectedConditions.visibilityOf(woValueLabel));
			return woValueLabel;
		}
		
		//Abstract date picker
		@FindBy(css="input#dtPicAbstractDate_txtDate")
		public WebElement abstractDatePicker;
		public WebElement getAbstractDatePicker() {
			 return abstractDatePicker;
		}
		
			//BOQ Filters elements
		//work category dropdown
		@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
		public WebElement boqWorkCatDD;
		public WebElement getBOQWorkCatDD() {
			return boqWorkCatDD;
		}
		
		//work subcategory dropdown
		@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[2]")
		public WebElement boqSubWorkCatDD;
		public WebElement getBOQSubWorkCatDD() {
			return boqSubWorkCatDD;
		}
		
		//search textbox in work category dropdown
		@FindBy(xpath="//input[@class='form-control multiselect-search']")
		public WebElement searchTxtWorkCatDD;
		public WebElement getSearchTxtWorkCatDD() {
			return searchTxtWorkCatDD;
		}
		
		
		
		//Go button
		@FindBy(css="input#btnGo")
		public WebElement createGoBtn;
		public void createGoBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(createGoBtn));
			createGoBtn.click();
		}
		
		//subproject checkbox
		@FindBy(xpath="(//table[@class='in4-table-boq']//td//input)[1]")
		public WebElement subProjChkBox;
		public WebElement getSubProjChkBox() {
			w2.until(ExpectedConditions.visibilityOf(subProjChkBox));
			return subProjChkBox;
		}
		
		//next button
		@FindBy(css="input#btnNext")
		public WebElement nextBtn;
		public void nextBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(nextBtn));
			nextBtn.click();
		}
		
		//save and continue button
		@FindBy(css="input#btnSaveAndContinue")
		public WebElement savecontBtn;
		public void savecontBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(savecontBtn));
			savecontBtn.click();
		}
		
		//This bill item qty field
		@FindBy(xpath="(//tr[@class='rowSubBOQ']//td[9]//input[contains(@id,'ThisBillItemQty')])[1]")
		public WebElement billItemQtyField;
		public WebElement getBillItemQtyField() {
			w2.until(ExpectedConditions.visibilityOf(billItemQtyField));
			return billItemQtyField;
		}
		
		//Finish button
		@FindBy(css="input#Button2")
		public WebElement finishBtn;
		public void finishBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(finishBtn));
			finishBtn.click();
		}
		
		//To get Abstract display number
		@FindBy(css="span#lblAbstractDisplayNo")
		public WebElement abstDispNo;
		public String getAbstDispNo() {
			w2.until(ExpectedConditions.visibilityOf(abstDispNo));
			return abstDispNo.getText();
		}
			
		//close button
		@FindBy(css="input#btnClose")
		public WebElement closeBtn;
		public void closeBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(closeBtn));
			closeBtn.click();
		}
		
		//work start date picker
		@FindBy(id="gvAbstratItems_ctl06_dtWorkStartDt_txtDatee")
		public WebElement fromdate;
		public WebElement getFromDate() {
			w2.until(ExpectedConditions.visibilityOf(fromdate));
			return fromdate;
		}
		

		

	//---view page elements---//
		//Items button
		@FindBy(css="input#btnItems")
		public WebElement itemsBtn;
		public void itemsBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(itemsBtn));
			itemsBtn.click();
		}
		
		//modify item button
		@FindBy(id="Button3")
		public WebElement modifyItemBtn;
		public void modifyItemBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(modifyItemBtn));
			modifyItemBtn.click();
		}

	//---Edit page elements ---//
		//status dropdown
		@FindBy(id="ddlStatusList")
		public WebElement statusDDinAbstract;
		public WebElement getStatusDDinAbstract() {
			w2.until(ExpectedConditions.visibilityOf(statusDDinAbstract));
			return statusDDinAbstract;
		}
		
		//status remarks text area
		@FindBy(id="txtItemApproverRemarks")
		public WebElement statusRemarksTxtArea;
		public WebElement getStatusRemarksTxtArea() {
			return statusRemarksTxtArea;
		}
		
		//status update text element
		@FindBy(id="lblSaveStatus")
		public WebElement statusUpdateTxt;
		public WebElement getStatusUpdateTxt() {
			return statusUpdateTxt;
		}		
		
		
	public Engg_BOQ_WO_Abstract_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
		
	public void MenuSubMenuBOQ() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			en.clickMasters();
			Thread.sleep(1000);
			xml = new Datatable();
			sheetBOQ = xml.excelData(sheetnameBOQ, Engineering.inputCreatePath);
				} catch (Exception e) {
						e.printStackTrace();
							System.out.println("Module, Sub module click case Failed: " + e);
								}
	}
	
	String RandomNum;
	String boqname;
	String BOQId;
	
	public void BOQCreate() throws Throwable {		
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
	 	try{
	Frames.SubMenuFrame();
	getBOQlink();
	Frames.rightFrame();
	getCreateboqbutton();
	appInd.singleDropDown(getproject(), sheetBOQ.getRow(1).getCell(0).getStringCellValue());
	appInd.singleDropDown(getsubproject(), sheetBOQ.getRow(1).getCell(1).getStringCellValue());
	appInd.singleDropDown(getWorkCat(), sheetBOQ.getRow(1).getCell(2).getStringCellValue());
	appInd.singleDropDown(WorkSubCat, sheetBOQ.getRow(1).getCell(3).getStringCellValue());
	RandomNum=appInd.RandomNumbers(5);
	getBOQName().sendKeys("BOQ"+RandomNum);
	boqname="BOQ"+RandomNum;
	getBOQDesc().sendKeys("BOQ Created Through Automation");
	getUOM().sendKeys(sheetBOQ.getRow(1).getCell(4).getStringCellValue());
	getQtyCost().sendKeys(sheetBOQ.getRow(1).getCell(5).getStringCellValue());
	getRate().sendKeys(sheetBOQ.getRow(1).getCell(6).getStringCellValue());
	getMaterialDiv();				
	String parent = appInd.switchToChildWindow(getAddMaterial());
	appInd.singleDropDown(getMaterilTypeDD(), sheetBOQ.getRow(1).getCell(7).getStringCellValue());
	appInd.singleDropDown(getMaterilSubTypeDD(), sheetBOQ.getRow(1).getCell(8).getStringCellValue());
	appInd.singleDropDown(getMaterilDD(), sheetBOQ.getRow(1).getCell(9).getStringCellValue());
	getSearch();
	getSelectCheckbox();
	getAcceptSelcted();
	appInd.switchToParentWindow(parent);
	Frames.rightFrame();
	getMaterialUOM().sendKeys(sheetBOQ.getRow(1).getCell(10).getStringCellValue());
	Thread.sleep(1000);
	getCOEfactor().clear();
	getCOEfactor().sendKeys(sheetBOQ.getRow(1).getCell(11).getStringCellValue());
	getCreateButton();
	Thread.sleep(2000);
	BOQId = getBOQID().getText();
	getchangestatus();
	getBOQStatusDD().sendKeys("Submitted");
	getUpdatestatus();
	getchangestatus();
	getBOQStatusDD().sendKeys("Approved");
	getUpdatestatus();
	
	if (appInd.AlertPresent()) {
		Datatable.writeExcel(BOQId, "BOQ is Not Created", EnggTransactionOutput,Engineering.outputCreatePath);
		} else {
			Datatable.writeExcel("BOQ ID::"+ BOQId, "BOQ is Created", EnggTransactionOutput,Engineering.outputCreatePath);
			}
				} catch (Exception e) {
						Datatable.writeExcel(BOQId, "BOQ is not Created-Exception", EnggTransactionOutput,
						Engineering.outputCreatePath);
						}
				System.out.println("BOQ ID------ "+BOQId);
		}
	
	
	
	public void MenuSubMenuWorkOrder() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			Engineering.clickProjects();
			Thread.sleep(1000);
			xml = new Datatable();
			sheetWO = xml.excelData(sheetnameWO, Engineering.inputCreatePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
			}
	}
	
	
	
	String createdWONo;
	String workcategory;
	String worksubcategory;
	String contractorName;

	public void workordercreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		  try {
	    		Frames.rightFrame();
	    		w2.until(ExpectedConditions.visibilityOf(subProjectField));
	    		getSubprojectField().sendKeys(appInd.convertCellToString(sheetWO, 1, 1));
	    		goBtnClickWO();
	    		Thread.sleep(2000);
	    		subprojectHLClick();
	    		Frames.tabFrame();
	    		workorderTabClick();
	    		Thread.sleep(1000);
	    		
	    		Frames.contentFrame();
	    		creatWOBtnClick();
	    		appInd.singleDropDown(getWorkCatDDWO(),(appInd.convertCellToString(sheetWO, 1, 5)));
	    		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubCategoryList']//option[2]")));	    				
	    		appInd.singleDropDown(getWorkSubCatDDWO(),(appInd.convertCellToString(sheetWO, 1, 6)));
	    		appInd.singleDropDown(WOPayFromDD(),appInd.convertCellToString(sheetWO, 1, 7));
	    		
	    		String WOpage = appInd.switchToChildWindow(selectContHL());
	    		w2.until(ExpectedConditions.visibilityOf(contrPopGoBtn));
	    		contractorHLClick();	    		
	    		appInd.switchToParentWindow(WOpage);
	    		
	    		Frames.contentFrame();	    		
	    		getContactPersonField().sendKeys("Ram");
	    		appInd.seletDate(getMobGuaExpDatePicker(), appInd.getDateAsSpecified(-60));
	    		appInd.seletDate(getPerGuaExpDatePicker(), appInd.getDateAsSpecified(-60));
	    		getScopeofWorkTxtArea().sendKeys("Created through automation");
	    		getWorkDescTxtArea().sendKeys("Created through automation");
	    		
	    		addNewTaxAddLinkClick();
	    		Thread.sleep(2000);
	    		appInd.singleDropDown(getTaxCatDD(),(appInd.convertCellToString(sheetWO, 1, 8)));
	    		appInd.singleDropDown(getTaxDD(),(appInd.convertCellToString(sheetWO, 1, 9)));
	    		Thread.sleep(2000);
	    		appInd.singleDropDown(getTaxTypeDD(),(appInd.convertCellToString(sheetWO, 1, 10)));
	    		getPercentOfWOValueField().clear();
	    		getPercentOfWOValueField().sendKeys("100");
	    		Thread.sleep(2000);
	    		
	    		getAddNewDedTaxClick();
	    		appInd.singleDropDown(getDedTaxCatDD(),(appInd.convertCellToString(sheetWO, 1, 14)));
	    		appInd.singleDropDown(getDedTaxDD(),(appInd.convertCellToString(sheetWO, 1, 15)));
	    		Thread.sleep(2000);
	    		createBtnClickinWOCreate();
	    			    		
	    		w2.until(ExpectedConditions.textToBePresentInElement(viewPageTitle,"View Work Order"));
	    		createdWONo= getWOnumber();
	    		workcategory= iDriver.findElement(By.id("lblvwCategory")).getText();
	    		worksubcategory=iDriver.findElement(By.id("lblvwSubCategory")).getText();
	    		contractorName=iDriver.findElement(By.id("lblvwContractor")).getText();
	    		BOQTablinkClick();
	    		String BOQparent = appInd.switchToChildWindow(getaddBOQLink());
	    		
	    		//passing the BOQ ID which was created above
	    		getBOQIdfield().sendKeys(BOQId);
	    		
	    		goBtnAddBOQClick();
	    		selectAllCheckBoxClick();
	    		getQtyField().clear();
	    		getQtyField().sendKeys(appInd.convertCellToString(sheetWO, 1, 12));
	    		getRateField().clear();
	    		getRateField().sendKeys(appInd.convertCellToString(sheetWO, 1, 13));
	    		addBtnClick();
	    		appInd.switchToParentWindow(BOQparent);
	    		System.out.println(appInd.CurrentFrame());

	    		Frames.contentFrame();
	    		WOTabLinkClick();
	    			    		
	    		Frames.contentFrame();
	    		//status change to submitted
	    		changeStatusLinkClick();
    			appInd.singleDropDown(getChangeStatusDDinWO(),"Submitted");
    			getRemarksTxtAreaforWOStatus().sendKeys("Changing Status to Submitted");
    			updateStatusLinkClick();
    			appInd.isAlertPresent();
    			Thread.sleep(2000);
    			appInd.isAlertPresent();    			
    			
    			//status change to approved
    			Thread.sleep(2000);
    			changeStatusLinkClick();
    			appInd.singleDropDown(getChangeStatusDDinWO(),"Approved");
    			getRemarksTxtAreaforWOStatus().sendKeys("Changing Status to Approved");
    			updateStatusLinkClick();
    			appInd.isAlertPresent();
    			Thread.sleep(2000);
    				
	    		
	    		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("WO:NA", "Work order is not Created", EnggTransactionOutput, Engineering.outputCreatePath);
			}else {
					Datatable.writeExcel("WO No: "+createdWONo, "Work order is Created", EnggTransactionOutput, Engineering.outputCreatePath);
					System.out.println("WO no::"+createdWONo);			
					}
		  }
		  			catch (Exception e) {
		  				System.out.println(e);
		  				Datatable.writeExcel("WO:NA", "Work order is not Created", EnggTransactionOutput, Engineering.outputCreatePath);
		  				}
		}	
	
	
	public void MenuSubMenuAbstract() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			en.clickSiteActivity();
			Thread.sleep(1000);
			xml = new Datatable();
			sheetAbstract = xml.excelData(sheetnameAbstract, Engineering.inputCreatePath);
				} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Module, Sub module click case Failed: " + e);
					}
			}
	
	
	
	String abstractDisplayNo;
		
	public void abstractcreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
	   	try {
	    	Frames.SubMenuFrame();
	    	abstractLinkClick();	
	    	Frames.rightFrame();
	    	createAbstBtnClick();
	    	appInd.singleDropDown(getProjectDDinAbstract(),appInd.convertCellToString(sheetAbstract, 1, 1));
	    	appInd.singleDropDown(getSubProjectDD(),appInd.convertCellToString(sheetAbstract, 2, 1));
	    	
	    	appInd.singleDropDown(getWorkCatDD(),workcategory);
	    	appInd.singleDropDown(getWorkSubCatDD(),worksubcategory);
	    	System.out.println(contractorName+" "+"("+createdWONo+")");
	    	Thread.sleep(1000);	    	
	    	appInd.singleDropDown(getWorkorderDD(),contractorName+" "+"("+createdWONo+")");
	    	Thread.sleep(1000);	    		    	
	    	w2.until(ExpectedConditions.visibilityOf(woValueLabel));
	    	Thread.sleep(1000);
	    	createGoBtnClick();
	    	Thread.sleep(2000);
	    	
	    	//boq selection
	    	if(!getSubProjChkBox().isSelected()) {
	    		int cot=0;
	    		List<WebElement> boqlist = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//tr//td[3]//span"));
	    		System.out.println(boqlist.size());
	    		for(int n=0;n<boqlist.size();n++) {
	    			cot++;
	    			System.out.println("n value :: "+n);
	    			System.out.println("get Text::"+boqlist.get(n).getText());
	    				if(boqlist.get(n).getText().equals(BOQId)) {
	    				System.out.println(boqlist.get(n).getText());
	    				cot = cot + 1;
	    				System.out.println(cot);	    			
	    				iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+cot+"]//td[1]//input")).click();
	    				//Thread.sleep(2000);
	    				break;
	    					}	    				
	    				}
	   				}
	    	else {
				getSubProjChkBox().click();
	    		}
	    	
	    	nextBtnClick();
	    	if(appInd.AlertPresent()) {
	    		appInd.isAlertPresent();
	    	}
	    	w2.until(ExpectedConditions.visibilityOf(savecontBtn));
			
			//BOQ quantity selection
	    	int qtyField = 0;
	    	List<WebElement> boqNolist = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//td[3]")); 	    	
	    	System.out.println(boqNolist.size()); 
	    	for(int j = 0;j<boqNolist.size();j++) {
	    		qtyField++;
	    		if(boqNolist.get(j).getText().equals(BOQId)) {
	    			System.out.println("BOQ ID::"+BOQId);
	    			System.out.println(boqNolist.get(j).getText());
	    			qtyField=qtyField+1;
	    			System.out.println(qtyField);								
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+qtyField+"]//td[9]//input")).click();
	    			Robot robo = new Robot();
	    			robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+qtyField+"]//td[9]//input")).sendKeys(appInd.convertCellToString(sheetAbstract, 7, 1));
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+qtyField+"]//td[20]//input[@type='checkbox']")).click();
	    			if(appInd.AlertPresent()) {
	    	    		appInd.isAlertPresent();
	    	    	}
	    			break;
	    		}
	    	}
	    	finishBtnClick();
	    	abstractDisplayNo = getAbstDispNo();
	    	
	    	Frames.SubMenuFrame();
	    	abstractLinkClick();	
	    	Frames.rightFrame();
	    	appInd.singleDropDown(getProjectDDinAbstract(),appInd.convertCellToString(sheetAbstract, 1, 1));
	    	Thread.sleep(1000);
	    	appInd.singleDropDown(getSubProjectDD(),appInd.convertCellToString(sheetAbstract, 2, 1));	    	
	    	Thread.sleep(1000);
	    	appInd.singleDropDown(getWorkCatDD(),workcategory);
	    	Thread.sleep(1000);
	    	appInd.singleDropDown(getWorkSubCatDD(),worksubcategory);
	    	Thread.sleep(2000);
	    	appInd.singleDropDown(getWorkorderDD(),contractorName+" "+"("+createdWONo+")");
	    	Thread.sleep(1000);
	    	goBtninAbstractListClick();		    	
	    	w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='gvAbstractList']")));
	    	
	    	
	    	//finding of workorder and clicking on it by giving abstract display no
	    	int WOlist = 0;
	    	List<WebElement> abstList = iDriver.findElements(By.xpath("//table[@id='gvAbstractList']//td[4]")); 	    	
	    	System.out.println(abstList.size()); 
	    	for(int j = 0;j<abstList.size();j++) {
	    		WOlist++;
	    		if(abstList.get(j).getText().equals(abstractDisplayNo)) {
	    			System.out.println(abstList.get(j).getText());
	    			WOlist=WOlist+1;
	    			System.out.println(WOlist);
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstractList']//tr["+WOlist+"]//td[3]//a")).click();
	    			break;
	    		}
	    	}
	    	
	    	//modifying of created abstract
	    	itemsBtnClick();
	    	
	    	int boqline = 0;
	    	List<WebElement> boqNolist2 = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//td[3]")); 	    	
	    	System.out.println(boqNolist2.size()); 
	    	for(int j = 0;j<boqNolist2.size();j++) {
	    		boqline++;
	    		if(boqNolist2.get(j).getText().equals(BOQId)) {
	    			System.out.println("BOQ ID::"+BOQId);
	    			System.out.println(boqNolist2.get(j).getText());
	    			boqline=boqline+1;
	    			System.out.println(boqline);
	    			
	    			//clicking on boq checkbox
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+boqline+"]//td[1]//input")).click();
	    			
	    			//click on modify items button
	    			modifyItemBtnClick();    			
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+boqline+"]//td[22]//textarea")).sendKeys("Updated through automation");
	    			break;     	
	    		}
	    	}	
	    	
	    	appInd.singleDropDown(getStatusDDinAbstract(), "Approved");
	    	getStatusRemarksTxtArea().sendKeys("Status updated as Approved through automation");
	    	finishBtnClick();
	    	    	
	    	if(getStatusUpdateTxt().getText().equalsIgnoreCase("Items Updated Successfully.")) {
				Datatable.writeExcel("Abstract No:"+abstractDisplayNo,"Created and approved", EnggTransactionOutput, Engineering.outputCreatePath);
				}
	    		else {
					Datatable.writeExcel("Abstract", "Not Created", EnggTransactionOutput, Engineering.outputCreatePath);
					}
	   		}	    	
	    	catch (Exception e){
	    		System.out.println(e);
	    		Datatable.writeExcel("Abstract No", "Not Created", EnggTransactionOutput, Engineering.outputCreatePath);
				}	
		}
}