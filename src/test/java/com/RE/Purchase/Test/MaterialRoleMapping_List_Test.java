package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class MaterialRoleMapping_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.MaterialRoleMapping_List materialrolemappinglist = null;

	@Test
	public void materialbuyer() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			materialrolemappinglist = new com.RE.Purchase.ObjectRepository.MaterialRoleMapping_List(oBrowser);
			materialrolemappinglist.MainSubmenu();
			materialrolemappinglist.go();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
