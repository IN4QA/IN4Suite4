package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;
import com.RE.Purchase.Create.ObjectRepository.ServAdvance_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServAdvance_Create_Test extends DriverScript{

	public static ServAdvance_Create servAdvancecreate=null;
	@Test
	public void ServiceAdvanceCreate() throws Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		servAdvancecreate=new ServAdvance_Create(oBrowser);
		servAdvancecreate.MenuSubMenuServiceAdvance();
		servAdvancecreate.ServiceAdvanceCreation();
	}

}
