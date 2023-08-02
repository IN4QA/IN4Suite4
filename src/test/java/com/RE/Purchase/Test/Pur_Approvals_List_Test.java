package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.ObjectRepository.Pur_Approvals_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_Approvals_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.Pur_Approvals_List approvalslist = null;

	@Test
	public void ApprovalsList() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			approvalslist = new com.RE.Purchase.ObjectRepository.Pur_Approvals_List(oBrowser);
			approvalslist.MainSubmenu();
			approvalslist.PurchaseOrder();
			approvalslist.ROPOMapping();
			approvalslist.Quotaion();
			approvalslist.TransferOrder();
			approvalslist.RateCmparision();
			approvalslist.MaterialSales();
			approvalslist.MaterialSalesReceipt();
			approvalslist.SuppCertificates();
			approvalslist.SuppAdvances();
			approvalslist.SuppDN();
			approvalslist.SuppDNReceipt();
			approvalslist.SuppDNWaiveOff();
			approvalslist.SuppMaster();
			approvalslist.ServCertificates();
			approvalslist.ServAdvances();
			approvalslist.ServDN();
			approvalslist.ServDNReceipt();
			approvalslist.ServiceProvider();
			approvalslist.POTermination();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
