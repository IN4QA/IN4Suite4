package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.Abstract_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Abstract_Create_Test extends DriverScript {

	
	public static Abstract_Create abstractcreate = null;

	@Test
	public void abstractcreate() throws Throwable {

		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		abstractcreate = new Abstract_Create (oBrowser);
		abstractcreate.MenuSubMenu();
		abstractcreate.abstractcreate(); //entering of backdate in input excel mandatory
		}
	
	
}
