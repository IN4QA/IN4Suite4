package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.Pur_Transaction_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_Transaction_Create_Test extends DriverScript{
	
public static Pur_Transaction_Create PurchaseTransaction=null;
@Test
public void PurchaseTransactionCreate() throws Throwable{
	
	FullApplicationTestScripts login=new FullApplicationTestScripts();
	login.loginTest();
	PurchaseTransaction=new Pur_Transaction_Create(oBrowser);
	PurchaseTransaction.MenuSubMenuIndent();
	PurchaseTransaction.Indent();
	PurchaseTransaction.MenuSubMenuPO();
	PurchaseTransaction.PurchaseOrder();
	PurchaseTransaction.MenuSubMenuGRN();
	PurchaseTransaction.GRN();
	
}
}
