package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.CutomerInteraction_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class CutomerInteraction_List_Test extends DriverScript{

	public static CutomerInteraction_List CutomerInteractionList=null;
	@Test
	
	public static void cutomerinteractionlist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		CutomerInteractionList=new CutomerInteraction_List(oBrowser);
		CutomerInteractionList.MenuSubMenu();
		CutomerInteractionList.nofilters();
		
	}
}
