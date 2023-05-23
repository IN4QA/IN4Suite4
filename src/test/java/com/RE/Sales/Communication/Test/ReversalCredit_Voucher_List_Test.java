package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.ReversalCredit_Voucher_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ReversalCredit_Voucher_List_Test extends DriverScript{
	
public static ReversalCredit_Voucher_List ReversalCreditVoucherList=null;

@Test

	public void ReversalCreditVoucherList() throws Throwable{
		
		FullApplicationTestScripts login= new FullApplicationTestScripts();
		login.loginTest();
		ReversalCreditVoucherList = new ReversalCredit_Voucher_List(oBrowser);
		ReversalCreditVoucherList.MenuSubMenu();
		ReversalCreditVoucherList.projectandsubproject();
		
	}
	
	

}
