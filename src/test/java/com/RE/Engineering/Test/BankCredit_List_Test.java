package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BankCredit_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.BankCredit_List bankcreditlist=null;
	@Test
	public void BankCreditList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		bankcreditlist=new com.RE.Engineering.ObjectRepository.BankCredit_List(oBrowser);
		
		bankcreditlist.MainSubMenu();
		bankcreditlist.company();
		
	}

}
