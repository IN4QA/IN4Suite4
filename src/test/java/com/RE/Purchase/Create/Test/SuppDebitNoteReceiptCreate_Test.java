package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.SuppDebitNoteReceiptCreate;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SuppDebitNoteReceiptCreate_Test extends DriverScript{
	
	public static SuppDebitNoteReceiptCreate suppDNReceiptCreate=null;
	@Test
	public void SuppDNReceiptCreate()throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		suppDNReceiptCreate=new SuppDebitNoteReceiptCreate(oBrowser);
		suppDNReceiptCreate.MenuSubMenuSuppDNReceipt();
		suppDNReceiptCreate.SupplierDebitNoteReceiptCreation();
		
	}

}
