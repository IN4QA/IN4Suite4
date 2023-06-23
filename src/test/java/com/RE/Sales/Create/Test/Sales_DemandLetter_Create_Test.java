package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.Sales_DemandLetter_Create;
import com.RE.Sales.Create.ObjectRepository.Transaction_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Sales_DemandLetter_Create_Test extends DriverScript{

	public static Sales_DemandLetter_Create SalesDemandLetter = null;

	@Test
	public void transactionCreateTest() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SalesDemandLetter = new Sales_DemandLetter_Create(oBrowser);
		
		SalesDemandLetter.MenuSubMenuUnit();
		SalesDemandLetter.genarateDemandLetter();
	}
}
