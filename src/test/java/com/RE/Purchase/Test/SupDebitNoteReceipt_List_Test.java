package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SupDebitNoteReceipt_List_Test extends DriverScript{
	public static com.RE.Purchase.ObjectRepository.SupDebitNoteReceipt_List SupRecList=null;
	@Test 
	public void SuppDebitNoteReceipt() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SupRecList=new com.RE.Purchase.ObjectRepository.SupDebitNoteReceipt_List(oBrowser);
		SupRecList.MenuSubMenu();
		SupRecList.company();
		
	}
	

}