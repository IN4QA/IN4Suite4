package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Marketting_DebitNoteReceipt_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.MarkettingDebitNoteReceipt_List debitnotereceiptlist=null;
	
	@Test
	
	public void DebitNoteReceiptList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		debitnotereceiptlist=new com.RE.Sales.ObjectRepository.MarkettingDebitNoteReceipt_List(oBrowser);
		debitnotereceiptlist.MenuSubMenu();
		debitnotereceiptlist.nofilter();
		debitnotereceiptlist.company();
		}

}
