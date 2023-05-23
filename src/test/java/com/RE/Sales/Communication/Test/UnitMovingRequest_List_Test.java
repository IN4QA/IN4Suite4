package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.UnitMovingRequest_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class UnitMovingRequest_List_Test extends DriverScript{
	public static UnitMovingRequest_List UnitMovingRequest=null;
	@Test
	public static void unitmovingrequest() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		UnitMovingRequest=new UnitMovingRequest_List(oBrowser);
		UnitMovingRequest.MenuSubMenu();
		UnitMovingRequest.nofilter();
		UnitMovingRequest.project();
	}
}
