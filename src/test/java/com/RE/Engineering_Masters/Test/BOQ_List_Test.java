package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BOQ_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.BOQ_List BOQlist=null;
	
	@Test
	
	public void BOQList() throws Throwable {
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		BOQlist=new com.RE.Engineering_Masters.ObjectRepository.BOQ_List(oBrowser);
		BOQlist.MenuSubMenu();
		BOQlist.VerifyProjectName();
		
	}

}
