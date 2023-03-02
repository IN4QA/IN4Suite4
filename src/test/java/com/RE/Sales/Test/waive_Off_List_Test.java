package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.waive_Off_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class waive_Off_List_Test extends DriverScript{

	public static waive_Off_List waiveOffNote = null;
	@Test
	public void waive_Off() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		waiveOffNote = new waive_Off_List(oBrowser);
		waiveOffNote.MenuSubMenu();
		
		waiveOffNote.noFilter();
		waiveOffNote.project();
	}
}
