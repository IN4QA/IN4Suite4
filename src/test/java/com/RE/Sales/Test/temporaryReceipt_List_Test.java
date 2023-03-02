package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.temporaryReceipt_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class temporaryReceipt_List_Test extends DriverScript{

	public static temporaryReceipt_List tempReclist = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		tempReclist = new temporaryReceipt_List(oBrowser);
		tempReclist.MenuSubMenu();
		
		tempReclist.noFilter();
		tempReclist.project();
	}
}
