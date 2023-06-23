package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.*;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Indent_Create_Test extends DriverScript{

	public static Indent_Create IndentCreate = null;

	@Test
	public void LeadsCreateTest() throws Throwable {

		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		IndentCreate = new Indent_Create(oBrowser);
		IndentCreate.MenuSubMenu();
		IndentCreate.createIndent();
	}
}
