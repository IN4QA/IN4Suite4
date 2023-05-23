package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.ThumbPrint_Request_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ThumbPrint_Request_List_Test extends DriverScript{
	
	public static com.RE.Sales.Communication.ObjectRepository.ThumbPrint_Request_List ThumbPrintRequestList=null;
	@Test
	public static void ThumbPrintRequest() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		ThumbPrintRequestList=new ThumbPrint_Request_List(oBrowser);
		ThumbPrintRequestList.MenuSubMenu();
		ThumbPrintRequestList.nofilter();
		ThumbPrintRequestList.project();
	}
}
