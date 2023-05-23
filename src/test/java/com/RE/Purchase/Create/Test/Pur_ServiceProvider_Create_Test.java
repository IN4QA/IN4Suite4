package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;
import com.RE.Purchase.Create.ObjectRepository.Pur_ServiceProvider_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_ServiceProvider_Create_Test extends DriverScript{
	
	
	public static Pur_ServiceProvider_Create serviceprovidercreate=null;
	
	@Test
	
	public void CreateServiceProvider() throws Throwable{
		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		serviceprovidercreate=new Pur_ServiceProvider_Create(oBrowser);
		serviceprovidercreate.MainSubmenu();
		serviceprovidercreate.ServiceProvderCreation();
	}

}

