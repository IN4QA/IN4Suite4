package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.customer_Debit_Note_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class customer_Debit_Note_List_Test extends DriverScript{

	public static customer_Debit_Note_List CDebitNote = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		CDebitNote = new customer_Debit_Note_List(oBrowser);
		CDebitNote.MenuSubMenu();
		
		CDebitNote.noFilter();
		CDebitNote.project();
	}
}
