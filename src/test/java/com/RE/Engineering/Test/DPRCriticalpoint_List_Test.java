package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class DPRCriticalpoint_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.DPRCriticalpoint_List criticalpointlist = null;

	@Test
	public void checkpointList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		criticalpointlist = new com.RE.Engineering.ObjectRepository.DPRCriticalpoint_List(oBrowser);
		
		criticalpointlist.MenuSubMenu();
		criticalpointlist.Go();
		criticalpointlist.project();
		criticalpointlist.projectwithdate();
	}
}
 		