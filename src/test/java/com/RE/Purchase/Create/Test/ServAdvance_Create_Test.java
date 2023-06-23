package com.RE.Purchase.Create.Test;

import com.RE.Purchase.Create.ObjectRepository.ServAdvance_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServAdvance_Create_Test extends DriverScript{
	
	public static ServAdvance_Create servAdvancecreate=null;
	
	public void ServiceAdvanceCreate() {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
	}

}
