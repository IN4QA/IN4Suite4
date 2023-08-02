package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Consultant_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.Consultant_List consultantlist = null;


	@Test
	public void consultantlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		consultantlist = new com.RE.Engineering_Masters.ObjectRepository.Consultant_List(oBrowser);
	
		
		consultantlist.MenuSubMenu();
		consultantlist.Go();
		consultantlist.status();
	
	}
}