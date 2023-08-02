package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.MaterialMaster_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class MaterialMasters_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.MaterialMaster_List materiallist = null;

	@Test
	public void materialmasterlist() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			materiallist = new com.RE.Purchase.ObjectRepository.MaterialMaster_List(oBrowser);
			MaterialMaster_List.MainSubmenu();
			MaterialMaster_List.go();
			MaterialMaster_List.materialtype();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
