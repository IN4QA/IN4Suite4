package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_LabourAdvance_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_LabourAdvance_List labouradvancelist=null;
	
	@Test
	public void labourAdvance() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		labouradvancelist=new com.RE.Engineering.ObjectRepository.Billing_LabourAdvance_List(oBrowser);
		
		labouradvancelist.MenuSubMenu();
		labouradvancelist.nofilters();
		labouradvancelist.projectfilter();
		labouradvancelist.subprojectfilter();
		
	}

}
