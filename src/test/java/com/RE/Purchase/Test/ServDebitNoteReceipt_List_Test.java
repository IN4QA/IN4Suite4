package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServDebitNoteReceipt_List_Test extends DriverScript {
	public static com.RE.Purchase.ObjectRepository.ServDebitNoteReceipt_List ServDebitNoteReceipt = null;

	@Test
	public void SupDebitNoteReceiptList() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			ServDebitNoteReceipt = new com.RE.Purchase.ObjectRepository.ServDebitNoteReceipt_List(oBrowser);
			ServDebitNoteReceipt.MenuSubMenu();
			ServDebitNoteReceipt.companyproject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
