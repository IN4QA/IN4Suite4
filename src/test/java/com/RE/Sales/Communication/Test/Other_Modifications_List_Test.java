package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.Other_Modifications_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Other_Modifications_List_Test extends DriverScript {
	
	public static com.RE.Sales.Communication.ObjectRepository.Other_Modifications_List modificationslist=null;
	@Test
	
		public static void ModificationsList() throws Throwable{
			FullApplicationTestScripts login= new FullApplicationTestScripts();
			login.loginTest();
			modificationslist=new Other_Modifications_List(oBrowser);
			modificationslist.MenuSubMenu();
			modificationslist.nofilter();
			modificationslist.project();
			
		}
}
