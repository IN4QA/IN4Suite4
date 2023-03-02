package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Abstract_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Abstract_List Abstractlist = null;

	@Test
	public void Abstractlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Abstractlist = new com.RE.Engineering.ObjectRepository.Abstract_List(oBrowser);
		
		Abstractlist.MenuSubMenu();
		Abstractlist.project();
		Abstractlist.projectwithstatus();
	}
}
 		