package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class LabourCountMapping_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.LabourCountMapping_List labourcountmaplist=null;
	
	@Test
	public void labourCountMap() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		labourcountmaplist=new com.RE.Engineering.ObjectRepository.LabourCountMapping_List(oBrowser);
		
		labourcountmaplist.MenuSubMenu();
		labourcountmaplist.projectfilter();
		labourcountmaplist.subprojectfilter();
		
	}

}
