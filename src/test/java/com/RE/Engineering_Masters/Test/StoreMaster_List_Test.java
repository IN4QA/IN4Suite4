package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;

import com.RE.Engineering_Masters.ObjectRepository.StoreMaster_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class StoreMaster_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.StoreMaster_List Storelist = null;

	@Test
	public void storeMasterList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Storelist = new com.RE.Engineering_Masters.ObjectRepository.StoreMaster_List(oBrowser);
		
		Storelist.MenuSubMenu();
		Storelist.Go();
		Storelist.cerCompany();
	}
}