package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_Search_List_Test extends DriverScript{
	
	public static com.RE.Purchase.ObjectRepository.Pur_Search_List searchsuppliercert=null;

	@Test
	public void search() throws Throwable{
		
	FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		searchsuppliercert=new com.RE.Purchase.ObjectRepository.Pur_Search_List(oBrowser);
		searchsuppliercert.MenuSubMenu();
		searchsuppliercert.searchsuppcert();
		searchsuppliercert.searchsuppadvance();
		searchsuppliercert.searchpurchaseorders();
	//	searchsuppliercert.searchTransferorders(); 4.0 UI issue exists in the list page
	//	searchsuppliercert.searchsuppliers();  4.0 UI issue exists in the list page
	}
}