package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.NameChange_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class NameChange_List_Test  extends DriverScript {
	
	public static NameChange_List NameChangeList=null;
	@Test
	public static void UnitChangelist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		NameChangeList=new NameChange_List(oBrowser);
		NameChangeList.MenuSubMenu();
		NameChangeList.nofilter();
		NameChangeList.project();
	}
}
