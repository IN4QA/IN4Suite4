package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.Workorder_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Workorder_Create_Test extends DriverScript{

	public static Workorder_Create workordercreate = null;

	@Test
	public void WOcreate() throws Throwable {

		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		workordercreate = new Workorder_Create(oBrowser);
		workordercreate.MenuSubMenu();
		workordercreate.workordercreate();
		
	}
}
