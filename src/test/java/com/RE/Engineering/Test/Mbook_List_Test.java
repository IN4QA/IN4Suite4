package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Mbook_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Mbook_List Mbooklist = null;

	@Test
	public void MbookList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Mbooklist = new com.RE.Engineering.ObjectRepository.Mbook_List(oBrowser);
		
		Mbooklist.MenuSubMenu();
		Mbooklist.Go();
		Mbooklist.statusfilter();
	}
}
 		