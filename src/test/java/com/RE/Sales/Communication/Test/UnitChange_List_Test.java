package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.UnitChange_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class UnitChange_List_Test extends DriverScript {
	
	public static UnitChange_List UnitChangeList=null;
	@Test
	public static void UnitChangelist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		UnitChangeList=new UnitChange_List(oBrowser);
		UnitChangeList.MenuSubMenu();
		UnitChangeList.nofilter();
		UnitChangeList.project();
	}

}
