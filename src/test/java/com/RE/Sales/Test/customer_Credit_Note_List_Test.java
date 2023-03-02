package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.customer_Credit_Note_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class customer_Credit_Note_List_Test extends DriverScript{

	public static customer_Credit_Note_List CCreditNote = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		CCreditNote = new customer_Credit_Note_List(oBrowser);
		CCreditNote.MenuSubMenu();
		
		CCreditNote.noFilter();
		CCreditNote.project();
	}
}
