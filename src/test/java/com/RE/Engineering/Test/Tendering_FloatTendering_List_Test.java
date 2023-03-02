package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_FloatTendering_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_FloatTendering_List FloatTendering = null;

	@Test
	public void FloatTendering() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		FloatTendering = new com.RE.Engineering.ObjectRepository.Tendering_FloatTendering_List(oBrowser);
		
		FloatTendering.MenuSubMenu();
		FloatTendering.project();
	}
}