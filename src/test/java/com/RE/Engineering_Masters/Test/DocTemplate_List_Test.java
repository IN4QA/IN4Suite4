package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class DocTemplate_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.DocTemplate_List DocTemplate = null;

	@Test
	public  void AssetList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		DocTemplate = new com.RE.Engineering_Masters.ObjectRepository.DocTemplate_List(oBrowser);
		
		DocTemplate.MenuSubMenu();
		DocTemplate.mandatoryfilters();
		
	}
}