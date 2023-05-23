package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.administrativeReceipts_List;

import MenuClick.FullApplicationTestScripts;

public class administrativeReceipts_List_Test extends Utilities.DriverScript{

	public static administrativeReceipts_List AdminReclist = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		AdminReclist = new administrativeReceipts_List(oBrowser);
		AdminReclist.MenuSubMenu();
		
		AdminReclist.S_Adminstrative_noFilter();
		AdminReclist.S_Adminstrative_project();
	}
}
