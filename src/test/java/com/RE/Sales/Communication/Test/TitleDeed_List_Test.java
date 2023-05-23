package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.TitleDeed_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class TitleDeed_List_Test extends DriverScript{
	
	public static TitleDeed_List TitleDeedList=null;
	@Test
	public void TitleDeedlist() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		TitleDeedList=new TitleDeed_List(oBrowser);
		TitleDeedList.MenuSubMenu();
		TitleDeedList.nofilter();
		TitleDeedList.projectwithstatus();
	}

}
