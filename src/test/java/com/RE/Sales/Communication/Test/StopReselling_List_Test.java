package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.StopReselling_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class StopReselling_List_Test extends DriverScript{

	public static com.RE.Sales.Communication.ObjectRepository.StopReselling_List StopResellingList=null;
	@Test
	public static void StopResellingList() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		StopResellingList=new StopReselling_List(oBrowser);
		StopResellingList.MenuSubMenu();
		StopResellingList.nofilter();
		StopResellingList.project();
	}

}
