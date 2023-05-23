package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.SalesApprovals_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SalesApprovals_List_Test extends DriverScript{
	
 public static SalesApprovals_List SalesApprovalsList=null;
	@Test
	public void SalesApprovals() throws Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SalesApprovalsList=new com.RE.Sales.ObjectRepository.SalesApprovals_List(oBrowser);
		SalesApprovalsList. MenuSubMenu();
		SalesApprovalsList.Quotations();
		SalesApprovalsList.CleanHouse();
		SalesApprovalsList.TransferUnit();
		SalesApprovalsList.PromotionAgent();
		SalesApprovalsList.Bookings();
		SalesApprovalsList.SaleableStock();
		SalesApprovalsList.SalesAgent();
		SalesApprovalsList.BulkChargeChange();
		SalesApprovalsList.BlockedUnits();
		SalesApprovalsList.UnitMoving();
		SalesApprovalsList.StandardModification();
		SalesApprovalsList.SolicitorMaster();
		SalesApprovalsList.LoanApplication();
		SalesApprovalsList.PaymentReceipts();
		SalesApprovalsList.SalesAgentReceipt();
		SalesApprovalsList.AdministrativeReceipts();
		SalesApprovalsList.TemporaryReceipts();
		SalesApprovalsList.CustomerRequest();
		SalesApprovalsList.CompanyDNReceipt();
		SalesApprovalsList.SolicitorReceipts();
		SalesApprovalsList.SalesPayments();
		SalesApprovalsList.AdvancePayments();
		SalesApprovalsList.CustomerCreditNote();
		SalesApprovalsList.Paymentsagentcreditnote();
		SalesApprovalsList.CustomerDebittNote();
		SalesApprovalsList.AgentDebittNote(); 
		SalesApprovalsList.InterestWaiveOff();
		SalesApprovalsList.DirectIntWaiveOff();
		SalesApprovalsList.CompanyPayment();
		SalesApprovalsList.SDRPayment(); 
		SalesApprovalsList.PromotionBudget();
		SalesApprovalsList.PromotionRequest();
		SalesApprovalsList.PromotionPayments();
		SalesApprovalsList.MarkettingAgentDebitNote();
		SalesApprovalsList.AgentReceipt();
		SalesApprovalsList.AgentCreditNote();
		SalesApprovalsList.NoDueCertificates();
		 
	}
}
