package Utilities;

import org.testng.TestNG;

import com.RE.Engineering.Test.GRN_List_Test;

public class Executer {
	
	public static TestNG testng;
	public static void main(String[] args) {
		
		// TestNG Object
		testng = new TestNG();
		// Enter the class name for which the JAR file has to be created
		testng.setTestClasses(new Class[] {GRN_List_Test.class});
		testng.run();
	}


}
