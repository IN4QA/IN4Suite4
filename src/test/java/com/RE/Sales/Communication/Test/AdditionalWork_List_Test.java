package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Communication.ObjectRepository.AdditionalWork_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AdditionalWork_List_Test extends DriverScript{

	
	public static com.RE.Sales.Communication.ObjectRepository.AdditionalWork_List AdditionalWorkList=null;
	@Test
	
		public static void AdditionalWork_List() throws Throwable{
			FullApplicationTestScripts login= new FullApplicationTestScripts();
			login.loginTest();
			AdditionalWorkList=new AdditionalWork_List(oBrowser);
			AdditionalWorkList.MenuSubMenu();
			AdditionalWorkList.nofilter();
			AdditionalWorkList.project();
}
}