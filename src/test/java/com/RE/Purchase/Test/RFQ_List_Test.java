package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class RFQ_List_Test extends DriverScript {
	
	public static com.RE.Purchase.ObjectRepository.RFQ_List rfqlist=null;
	 
	@Test
	public void quotationlist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		rfqlist=new com.RE.Purchase.ObjectRepository.RFQ_List(oBrowser);

		rfqlist.MenuSubMenu();
		rfqlist.go();
		rfqlist.company();
	}
}
