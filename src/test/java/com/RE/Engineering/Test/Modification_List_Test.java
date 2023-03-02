package com.RE.Engineering.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Modification_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Modification_List modificationlist = null;

	@Test
	public void modificationList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		modificationlist = new com.RE.Engineering.ObjectRepository.Modification_List(oBrowser);
		
		modificationlist.MenuSubMenu();
		modificationlist.projectandsubproject();
		modificationlist.mandatorywithstatus();
	}
}