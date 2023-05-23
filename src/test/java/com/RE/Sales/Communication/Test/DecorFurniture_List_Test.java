package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.DecorFurniture_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class DecorFurniture_List_Test extends DriverScript{
	
	
	public static com.RE.Sales.Communication.ObjectRepository.DecorFurniture_List DecorFurnitureList=null;
	@Test
	
		public static void DecorFurniture() throws Throwable{
			FullApplicationTestScripts login= new FullApplicationTestScripts();
			login.loginTest();
			DecorFurnitureList=new DecorFurniture_List(oBrowser);
			DecorFurnitureList.MenuSubMenu();
			DecorFurnitureList.nofilter();
			DecorFurnitureList.project();
}
}
