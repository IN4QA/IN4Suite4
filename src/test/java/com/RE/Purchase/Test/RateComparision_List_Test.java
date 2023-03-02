package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class RateComparision_List_Test extends DriverScript{
	
  public static com.RE.Purchase.ObjectRepository.RateComparision_List ratecomparisionlist=null;
  
  @Test

public void RateComparisionList() throws Throwable{
	FullApplicationTestScripts login=new FullApplicationTestScripts();
	login.loginTest();
	ratecomparisionlist=new com.RE.Purchase.ObjectRepository.RateComparision_List(oBrowser);
	
	ratecomparisionlist.MenuSubMenu();
	ratecomparisionlist.go();
	ratecomparisionlist.company();
	ratecomparisionlist.companywithproject();
}
}
