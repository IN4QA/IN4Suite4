package com.RE.HR.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.HR.Create.Test.Employee_Create_Test;
import com.RE.Submodules.HR;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Employee_Create extends Employee_Create_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static HR hr;

	public Employee_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(css = "#lnkAddNew")
	private WebElement AddNewLink;
	public void getAddNewLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AddNewLink));
		AddNewLink.click();
	} 
	
	@FindBy(css = "select#ddlTitle")
	private WebElement TitleDD;
	public WebElement getTitleDD() {
		w2.until(ExpectedConditions.elementToBeClickable(TitleDD));
		return TitleDD;
	} 
	
	@FindBy(css = "input#txtFirstName")
	private WebElement FirstName;
	public WebElement getFirstName() {
		w2.until(ExpectedConditions.elementToBeClickable(FirstName));
		return FirstName;
	} 
	
	@FindBy(css = "input#txtLastName")
	private WebElement LastName;
	public WebElement getLastName() {
		w2.until(ExpectedConditions.elementToBeClickable(LastName));
		return LastName;
	} 
	
	@FindBy(css = "select#ddlEmpRelationshipType")
	private WebElement RelationshipTypeDD;
	public WebElement getRelationshipTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(RelationshipTypeDD));
		return RelationshipTypeDD;
	} 
	
	@FindBy(css = "input#txtEmpRelationshipName")
	private WebElement RelationshipNameDD;
	public WebElement getRelationshipNameDD() {
		w2.until(ExpectedConditions.elementToBeClickable(RelationshipNameDD));
		return RelationshipNameDD;
	} 
	
	@FindBy(css = "input#dtDOB_txtDatePicker")
	private WebElement DOB;
	public WebElement getDOB() {
		w2.until(ExpectedConditions.elementToBeClickable(DOB));
		return DOB;
	} 
	
	@FindBy(css = "select#ddlGender")
	private WebElement GenderDD;
	public WebElement getGenderDD() {
		w2.until(ExpectedConditions.elementToBeClickable(GenderDD));
		return GenderDD;
	} 
	
	@FindBy(css = "select#ddlMaritalStatus")
	private WebElement MaritalStatusDD;
	public WebElement getMaritalStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(MaritalStatusDD));
		return MaritalStatusDD;
	} 
	
	@FindBy(css = "select#ddlCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
		return CompanyDD;
	} 
	
	@FindBy(css = "select#ddlPayscale")
	private WebElement PayscaleDD;
	public WebElement getPayscaleDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PayscaleDD));
		return PayscaleDD;
	} 
	
	@FindBy(css = "select#ddlCorporateTitle")
	private WebElement CorporateTitleDD;
	public WebElement getCorporateTitleDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CorporateTitleDD));
		return CorporateTitleDD;
	} 
	
	@FindBy(css = "select#ddlGroup")
	private WebElement GroupDD;
	public WebElement getGroupDD() {
		w2.until(ExpectedConditions.elementToBeClickable(GroupDD));
		return GroupDD;
	} 
	
	@FindBy(css = "select#ddlRole")
	private WebElement RoleDD;
	public WebElement getRoleDD() {
		w2.until(ExpectedConditions.elementToBeClickable(RoleDD));
		return RoleDD;
	} 
	
	@FindBy(css = "select#ddlRegion")
	private WebElement RegionDD;
	public WebElement getRegionDD() {
		w2.until(ExpectedConditions.elementToBeClickable(RegionDD));
		return RegionDD;
	} 
	
	@FindBy(css = "select#ddlState")
	private WebElement StateDD;
	public WebElement getStateDD() {
		w2.until(ExpectedConditions.elementToBeClickable(StateDD));
		return StateDD;
	} 
	
	@FindBy(css = "select#ddlLocation")
	private WebElement LocationDD;
	public WebElement getLocationDD() {
		w2.until(ExpectedConditions.elementToBeClickable(LocationDD));
		return LocationDD;
	} 
	
	@FindBy(css = "select#ddlFinLocation")
	private WebElement FinLocationDD;
	public WebElement getFinLocationDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FinLocationDD));
		return FinLocationDD;
	} 
	
	@FindBy(css = "input#imgManager")
	private WebElement Manager;
	public void getManager() {
		w2.until(ExpectedConditions.elementToBeClickable(Manager));
		Manager.click();
	} 
	
	@FindBy(css = "input#txtEmployeeName")
	private WebElement ManagerName;
	public WebElement getManagerName() {
		w2.until(ExpectedConditions.elementToBeClickable(ManagerName));
		return ManagerName;
	} 
	
	@FindBy(css = "#dgEmployeeSearch_hplnkEmployeeName_0")
	private WebElement SelectManagerName;
	public void getSelectManagerName() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectManagerName));
		SelectManagerName.click();
	} 
	
	@FindBy(css = "input#txtEmployeeID")
	private WebElement EmployeeCode;
	public WebElement getEmployeeCode() {
		w2.until(ExpectedConditions.elementToBeClickable(EmployeeCode));
		return EmployeeCode;
	} 
	
	@FindBy(css = "input#txtUserName")
	private WebElement UserName;
	public WebElement getUserName() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(UserName));
		UserName.clear();
		Thread.sleep(1000);
		return UserName;
	} 
	
	@FindBy(css = "input#txtPassword")
	private WebElement Password;
	public WebElement getPassword() {
		w2.until(ExpectedConditions.elementToBeClickable(Password));
		return Password;
	} 
	
	@FindBy(css = "input#txtConfirmPassword")
	private WebElement ConfirmPassword;
	public WebElement getConfirmPassword() {
		w2.until(ExpectedConditions.elementToBeClickable(ConfirmPassword));
		return ConfirmPassword;
	} 
	
	@FindBy(css = "input#dtJoinedDate_txtDatePicker")
	private WebElement JoinedDate;
	public WebElement getJoinedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(JoinedDate));
		return JoinedDate;
	} 
	
	@FindBy(css = "input#dtPayscaleEffectiveFromDate_txtDatePicker")
	private WebElement PayscaleEffectiveFromDate;
	public WebElement getPayscaleEffectiveFromDate() {
		w2.until(ExpectedConditions.elementToBeClickable(PayscaleEffectiveFromDate));
		return PayscaleEffectiveFromDate;
	} 
	
	@FindBy(css = "input#dtConfirmedDate_txtDatePicker")
	private WebElement ConfirmedDate;
	public WebElement getConfirmedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ConfirmedDate));
		return ConfirmedDate;
	} 
	
	@FindBy(css = "input#txtOfficialEmail")
	private WebElement OfficialEmail;
	public WebElement getOfficialEmail() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(OfficialEmail));
		OfficialEmail.clear();
		Thread.sleep(1000);
		return OfficialEmail;
	}
	
	@FindBy(css = "select#ddlCountryCode")
	private WebElement CountryCode;
	public WebElement getCountryCode() {
		w2.until(ExpectedConditions.elementToBeClickable(CountryCode));
		return CountryCode;
	}
	
	@FindBy(css = "input#txtMobile")
	private WebElement Mobile;
	public WebElement getMobile() {
		w2.until(ExpectedConditions.elementToBeClickable(Mobile));
		return Mobile;
	}
	
	@FindBy(css = "select#ddlEmpType")
	private WebElement EmpType;
	public WebElement getEmpType() {
		w2.until(ExpectedConditions.elementToBeClickable(EmpType));
		return EmpType;
	}
	
	@FindBy(css = "select#ddlEmpStatus")
	private WebElement EmpStatus;
	public WebElement getEmpStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(EmpStatus));
		return EmpStatus;
	}
	
	@FindBy(css = "input#btnSubmit")
	private WebElement CreateBtn;
	public WebElement getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		return CreateBtn;
	} 
	
	@FindBy(css = "input#txtCommunicationEmail")
	private WebElement CommunicationEmail;
	public void getCommunicationEmail() {
		w2.until(ExpectedConditions.elementToBeClickable(CommunicationEmail));
		CommunicationEmail.clear();
	}
	
	// Additional info
	
	@FindBy(css = "input#txtAddress1")
	private WebElement PresentAddress;
	public WebElement getPresentAddress() {
		w2.until(ExpectedConditions.elementToBeClickable(PresentAddress));
		return PresentAddress;
	} 
	
	@FindBy(css = "select#ddlCountry")
	private WebElement PresentCountry;
	public WebElement getPresentCountry() {
		w2.until(ExpectedConditions.elementToBeClickable(PresentCountry));
		return PresentCountry;
	} 
	
	@FindBy(css = "select#ddlPresentAddressState")
	private WebElement PresentState;
	public WebElement getPresentState() {
		w2.until(ExpectedConditions.elementToBeClickable(PresentState));
		return PresentState;
	} 
	
	@FindBy(css = "select#ddlPresentAddressLocation")
	private WebElement PresentLocation;
	public WebElement getPresentLocation() {
		w2.until(ExpectedConditions.elementToBeClickable(PresentLocation));
		return PresentLocation;
	} 
	
	@FindBy(css = "input#txtPincode")
	private WebElement PresentPincode;
	public WebElement getPresentPincode() {
		w2.until(ExpectedConditions.elementToBeClickable(PresentPincode));
		return PresentPincode;
	} 
	
	@FindBy(css = "input#chkSameAddress")
	private WebElement SameAddressCheckBox;
	public void getSameAddressCheckBox() {
		w2.until(ExpectedConditions.elementToBeClickable(SameAddressCheckBox));
		SameAddressCheckBox.click();
	} 
	
	@FindBy(css = "input#txtEmergencyContactPerson")
	private WebElement EmergencyContactPerson;
	public WebElement getEmergencyContactPerson() {
		w2.until(ExpectedConditions.elementToBeClickable(EmergencyContactPerson));
		return EmergencyContactPerson;
	} 
	
	@FindBy(css = "input#txtEmergencyPhone")
	private WebElement EmergencyPhone;
	public WebElement getEmergencyPhone() {
		w2.until(ExpectedConditions.elementToBeClickable(EmergencyPhone));
		return EmergencyPhone;
	} 
	
	@FindBy(css = "input#txtPANNo")
	private WebElement PANNo;
	public WebElement getPANNo() {
		w2.until(ExpectedConditions.elementToBeClickable(PANNo));
		return PANNo;
	} 
	
	@FindBy(css = "input#txtBankRoutingNo")
	private WebElement BankIFSC;
	public WebElement getBankIFSC() {
		w2.until(ExpectedConditions.elementToBeClickable(BankIFSC));
		return BankIFSC;
	} 
	
	@FindBy(css = "select#ddlBanks")
	private WebElement Banks;
	public WebElement getBanks() {
		w2.until(ExpectedConditions.elementToBeClickable(Banks));
		return Banks;
	} 
	
	@FindBy(css = "input#txtBankAccNo")
	private WebElement BankAccNo;
	public WebElement getBankAccNo() {
		w2.until(ExpectedConditions.elementToBeClickable(BankAccNo));
		return BankAccNo;
	} 
	
	@FindBy(css = "input#txtAadhar")
	private WebElement AadharNo;
	public WebElement getAadharNo() {
		w2.until(ExpectedConditions.elementToBeClickable(AadharNo));
		return AadharNo;
	} 
	
	@FindBy(css = "input#chkPFApplicable")
	private WebElement PFApplicableCheckBox;
	public void getPFApplicableCheckBox() {
		w2.until(ExpectedConditions.elementToBeClickable(PFApplicableCheckBox));
		PFApplicableCheckBox.click();
	} 
	
	@FindBy(css = "select#ddlPFTrust")
	private WebElement PFTrust;
	public WebElement getPFTrust() {
		w2.until(ExpectedConditions.elementToBeClickable(PFTrust));
		return PFTrust;
	} 
	
	@FindBy(css = "input#txtEmpPFNumber")
	private WebElement PFNumber;
	public WebElement getPFNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(PFNumber));
		return PFNumber;
	} 
	
	@FindBy(css = "input#txtUANNo")
	private WebElement UANNo;
	public WebElement getUANNo() {
		w2.until(ExpectedConditions.elementToBeClickable(UANNo));
		return UANNo;
	} 
	
	@FindBy(css = "input#txtMemberID")
	private WebElement MemberID;
	public WebElement getMemberID() {
		w2.until(ExpectedConditions.elementToBeClickable(MemberID));
		return MemberID;
	} 
	
	@FindBy(css = "input#chkESIApplicable")
	private WebElement ESIApplicableCheckBox;
	public void getESIApplicableCheckBox() {
		w2.until(ExpectedConditions.elementToBeClickable(ESIApplicableCheckBox));
		ESIApplicableCheckBox.click();
	} 
	
	@FindBy(css = "input#txtESINumber")
	private WebElement ESINumber;
	public WebElement getESINumber() {
		w2.until(ExpectedConditions.elementToBeClickable(ESINumber));
		return ESINumber;
	} 
	
	@FindBy(css = "input#btnSubmit")
	private WebElement SubmitBtn;
	public void getSubmitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		SubmitBtn.click();
	} 
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickHR();
			Thread.sleep(2000);
			hr = new HR(iDriver);
			hr.clickEmpList();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, HR.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	int count = 0;
	String FName;
	String LName;

	public void createEmployees() throws Throwable {
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				Frames.SubMenuFrame();
				hr.clickEmpList();
				Frames.mainFrame();
				getAddNewLink();
				Thread.sleep(1000);
				Frames.myMainFrame();

				appInd.singleDropDown(getTitleDD(), sheet.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(1000);
				FName = sheet.getRow(i).getCell(1).getStringCellValue();
				getFirstName().sendKeys(FName);
				LName = appInd.getCurrentDateTime();
				getLastName().sendKeys(LName);
				Thread.sleep(1000);
				getLastName().sendKeys(LName);
				appInd.singleDropDown(getRelationshipTypeDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				getRelationshipNameDD().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
				appInd.seletDate(getDOB(), sheet.getRow(i).getCell(4).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getGenderDD(), sheet.getRow(i).getCell(5).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getMaritalStatusDD(), sheet.getRow(i).getCell(6).getStringCellValue());
				Thread.sleep(1000);

				appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(7).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPayscaleDD(), sheet.getRow(i).getCell(8).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getCorporateTitleDD(), sheet.getRow(i).getCell(9).getStringCellValue());
				Thread.sleep(1000);

				appInd.singleDropDown(getGroupDD(), sheet.getRow(i).getCell(10).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getRoleDD(), sheet.getRow(i).getCell(11).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getRegionDD(), sheet.getRow(i).getCell(12).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getStateDD(), sheet.getRow(i).getCell(13).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getLocationDD(), sheet.getRow(i).getCell(14).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getFinLocationDD(), sheet.getRow(i).getCell(15).getStringCellValue());
				Thread.sleep(1000);

				getManager();
				Thread.sleep(1000);
				try {
					WebElement frame = iDriver.findElement(By.cssSelector("iframe[class='cboxIframe']"));
					iDriver.switchTo().frame(frame);
				} catch (Exception e) {
					System.out.println(e);
				}
				getManagerName().sendKeys(sheet.getRow(i).getCell(16).getStringCellValue());
				Thread.sleep(1000);
				getSelectManagerName();

				Frames.mainFrame();
				Frames.myMainFrame();

				String num = appInd.RandomNoAsSpecified(4);
				String empCadeUserName = (sheet.getRow(i).getCell(1).getStringCellValue().toString().substring(0, 3)) + num;

				JavascriptExecutor srcoll = (JavascriptExecutor) iDriver;
				srcoll.executeScript("scroll(0, -250);");

				Thread.sleep(1000);
				getEmployeeCode().sendKeys(empCadeUserName);
				getUserName().sendKeys(empCadeUserName);
				String pwd = empCadeUserName + "234";
				getPassword().sendKeys(pwd);
				getConfirmPassword().sendKeys(pwd);
				appInd.seletDate(getJoinedDate(), sheet.getRow(i).getCell(17).getStringCellValue());
				Thread.sleep(1000);
				appInd.seletDate(getPayscaleEffectiveFromDate(), sheet.getRow(i).getCell(18).getStringCellValue());
				Thread.sleep(1000);
				appInd.seletDate(getConfirmedDate(), sheet.getRow(i).getCell(19).getStringCellValue());
				Thread.sleep(1000);
				getOfficialEmail().sendKeys(empCadeUserName + "@gamil.com");
				getCommunicationEmail();
				appInd.singleDropDown(getCountryCode(), sheet.getRow(i).getCell(20).getStringCellValue());
				Thread.sleep(1000);
				getMobile().sendKeys(appInd.getCurrentDateTime());
				appInd.singleDropDown(getEmpType(), sheet.getRow(i).getCell(21).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getEmpStatus(), sheet.getRow(i).getCell(22).getStringCellValue());
				Thread.sleep(1000);
				getPassword().sendKeys(pwd);
				getConfirmPassword().sendKeys(pwd);

				srcoll.executeScript("arguments[0].click();", getCreateBtn());
				
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
					Datatable.writeExcel((FName + " " + LName), "Employee Not Created", sheetname, HR.CreateOutPutPath);
				} else {
					count++;
					Datatable.writeExcel((FName + " " + LName), "Employee Created", sheetname, HR.CreateOutPutPath);
				}
				
				additionalInfo();

			} catch (Exception e) {
				System.out.println(e);
				appInd.isAlertPresent();
				Datatable.writeExcel((FName + " " + LName), "Employee Not Created", sheetname, HR.CreateOutPutPath);
			}
		}
		
		

	}
	
	public void additionalInfo() throws Throwable {
		try {
			getPresentAddress().sendKeys("7th floor, Embassy Heights, Magrath Road, Bangalore");
			appInd.singleDropDown(getPresentCountry(), "India");
			Thread.sleep(1000);
			appInd.singleDropDown(getPresentState(), "Karnataka");
			Thread.sleep(1000);
			appInd.singleDropDown(getPresentLocation(), "Bangalore");
			Thread.sleep(1000);
			getPresentPincode().sendKeys(appInd.RandomNoAsSpecified(6));
			getSameAddressCheckBox();
			getEmergencyContactPerson().sendKeys("Preetham");
			getEmergencyPhone().sendKeys(appInd.getCurrentDateTime());
			getPANNo().sendKeys(appInd.PanNumber());
			getBankIFSC().sendKeys("SBI" + appInd.RandomNoAsSpecified(6));
			appInd.singleDropDown(getBanks(), "SBI");
			getBankAccNo().sendKeys(appInd.RandomNoAsSpecified(16));
			getAadharNo().sendKeys(appInd.RandomNoAsSpecified(12));
			getPFApplicableCheckBox();
			appInd.singleDropDown(getPFTrust(), "IN4VELOCITY");
			String pfNumber = appInd.RandomStrAsSpecified(5, "UpperCase") + "" + appInd.RandomNoAsSpecified(17);
			getPFNumber().sendKeys(pfNumber);
			getUANNo().sendKeys(appInd.RandomNoAsSpecified(12));
			getMemberID().sendKeys(pfNumber + appInd.RandomNoAsSpecified(5));
			getESIApplicableCheckBox();
			getESINumber().sendKeys(appInd.RandomNoAsSpecified(17));
			getSubmitBtn();
			

			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel((FName + " " + LName), "Additioanl Info Not Updated", sheetname, HR.CreateOutPutPath);
			} else {
				count++;
				Datatable.writeExcel((FName + " " + LName), "Additioanl Info Updated", sheetname, HR.CreateOutPutPath);
			}
			
		} catch (Exception e) {
			System.out.println(e);
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			Datatable.writeExcel((FName + " " + LName), "Additioanl Info Not Updated", sheetname, HR.CreateOutPutPath);
		}
	}
}
