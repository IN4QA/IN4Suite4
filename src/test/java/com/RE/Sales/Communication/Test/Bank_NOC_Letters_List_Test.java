package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.Bank_NOC_Letters_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Bank_NOC_Letters_List_Test extends DriverScript{
	
	public static Bank_NOC_Letters_List BankNOCLettersList=null;
	@Test
	public static void bankNOCletterslist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		BankNOCLettersList=new Bank_NOC_Letters_List(oBrowser); 
		BankNOCLettersList.MenuSubMenu();
		BankNOCLettersList.projectwithsubproject();
	}

}
