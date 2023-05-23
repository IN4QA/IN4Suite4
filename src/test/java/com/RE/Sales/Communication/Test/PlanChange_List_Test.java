package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.PlanChange_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class PlanChange_List_Test extends DriverScript{
	public static PlanChange_List PlanChange=null;
	@Test
	public static void PlanChange() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		PlanChange=new PlanChange_List(oBrowser);
		PlanChange.MenuSubMenu();
		PlanChange.nofilter();
		PlanChange.project();
	}
}