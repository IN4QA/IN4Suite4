package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.RateComparision_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class RateComparision_List_Test extends DriverScript{
	
  public static com.RE.Purchase.ObjectRepository.RateComparision_List ratecomparisionlist=null;
  
  @Test

public void RateComparisionList() throws Throwable{
	FullApplicationTestScripts login=new FullApplicationTestScripts();
	login.loginTest();
	ratecomparisionlist=new com.RE.Purchase.ObjectRepository.RateComparision_List(oBrowser);
	
	RateComparision_List.MenuSubMenu();
	RateComparision_List.go();
	RateComparision_List.company();
	RateComparision_List.companywithproject();
}
}
