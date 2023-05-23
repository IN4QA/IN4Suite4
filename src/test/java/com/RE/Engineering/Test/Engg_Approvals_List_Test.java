package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.ObjectRepository.Engg_Approvals_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Engg_Approvals_List_Test extends DriverScript{
	
 public static Engg_Approvals_List EnggApprovalsList=null;
	@Test
	public void EnggApprolasList() throws Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		EnggApprovalsList=new com.RE.Engineering.ObjectRepository.Engg_Approvals_List(oBrowser);
		EnggApprovalsList.MainSubmenu();
		EnggApprovalsList.Contractor();
		EnggApprovalsList.Consultant();
		EnggApprovalsList.Contarcting_Client();
		EnggApprovalsList.ConttractorWO();
		EnggApprovalsList.ConsultantWO();
		EnggApprovalsList.InternalWO();
		EnggApprovalsList.LabourWO();
		EnggApprovalsList.EnggAbstract();
		EnggApprovalsList.Indent();
		EnggApprovalsList.ServiceIndent();
		EnggApprovalsList.GRN();
		EnggApprovalsList.IssueInventory();
		EnggApprovalsList.ReturnInventory();
		EnggApprovalsList.TransferOrder();
		EnggApprovalsList.GatePass();
		EnggApprovalsList.WorkOrderPayments();
		EnggApprovalsList.Misc_Expenses();
		EnggApprovalsList.Advances();
		EnggApprovalsList.DebitNote();
		EnggApprovalsList.DebitNoteReceipt();
		EnggApprovalsList.LabourPayment();
		EnggApprovalsList.DPRLabourAdvance();
		EnggApprovalsList.WorkCategoryBudget();
		EnggApprovalsList.MaterialBudget();
		EnggApprovalsList.ContractingOrder();
		EnggApprovalsList.Invoice();
		EnggApprovalsList.AdvanceInvoices();
		EnggApprovalsList.Receipt();
		EnggApprovalsList.CreditNote();
		EnggApprovalsList.CoAbstract();
		EnggApprovalsList.ContractorWOTermination();
		EnggApprovalsList.ConsultantWOTermination();
		EnggApprovalsList.InternalWOTermination();
		EnggApprovalsList.LabourWOTermination();
		EnggApprovalsList.POTermination();
		EnggApprovalsList.ModificationTermination();
		EnggApprovalsList.TenderDocument();
		EnggApprovalsList.TenderEstimate();
		EnggApprovalsList.TenderReceipt();
		EnggApprovalsList.FloatTender();
		EnggApprovalsList.TenderingRateComparision();
		
		}
}
