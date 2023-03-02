package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class DPREquipment_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.DPREquipment_List equplist = null;

	@Test
	public void equipmentlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		equplist = new com.RE.Engineering.ObjectRepository.DPREquipment_List(oBrowser);
		
		equplist.MenuSubMenu();
		equplist.Go();
		equplist.project();
		equplist.projectwithdate();
	}
}
 		