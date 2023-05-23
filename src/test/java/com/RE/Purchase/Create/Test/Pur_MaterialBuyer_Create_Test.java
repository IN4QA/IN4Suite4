package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.Pur_MaterialBuyer_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_MaterialBuyer_Create_Test extends DriverScript{
	
	public static Pur_MaterialBuyer_Create MaterialBuyerMaster=null;
	
	@Test
	
	public void CreateMaterialBuyer() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		MaterialBuyerMaster=new Pur_MaterialBuyer_Create(oBrowser);
		MaterialBuyerMaster.MainSubmenu();
		MaterialBuyerMaster.MaterialBuyerCreation();
	}
	

}
