package Utilities;
/*********************************
 * class Name	: methods.XMLUtility
 * Purpose		: to create XML file dynamically and Run
 * Author		: Sachin
 * Date Creation: 05th-August-2019
 * Example		: 
 * 
 * ******************************
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.testng.TestNG;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLUtility extends DriverScript{
	
	String className;
	Element rootElementgroups;
	/*********************************
	 * Method Name	: createXml()
	 * Purpose		: to create XML file dynamically
	 * Author		: Sachin
	 * Date Creation: 05th-August-2019
	 * Example		: createXml;
	 * 
	 * ******************************
	 */
	public  void createXml() throws Exception {

		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory
					.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			omap = datatable.GetFlaggedMethods(strController, "Sheet1", "Run");
			int totalnoofelementsflaggedtorun = omap.size();
			Element rootElementsuite = document.createElement("suite");
			Element rootElementlisener = document.createElement("listeners");
			Element childElementlisener = document.createElement("listener");
			Element rootElementtest = document.createElement("test");
			Element rootElementClass = document.createElement("classes");
			Element childelementClass = document.createElement("class");
			rootElementsuite.setAttribute("name", "in4Suite");
			rootElementtest.setAttribute("name", "testing");
			
 
			rootElementsuite.appendChild(rootElementlisener);
			rootElementlisener.appendChild(childElementlisener);
			childElementlisener.setAttribute("class-name", "methods.Reporting");
			rootElementsuite.appendChild(rootElementtest);
			rootElementtest.appendChild(rootElementClass);
			rootElementClass.appendChild(childelementClass);
			document.appendChild(rootElementsuite);
			for (int elementcounter = 1; elementcounter<= totalnoofelementsflaggedtorun; elementcounter++) {
				 String flagElement =omap.get(elementcounter).toString();
				  String classandmethod[] = flagElement.split("#");
			    if(!classandmethod[1].equals(className))
			    {
				childelementClass.setAttribute("name", classandmethod[1]);
				 rootElementgroups = document.createElement("methods");
				childelementClass.appendChild(rootElementgroups);
			    }
				String element = "include";
				Element em = document.createElement(element);
				em.setAttribute("name", classandmethod[0]);
				rootElementgroups.appendChild(em);
                className = classandmethod[1];
			}
 
			// Generate the file.
			FileWriter fstream = new FileWriter(System.getProperty("user.dir")+"\\Run.xml");
			BufferedWriter out = new BufferedWriter(fstream);
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(fstream);
			transformer.transform(source, result);
			out.close();
		} catch (DOMException e) {
			e.printStackTrace();
		}
	}
 
	/*********************************
	 * Method Name	: autoRunXml()
	 * Purpose		: to run the dyanmically created XML File
	 * Author		: Sachin
	 * Date Creation: 05th-August-2019
	 * Example		: autoRunXml;
	 * 
	 * ******************************
	 */
 
	public  void autoRunXml() {
 
		try
		{
		// Create a list
		List files = new ArrayList();
 
		// Add the required xml files to the list
		files.add(System.getProperty("user.dir")+"\\Run.xml");
 
		// create object for TestNG
		TestNG tng = new TestNG();
 
		// Add the list of files to create a suite
		tng.setTestSuites(files);
 
		// Run the suite
		tng.run();
		} catch(Exception e)
		{
			System.out.println(e);
		}
 
	}
	
	
	

	
}
