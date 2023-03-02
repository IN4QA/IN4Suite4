package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class MBookAbstract_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.MBookAbstract_List MbookAbstractlist = null;

	@Test
	public void MbookAbstList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		MbookAbstractlist = new com.RE.Engineering.ObjectRepository.MBookAbstract_List(oBrowser);
		
		MbookAbstractlist.MenuSubMenu();
		MbookAbstractlist.Go();
	}
}
 		