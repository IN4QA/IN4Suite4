package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.ObjectRepository.MaterialReco_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class MaterialReco_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.MaterialReco_List MaterialReco = null;

	@Test
	public void MaterialReco() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		MaterialReco = new com.RE.Engineering.ObjectRepository.MaterialReco_List(oBrowser);
		
		MaterialReco.MenuSubMenu();
		MaterialReco.company();
		MaterialReco.companywithstore();
		
	
	}
}

