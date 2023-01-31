package com.RE.Engineering.Test;


import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Indent_List_Test extends DriverScript
{
	public static com.RE.Engineering.ObjectRepository.Indent_List Indent_ListObj = null;
	
	@Test
	public  void Indent_List() throws Throwable
	{
		try
		{
						
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			Indent_ListObj = new com.RE.Engineering.ObjectRepository.Indent_List(oBrowser);

						
				Indent_ListObj.MenuSubMenu();
				Indent_ListObj.UnfullfilledPOTO();
			    //Indent_ListObj.Unfullfilledissue();
			    //Indent_ListObj.All();
				//Indent_ListObj.SubProject(rownum);
				//Indent_ListObj.Status(rownum);
				//Indent_ListObj.Contractor(rownum);
				//Indent_ListObj.Date(rownum);
				//Indent_ListObj.WorkCategory(rownum);
				//Indent_ListObj.TypeOfIndent(rownum);
				//Indent_ListObj.Debitable();
				//Indent_ListObj.MaterialType(rownum);
				//Indent_ListObj.MaterialSubType(rownum);
				//Indent_ListObj.Material(rownum);
				//Indent_ListObj.FullfilledPOTO(rownum);
				//Indent_ListObj.FulfilledIssue(rownum);
				  
//			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}