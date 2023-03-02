package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Receipts_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Receipts_List_Test extends DriverScript{

	public static Receipts_List reclist = null;
	@Test
	public void REC_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		reclist = new Receipts_List(oBrowser);
		reclist.MenuSubMenu();
		
		
		reclist.getProjectCount();
		reclist.getSubProjectCount();
		reclist.getUnitCount();
		reclist.getStatusCount();
		reclist.getCustomerCount();
		
	}
}
