package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Tendering_ExpOfInter_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_ExpOfInter_List EOI = null;

	@Test
	public void Expofinterest() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		EOI = new com.RE.Engineering.ObjectRepository.Tendering_ExpOfInter_List(oBrowser);
		
		EOI.MenuSubMenu();
		EOI.go();
		//EOI.project();
	}
}
 	