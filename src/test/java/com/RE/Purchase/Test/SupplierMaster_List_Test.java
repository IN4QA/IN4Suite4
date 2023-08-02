package com.RE.Purchase.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SupplierMaster_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.SupplierMaster_List suppliermaster = null;

	@Test
	public void SupplierList() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			suppliermaster = new com.RE.Purchase.ObjectRepository.SupplierMaster_List(oBrowser);
			suppliermaster.MenuSubMenu();
			suppliermaster.go();
			suppliermaster.status();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
