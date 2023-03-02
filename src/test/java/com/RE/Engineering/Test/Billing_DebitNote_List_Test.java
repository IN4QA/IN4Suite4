package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.ObjectRepository.Billing_DebitNote_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Billing_DebitNote_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_DebitNote_List DebitNote = null;

	@Test
	public void DebitNoteList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		DebitNote = new com.RE.Engineering.ObjectRepository.Billing_DebitNote_List(oBrowser);
		
		DebitNote.MenuSubMenu();
		DebitNote.project();
		DebitNote.projectandsubproject();
	}
}
 		