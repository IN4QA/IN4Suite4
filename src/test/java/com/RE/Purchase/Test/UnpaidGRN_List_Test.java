package com.RE.Purchase.Test;

import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class UnpaidGRN_List_Test extends DriverScript{

	public static com.RE.Purchase.ObjectRepository.UnpaidGRN_List UnpaidGRNList = null;
	
	@Test
	public void unpaidGRNlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		UnpaidGRNList = new com.RE.Purchase.ObjectRepository.UnpaidGRN_List(oBrowser);
		
		UnpaidGRNList.MenuSubMenu();
		UnpaidGRNList.project();
		UnpaidGRNList.projectwithstatus();
		
	}
}
