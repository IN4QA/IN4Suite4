package com.RE.Purchase.Test;

import Utilities.DriverScript;
import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;



public class SupDebitNote_List_Test extends DriverScript{
	public static com.RE.Purchase.ObjectRepository.SupDebitNote_List SupDebitNote=null;
	
	@Test
	public void suppdebitnote() throws Throwable{
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SupDebitNote=new com.RE.Purchase.ObjectRepository.SupDebitNote_List(oBrowser);
		SupDebitNote.MenuSubMenu();
		SupDebitNote.company();
		SupDebitNote.project();
	}

}
