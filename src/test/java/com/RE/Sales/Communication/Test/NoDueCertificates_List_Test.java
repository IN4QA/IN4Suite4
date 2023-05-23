package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.NoDueCertificates_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class NoDueCertificates_List_Test extends DriverScript{
	
	public static NoDueCertificates_List NoDueCertificatesList=null;
	@Test
	public static void NoDuecertificateslist() throws Throwable{
		FullApplicationTestScripts login1=new FullApplicationTestScripts();
		login1.loginTest();
		NoDueCertificatesList=new NoDueCertificates_List(oBrowser);
		NoDueCertificatesList.MenuSubMenu();
		NoDueCertificatesList.nofilter();
		NoDueCertificatesList.projectwithdate();
		}

}
