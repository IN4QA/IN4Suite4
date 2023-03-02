package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class DPRCubeResults_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.DPRCubeResults_List cuberesultlist = null;

	@Test
	public void cuberesult() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		cuberesultlist = new com.RE.Engineering.ObjectRepository.DPRCubeResults_List(oBrowser);
		
		cuberesultlist.MenuSubMenu();
		cuberesultlist.Go();
		cuberesultlist.project();
	}
}
 		