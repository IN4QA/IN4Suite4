package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BondPayment_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.BondPayment_List bondpaymentlist=null;
	
	@Test
	
	public void BondPaymentList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		bondpaymentlist= new com.RE.Engineering.ObjectRepository.BondPayment_List(oBrowser);
		bondpaymentlist.MenuSubMenu();
		bondpaymentlist.bankname();
	}
}


//No Data is listing in 'Client Name' dropdown in auto server