package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.ServiceDebitNoteReceiptCreate;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServiceDebitNoteReceiptCreate_Test extends DriverScript{
	
	public static ServiceDebitNoteReceiptCreate ServiceDNReceiptCreate=null;
	@Test
	public void ServiceDebitNoteReceiptCreation()throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		ServiceDNReceiptCreate=new ServiceDebitNoteReceiptCreate(oBrowser);
		ServiceDNReceiptCreate.MenuSubMenuServDNReceipt();
		ServiceDNReceiptCreate.ServiceDebitNoteReceiptCreation();
		
	}

}
