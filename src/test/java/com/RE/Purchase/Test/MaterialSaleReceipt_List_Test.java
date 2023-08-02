package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class MaterialSaleReceipt_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.MaterialSaleReceipt_List MaterialSaleReceiptList = null;

	@Test

	public void SupAdvList() throws Throwable {
		try {
			MenuClick.FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			MaterialSaleReceiptList = new com.RE.Purchase.ObjectRepository.MaterialSaleReceipt_List(oBrowser);

			MaterialSaleReceiptList.MenuSubMenu();
			MaterialSaleReceiptList.go();
			MaterialSaleReceiptList.contarctor();
			MaterialSaleReceiptList.supplier();
			MaterialSaleReceiptList.ThirdPartyBuyer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
