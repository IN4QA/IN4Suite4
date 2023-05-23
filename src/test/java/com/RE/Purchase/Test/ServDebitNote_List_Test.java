package com.RE.Purchase.Test;

import Utilities.DriverScript;
import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.ServDebitNote_List;

import MenuClick.FullApplicationTestScripts;

public class ServDebitNote_List_Test extends DriverScript {
	public static com.RE.Purchase.ObjectRepository.ServDebitNote_List ServDebitNoteList = null;
	@Test
			
	public void servdebitnote() throws Throwable {
		FullApplicationTestScripts login= new FullApplicationTestScripts();
		login.loginTest();
		ServDebitNoteList=new com.RE.Purchase.ObjectRepository.ServDebitNote_List(oBrowser);
		ServDebitNoteList.MenuSubMenu();
		ServDebitNoteList.company();
		ServDebitNoteList.companywithproject();
	}

}
