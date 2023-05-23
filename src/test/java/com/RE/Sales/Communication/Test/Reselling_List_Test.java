package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.Reselling_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Reselling_List_Test extends DriverScript{
	
	public static com.RE.Sales.Communication.ObjectRepository.Reselling_List ResellingList=null;
	@Test
	public static void Resellinglist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		ResellingList=new Reselling_List(oBrowser);
		ResellingList.MenuSubMenu();
		ResellingList.nofilter();
		ResellingList.project();
	}
	

}
