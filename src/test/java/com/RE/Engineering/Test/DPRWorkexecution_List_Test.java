package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class DPRWorkexecution_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.DPRWorkexecution_List executionlist = null;

	@Test
	public void executionList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		executionlist = new com.RE.Engineering.ObjectRepository.DPRWorkexecution_List(oBrowser);
		
		executionlist.MenuSubMenu();
		executionlist.Go();
		executionlist.project();
		executionlist.projectwithdate();
	}
}
 		