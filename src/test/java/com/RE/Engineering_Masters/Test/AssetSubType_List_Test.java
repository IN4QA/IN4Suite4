package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AssetSubType_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.AssetSubType_List assetsubtypelist = null;

	@Test
	public void AssetSubTypeList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		assetsubtypelist = new com.RE.Engineering_Masters.ObjectRepository.AssetSubType_List(oBrowser);
		
		assetsubtypelist.MenuSubMenu();
		assetsubtypelist.Go();
		//assetsubtypelist.assetgrouptypeDD();
	}
}