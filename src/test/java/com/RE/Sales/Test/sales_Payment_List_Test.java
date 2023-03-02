package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.sales_Payment_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class sales_Payment_List_Test extends DriverScript{

	public static sales_Payment_List salesPay = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		salesPay = new sales_Payment_List(oBrowser);
		salesPay.MenuSubMenu();
		
		salesPay.noFilter();
		salesPay.project();
	}
}
