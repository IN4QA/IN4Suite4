package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.StoreMaster_Create;
import com.RE.Purchase.Create.ObjectRepository.Pur_MaterialBuyer_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class StoreMaster_Create_Test extends DriverScript{
	
	public static StoreMaster_Create StoreMaster=null;
	@Test
	public void StoreCreation() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		StoreMaster=new StoreMaster_Create(oBrowser);
		StoreMaster.MenuSubMenu();		
		StoreMaster.CreateStoreMaster();
	}
	
}
