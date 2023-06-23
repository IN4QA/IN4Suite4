package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;
import com.RE.Purchase.Create.ObjectRepository.SuppAdvance_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SuppAdvance_Create_Test extends DriverScript{
	
	public static SuppAdvance_Create Createsuppadvance=null;
	@Test
	public void CreateSuppAdvance() throws Throwable{
	
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		Createsuppadvance=new SuppAdvance_Create(oBrowser);
		Createsuppadvance.MenuSubMenu();
		Createsuppadvance.CreateSuppAdvanace();
	}
}
