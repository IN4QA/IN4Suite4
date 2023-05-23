package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.Pur_SupplierMaster_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_SupplierMaster_Create_Test extends DriverScript{

	public static Pur_SupplierMaster_Create SupplierCreate=null;
	@Test
	
	public void SupplierCreate() throws Throwable{
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SupplierCreate=new Pur_SupplierMaster_Create(oBrowser);
		SupplierCreate.MainSubmenu();
		SupplierCreate.CreateSupplier();
	}
	

}
