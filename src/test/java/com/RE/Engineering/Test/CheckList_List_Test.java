package com.RE.Engineering.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class CheckList_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.CheckList_List checklist = null;

	@Test
	public void checkListPage() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		checklist = new com.RE.Engineering.ObjectRepository.CheckList_List(oBrowser);
		
		checklist.MenuSubMenu();
		checklist.mandatoryfilters();
	}
}