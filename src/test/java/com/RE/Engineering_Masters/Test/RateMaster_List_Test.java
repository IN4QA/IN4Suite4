package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class RateMaster_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.RateMaster_List ratemasterlist = null;

	@Test
	public void rateMasterList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		ratemasterlist = new com.RE.Engineering_Masters.ObjectRepository.RateMaster_List(oBrowser);
		
		ratemasterlist.MenuSubMenu();
		ratemasterlist.mandatoryfilters();
	}
}