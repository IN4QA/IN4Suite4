package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Tendering_TenderDoc_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_TenderDocument_List TenderDoc = null;

	@Test
	public void tenderdocument() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		TenderDoc = new com.RE.Engineering.ObjectRepository.Tendering_TenderDocument_List(oBrowser);
		
		TenderDoc.MenuSubMenu();
		TenderDoc.go();
		TenderDoc.project();
	}
}
 	