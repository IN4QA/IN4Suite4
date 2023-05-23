package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.SoldHouse_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SoldHouse_List_Test extends DriverScript{

	public static com.RE.Sales.Communication.ObjectRepository.SoldHouse_List SoldHouseList=null;
	@Test
	public static void SoldHouselist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SoldHouseList=new SoldHouse_List(oBrowser);
		SoldHouseList.MenuSubMenu();
		SoldHouseList.projectwithsubproject();
	}
}
