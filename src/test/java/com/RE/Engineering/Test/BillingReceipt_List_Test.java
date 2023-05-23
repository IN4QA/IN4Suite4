package com.RE.Engineering.Test;


import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BillingReceipt_List_Test extends DriverScript{
	public static com.RE.Engineering.ObjectRepository.BillingReceipt_List receiptlist=null;
	
	@Test
	public void ReceiptList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		receiptlist=new com.RE.Engineering.ObjectRepository.BillingReceipt_List(oBrowser);
		receiptlist.MenuSubMenu();
		receiptlist.mandatoryfilter();
		receiptlist.datefilter();
	}
}