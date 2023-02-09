package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Ropo_List_Test extends DriverScript{
	public static com.RE.Engineering.ObjectRepository.Ropo_List RopoList=null;
	@Test

	public void RopoList() throws Throwable {
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		RopoList = new com.RE.Engineering.ObjectRepository.Ropo_List(oBrowser);
		
		RopoList.MenuSubMenu();
		RopoList.ropoproject();
		RopoList.ropomaterial();
	}
}