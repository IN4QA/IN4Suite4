package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Asset_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.Asset_List assetlist = null;

	@Test
	public  void AssetList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		assetlist = new com.RE.Engineering_Masters.ObjectRepository.Asset_List(oBrowser);
		
		assetlist.MenuSubMenu();
		assetlist.Go();
		//assetlist.assetgrouptypeDD();
	}
}