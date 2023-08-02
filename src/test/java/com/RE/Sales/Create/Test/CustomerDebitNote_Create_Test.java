package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.CustomerDebitNote_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class CustomerDebitNote_Create_Test extends DriverScript{

	public static CustomerDebitNote_Create CustomerDebitNoteCreate=null;
	@Test
	public void CreateCustomerDebitNote() throws Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		CustomerDebitNoteCreate=new CustomerDebitNote_Create(oBrowser);
		CustomerDebitNoteCreate.MenuSubMenuCutomerDebitNote();
		CustomerDebitNoteCreate.CutomerDebitNoteCreation();
	}
}
