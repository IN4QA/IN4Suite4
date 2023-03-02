package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AssetType_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.AssetType_List assettypelist = null;

	@Test
	public void AssetTypeList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		assettypelist = new com.RE.Engineering_Masters.ObjectRepository.AssetType_List(oBrowser);
		
		assettypelist.MenuSubMenu();
		assettypelist.Go();
		//assettypelist.assetgrouptypeDD();
	}
}