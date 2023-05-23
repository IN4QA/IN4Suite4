package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Sales_Stock_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Sales_Stock_Test extends DriverScript{

	public static Sales_Stock_List SalesStockList = null;
	@Test
	public void SalesStock_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SalesStockList = new Sales_Stock_List(oBrowser);
		SalesStockList.MenuSubMenu();
		
		SalesStockList.availableUnit();
		SalesStockList.soldUnit();
		SalesStockList.holdUnit();
		SalesStockList.blockedUnit();
		SalesStockList.noFilter();
	}
}
