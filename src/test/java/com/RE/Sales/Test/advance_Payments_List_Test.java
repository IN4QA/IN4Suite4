package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.advance_Payments_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class advance_Payments_List_Test extends DriverScript{

	public static advance_Payments_List advPay = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		advPay = new advance_Payments_List(oBrowser);
		advPay.MenuSubMenu();
		
		advPay.noFilter();
		advPay.project();
	}
}
