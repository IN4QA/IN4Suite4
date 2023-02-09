package com.RE.Purchase.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SupAdvance_List_Test extends DriverScript{

	public static com.RE.Purchase.ObjectRepository.SupAdvance_List SuppAdvaList=null;
	@Test

	public void SupAdvList() throws Throwable{
		MenuClick.FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SuppAdvaList=new com.RE.Purchase.ObjectRepository.SupAdvance_List(oBrowser);
		
		SuppAdvaList.MenuSubMenu();
		SuppAdvaList.company();	
		SuppAdvaList.project();
		
	}
	
	
}

//Total Records count is not listing in the first page so that pagecount method is not working 
