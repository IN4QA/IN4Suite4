package com.RE.Purchase.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Quotation_Test_List extends DriverScript {
	
	public static com.RE.Purchase.ObjectRepository.Quotation_List Quotationlist=null;
	 
	@Test
	public void quotationlist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		Quotationlist=new com.RE.Purchase.ObjectRepository.Quotation_List(oBrowser);
		Quotationlist.MenuSubMenu();
		Quotationlist.WithRfq();
		Quotationlist.withoutrfq();
		Quotationlist.all();
		Quotationlist.projectwithrfq();
		Quotationlist.projectwithoutrfq();
		Quotationlist.projectall();
	}

}
