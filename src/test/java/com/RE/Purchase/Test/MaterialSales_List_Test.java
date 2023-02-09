package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class MaterialSales_List_Test extends DriverScript{

	public static com.RE.Purchase.ObjectRepository.MaterialSales_List MaterialSalesList = null;
	
	@Test
	public void MaterialSales() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		MaterialSalesList = new com.RE.Purchase.ObjectRepository.MaterialSales_List(oBrowser);
		
		MaterialSalesList.MenuSubMenu();
		MaterialSalesList.material();
		MaterialSalesList.asset();
		MaterialSalesList.materialwithfromstore();
		
	}
}
