package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class MarkettingCredit_Note_List_Test extends DriverScript{
	

	public static com.RE.Sales.ObjectRepository.MarkettingCredit_Note_List creditnotelist=null;
	
	@Test
	
	public void CreditNoteList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		creditnotelist=new com.RE.Sales.ObjectRepository.MarkettingCredit_Note_List(oBrowser);
		creditnotelist.MenuSubMenu();
		creditnotelist.nofilter();
		creditnotelist.company();
}
}
