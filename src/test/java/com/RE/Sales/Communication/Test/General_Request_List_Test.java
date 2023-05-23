package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.General_Request_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class General_Request_List_Test extends DriverScript{

	public static com.RE.Sales.Communication.ObjectRepository.General_Request_List GeneralRequestList=null;
	@Test
	public static void GeneralRequestlist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		GeneralRequestList=new General_Request_List(oBrowser);
		GeneralRequestList.MenuSubMenu();
		GeneralRequestList.nofilter();
		GeneralRequestList.project();
	}
}