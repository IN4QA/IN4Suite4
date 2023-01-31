package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class ServiceIndent_List_Test extends DriverScript{

	public static com.RE.Engineering.ObjectRepository.ServiceIndent_List Ser_List = null;
	
	@Test
	public void serviceIndents() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Ser_List = new com.RE.Engineering.ObjectRepository.ServiceIndent_List(oBrowser);
		
		Ser_List.MenuSubMenu();
		Ser_List.fulfilled();
		Ser_List.unfulfilled();
		Ser_List.all();
		
	}
}
