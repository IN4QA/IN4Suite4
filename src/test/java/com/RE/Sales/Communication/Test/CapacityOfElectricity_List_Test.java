package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;


import com.RE.Sales.Communication.ObjectRepository.CapacityOfElectricity_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class CapacityOfElectricity_List_Test extends DriverScript{

	public static com.RE.Sales.Communication.ObjectRepository.CapacityOfElectricity_List CapacityOfElectricityList=null;
	@Test
	public static void CapacityOfElectricitylist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		CapacityOfElectricityList=new CapacityOfElectricity_List(oBrowser);
		CapacityOfElectricityList.MenuSubMenu();
		CapacityOfElectricityList.nofilter();
		CapacityOfElectricityList.project();
}
}