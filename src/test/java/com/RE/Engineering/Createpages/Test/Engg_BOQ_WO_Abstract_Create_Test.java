package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.Engg_BOQ_WO_Abstract_Create;
import com.RE.Purchase.Create.ObjectRepository.Pur_Transaction_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Engg_BOQ_WO_Abstract_Create_Test extends DriverScript {

	public static Engg_BOQ_WO_Abstract_Create EnggTransaction=null;
	
	@Test
	public void EnggTransactionCreate() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		EnggTransaction=new Engg_BOQ_WO_Abstract_Create(oBrowser);
		EnggTransaction.MenuSubMenuBOQ();
		EnggTransaction.BOQCreate();
		EnggTransaction.MenuSubMenuWorkOrder();
		EnggTransaction.workordercreate();
		EnggTransaction.MenuSubMenuAbstract();
		EnggTransaction.abstractcreate();
		
	}
	}
