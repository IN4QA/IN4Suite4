package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.Quotation_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Quotation_Test_List extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.Quotation_List Quotationlist = null;

	@Test
	public void quotationlist() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			Quotationlist = new com.RE.Purchase.ObjectRepository.Quotation_List(oBrowser);
			Quotation_List.MenuSubMenu();
			Quotation_List.WithRfq();
			Quotation_List.withoutrfq();
			Quotation_List.all();
			Quotation_List.projectwithrfq();
			Quotation_List.projectwithoutrfq();
			Quotation_List.projectall();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
