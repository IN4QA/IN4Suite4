package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Billing_DebitNoteReceipt_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_DebitNoteReceipt_List DebitNoteReceipt = null;

	@Test
	public void DebitNoteReceipt() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		DebitNoteReceipt = new com.RE.Engineering.ObjectRepository.Billing_DebitNoteReceipt_List(oBrowser);
		
		DebitNoteReceipt.MenuSubMenu();
		DebitNoteReceipt.companyandproject();
	
	}
}
 		