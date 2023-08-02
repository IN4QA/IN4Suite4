package com.RE.Sales.Create.Test;


import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.CustomerCreditNote_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class CustomerCreditNote_Create_Test extends DriverScript{
	public static CustomerCreditNote_Create CustomerCreditNoteCreate=null;
	@Test
	public void CreateCustomerCreditNote() throws Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		CustomerCreditNoteCreate=new CustomerCreditNote_Create(oBrowser);
		CustomerCreditNoteCreate.MenuSubMenuCutomerCreditNote();
		CustomerCreditNoteCreate.CutomerCreditNoteCreation();
	}

}
