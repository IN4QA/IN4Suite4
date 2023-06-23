package com.RE.Sales.Create.Test;



import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.Sales_Receipt_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Sales_Receipt_Create_Test extends DriverScript{
	
	public static Sales_Receipt_Create SalesReceiptCreate = null;

	@Test
	public void transactionCreateTest() throws Throwable {
					
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SalesReceiptCreate = new Sales_Receipt_Create(oBrowser);
		
		SalesReceiptCreate.MenuSubMenuUnit();
		SalesReceiptCreate.genarateReceipt();
	}
}
