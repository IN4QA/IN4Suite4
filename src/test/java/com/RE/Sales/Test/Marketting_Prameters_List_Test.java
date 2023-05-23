package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Marketting_Prameters_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Marketting_Prameters_List parameterslist=null;
	@Test
	
	public void ParametersList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();	
		login.loginTest();
		
		parameterslist=new com.RE.Sales.ObjectRepository.Marketting_Prameters_List(oBrowser);
		parameterslist.MenuSubMenu();
		parameterslist.nofilters();
		
	}

}
