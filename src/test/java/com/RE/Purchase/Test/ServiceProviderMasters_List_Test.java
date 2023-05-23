package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.ServiceProviderMasters_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServiceProviderMasters_List_Test extends DriverScript{
public static com.RE.Purchase.ObjectRepository.ServiceProviderMasters_List serviceproviderlist=null;
	@Test
	public void ServiceProviderList() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		serviceproviderlist=new com.RE.Purchase.ObjectRepository.ServiceProviderMasters_List(oBrowser);
		serviceproviderlist.MenuSubMenu();
		serviceproviderlist.nofilter();
		//serviceproviderlist.getstatus();
	}

}
