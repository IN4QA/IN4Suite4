package com.RE.Engineering.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_TenderReceipt_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_TenderReceipt_List tenderReceipt = null;

	@Test
	public void TenderReceipt() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		tenderReceipt = new com.RE.Engineering.ObjectRepository.Tendering_TenderReceipt_List(oBrowser);
		
		tenderReceipt.MenuSubMenu();
		tenderReceipt.go();
		//TenderReceipt.project();
	}
}