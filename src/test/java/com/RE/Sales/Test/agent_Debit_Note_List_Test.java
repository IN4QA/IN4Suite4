package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.agent_Debit_Note_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class agent_Debit_Note_List_Test extends DriverScript{

	public static agent_Debit_Note_List ADebitNote = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		ADebitNote = new agent_Debit_Note_List(oBrowser);
		ADebitNote.MenuSubMenu();
		
		ADebitNote.noFilter();
		ADebitNote.project();
	}
}

