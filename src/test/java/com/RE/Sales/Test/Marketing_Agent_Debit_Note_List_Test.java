package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Marketing_Agent_Debit_Note_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Marketing_Agent_Debit_Note_List_Test extends DriverScript{

	public static Marketing_Agent_Debit_Note_List marketing_Agent_Debit_Note = null;
	@Test
	public void Request_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		marketing_Agent_Debit_Note = new Marketing_Agent_Debit_Note_List(oBrowser);
		marketing_Agent_Debit_Note.MenuSubMenu();
		
		marketing_Agent_Debit_Note.noFilter();
		marketing_Agent_Debit_Note.promotion();
	}
}
