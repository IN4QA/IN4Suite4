package MenuClick;

import java.awt.Button;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverScript;
import Utilities.Frames;

public class PageCrash extends DriverScript {
	
	WebDriver ldriver;
	public PageCrash(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="td")
	private List<WebElement>  mainMenu;
	public  List<WebElement> getMainMenu()
	{
		return mainMenu;
	}
	@FindBy(xpath = "//a[@id='defTab']")
	private List<WebElement>  subMenu;
	public  List<WebElement> getsubMenu()
	{
		return subMenu;
	}
	 
	@FindBy(css= "a")
	private List<WebElement>  leftMenu;
	public  List<WebElement> getLeftLink()
	{
		return leftMenu;
	}
	@FindBy(css="td")
	private List<WebElement>  tabMenu;
	public  List<WebElement> gettabLink()
	{
		return tabMenu;
	}
	
	//Original method
/*	public String clickOnSubMenu()
	{
		WebElement oEL = null;
		String strStatus="";
		int i=1;
	    try
	    {Frames.SubMenuFrame();
	    	Iterator<WebElement> subMenu = getsubMenu().iterator();
	    	while(subMenu.hasNext())
	    	{
	    		oEL = subMenu.next();
	    		 Frames.SubMenuFrame();
 				
	    		if(appInd.isStale(oEL))
	    		{
	    			try
	    			{
	    				oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/a["+i+"]"));
	    				appInd.isStale(oEL);
	    				appInd.isAlertPresent();
	    			

	    			} catch(Exception e)
	    			{
	    				
	    			};
	    			
	    		}
	    		if(Frames.mainFrame());
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				} 
						//	leftframe
	    		if(Frames.leftDiv())
	    		{
	    			strStatus+=clickOnLeftLing();
	    		}
	    		i++;
	    	} i=1;
	    	return strStatus;
	    } catch(Exception e)
	    {
	    	return null;
	    }
		
	}
	*/
	//dummy
	public String clickOnSubMenu()
	{
		WebElement oEL = null;
		String strStatus="";
		int i=1;
	    try
	    {Frames.SubMenuFrame();
	    	Iterator<WebElement> subMenu = getsubMenu().iterator();
	    	while(subMenu.hasNext())
	    	{
	    		oEL = subMenu.next();
	    		 Frames.SubMenuFrame();
 				
	    		if(appInd.isStale(oEL))
	    		{
	    			try
	    			{
	    				oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/a["+i+"]"));
	    				appInd.isStale(oEL);
	    				appInd.isAlertPresent();
	    				if(Frames.leftDiv())
	    	    		{
	    	    			strStatus+=clickOnLeftLing();
	    	    		}

	    			} catch(Exception e)
	    			{
	    				
	    			};
	    			
	    		}
	    		if(Frames.mainFrame());
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				} 
						//	leftframe
				// original if(Frames.leftDiv())
				if(Frames.leftDiv())
	    		{
	    			strStatus+=clickOnLeftLing();
	    		}
	    		i++;
	    	} i=1;
	    	return strStatus;
	    } catch(Exception e)
	    {
	    	return null;
	    }
		
	}
	
	
	
	
	

	
	//Original method
	/*		
	public  String clickOnLeftLing()
	{
		WebElement oEL = null;
		String strStatus= "";
		int i=1;
		try
				//leftFrame()
		{ Frames.leftDiv();
			List<WebElement> olist = getLeftLink();
			//changing iterator
			//Iterator<WebElement> subMenu = getsubMenu().iterator();
			
			Iterator<WebElement> leftLink = olist.subList(1, olist.size()).iterator();
			
			
			while(leftLink.hasNext())
			{
				 oEL = leftLink.next();	
				 		//leftFrame
				 Frames.leftDiv();
				
				if(appInd.isStale(oEL))
				{
					try
	    			{
						
						oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td/a"));
						//oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td[3]/a"));		
						w2.until(ExpectedConditions.elementToBeClickable(oEL));
	    				appInd.isStale(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e) {};
				}
				if(Frames.rightFrame())
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
					if(Frames.tabFrame())
					{
						strStatus+=clickOntabMenu();
					}
				}
				i++;
			} i=1;
			return strStatus;
		} catch(Exception e)
		{
			return null;
		}	}
	*/
	//NEW Method 1 
	/*
	public String clickOnLeftLing()
	{
		WebElement oEL = null;
		String strStatus="";
		int i=1;
	    try
	    
	    {//Frames.leftDiv();
	    	//Iterator<WebElement> leftMenu = getLeftLink().iterator();
	    	
	    	List<WebElement> olist = oBrowser.findElements(By.tagName("a"));
	    	
	    	for (WebElement allLinks : olist) {
	    		allLinks = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a"));
				
				//appInd.isStale(oEL);
				//appInd.isAlertPresent();
				allLinks.click();
			}
	    	
	    	
	    	
//	    	Iterator<WebElement> leftLink = olist.subList(1, olist.size()).iterator();
//	    	while(leftLink.hasNext())
//	    	{
//	    		oEL = leftLink.next();
//	    		 Frames.leftDiv();
//	    		if(appInd.isStale(oEL))
//	    		{
//	    			try
//	    			{
//	    				//oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form"));
//	    				oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td/a"));
//	    				
//	    				appInd.isStale(oEL);
//	    				appInd.isAlertPresent();
//	    				oEL.click();
//	    			
//	    				//calling components
//	    				PageCrash p=new PageCrash(oBrowser);
//	    				p.clickOnLeftLing();
//	    				
//	    				//adding subpath
//	    				oEL = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td/a"));
//	    				
//	    				appInd.isStale(oEL);
//	    				appInd.isAlertPresent();
//	    			} catch(Exception e)
//	    			{};
//	    			
//	    		}
	    		if(Frames.rightFrame());
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
					if(Frames.tabFrame())				
					{
						strStatus+=clickOntabMenu();
					}
				} 
					
	    		
//	    		i++;
//	    	} i=1;
	    	return strStatus;
	    } catch(Exception e)
	    {
	    	return null;
	    }
	    }
		
//	}	*/
	
//Method 2   skiping elements
	public String clickOnLeftLing()
	{
		WebElement oEL = null;
		String strStatus="";
		int i=1;
		
	//	int j=1;
	    try
	    {Frames.SubMenuFrame();
	    List<WebElement> olist =  oBrowser.findElements(By.tagName("a"));
	    	Iterator<WebElement> leftlink = olist.iterator();
	    	while(leftlink.hasNext())
	    	{
	    		
	    		oEL = leftlink.next();
	    		 Frames.SubMenuFrame();
 				
	    		 //actual if(appInd.isStale(oEL))
	    		String text = oEL.getText();
	    		System.out.println(text);
	    		String attributevalue = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/input["+i+"]")).getAttribute("value");
				System.out.println(attributevalue);
				int Actualattributevalue = Integer.parseInt(attributevalue);
				Integer Int=new Integer(Actualattributevalue);
				Integer value=1;
			//	if(Int.equals(value)) 
	  
	    		
	    	
	    			try
	    			{	
	    				//if(Int.equals(value)) 
	    				
	    					
	    				String iddiv = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/a["+i+"]/following-sibling::div[1]")).getAttribute("id");
	    				System.out.println(iddiv);
	    				List<WebElement> allLinks = oBrowser.findElements(By.xpath("//div[@id='"+iddiv+"']/form/table/tbody//a"));
	    				System.out.println(allLinks.size());
	    				if(allLinks.size()>0) {
	    				System.out.println(allLinks.size()+ "subcomponents");
	    				for(int j=1;i<allLinks.size();j++) {
	    					// String fileAddress = allLinks.get(i).getAttribute("href");
	    				
	    					 								//html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr["+j+"]/td/a
	    				//   								html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a
	    				//oEL=oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/div/form/table/tbody/tr/td/table/tbody/tr["+j+"]/td/a"));
	    			//	System.out.println(j);
	    				//appInd.isStale(oEL);
	    			//	appInd.isAlertPresent();
	    			
	    					allLinks.get(j).click();
	    					Thread.sleep(3000);
	    				}
	    				}
//	    				if(Frames.leftDiv())
//	    	    		{
//	    	    			strStatus+=clickOnLeftLing();
//	    	    		}
	    				
	    			}catch(Exception e)
	    			{
	    				System.out.println(e);
	    				return null;
	    			};
	    			
	    			
	    		
	    		if(Frames.mainFrame());
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				} 
						//	leftframe
				// original if(Frames.leftDiv())
				
	    		i++;
	    		//Thread.sleep(3000);
	    		//j++;
	    	} 
	    	//i=1;
	    	//int j=1;
	    	Thread.sleep(3000);
	    	//j=1;
	    	return strStatus;
	    } catch(Exception e)
	    {
	    	return null;
	    }
	}
	
			//original
	public  String clickOntabMenu()
	{
		WebElement oEL = null;
		String strStatus = "";
		int i=1;
		try
		{Frames.tabFrame();
			List<WebElement> olist = gettabLink();
			Iterator<WebElement> tabMenu = olist.subList(1, olist.size()).iterator();
			while(tabMenu.hasNext())
			{
				Frames.tabFrame();
				
				if(appInd.isStale(tabMenu.next()))
				{
					try
	    			{
						oEL = oBrowser.findElement(By.xpath("//a["+i+"][contains(@class , 'Tab')]"));
						w2.until(ExpectedConditions.elementToBeClickable(oEL));
	    				appInd.isStale(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e) {};
				}
				if(Frames.mainDnFrame())
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				}
				i++;
			} i=1;
			return strStatus;
		} catch(Exception e)
		{
			return null;
		}
		
	}	
	
	public void subMenuLink() {
		WebElement oEL = null;
		String strStatus="";
		int k=1;
	    try
	    {Frames.SubMenuFrame();
	   List<WebElement> subMenu = (List<WebElement>) getsubMenu();
	System.out.println(subMenu.size());
	    
	    for(int i=0; i<subMenu.size();i++) {
	    	
	    	if(i!=0) {
	    	subMenu.get(i).click();
	    	}
	    	Thread.sleep(1000);
	    	
	    	try {
	    		
	    	String iddiv = oBrowser.findElement(By.xpath("html/body/form/table/tbody/tr/td/a["+k+"]/following-sibling::div[1]")).getAttribute("id");
			k++;
	    	System.out.println(iddiv);
			List<WebElement> allLinks = oBrowser.findElements(By.xpath("//div[@id='"+iddiv+"']/form/table/tbody//a"));
			System.out.println(allLinks.size());
	    	
	    	for(int j=0; j<allLinks.size(); j++ ) {
	    	//	allLinks.get(j).click();
	    		
	    		try {
	    		     WebElement button = allLinks.get(j);
	    		            button.click();
	    		}
	    		catch(org.openqa.selenium.StaleElementReferenceException ex)
	    		{
	    			 WebElement button = allLinks.get(j);
	    			 	button.click();
	    		}
	    		Thread.sleep(1000);	
	    		Frames.rightFrame();
	    		appInd.verifyPageCrash();
	    		Frames.SubMenuFrame();
	    		try {
	    	//	Frames.rightFrame();
	    		Frames.tabFrame();
	    	//	oBrowser.findElement(By.xpath("//a[text()='Renew License']")).click();
	    		List<WebElement> maintabs = oBrowser.findElements(By.className("TabInActive"));
	    		for(int t = 0;t<maintabs.size();t++) {
	    			
	    			try {																											
	    		//	maintabs.get(t).click();
	    			
	    			int attempts = 0;
	    			while(attempts <= 2) {
	    		        try {
	    		        	maintabs.get(t).click();
	    		           
	    		            break;
	    		        } catch(StaleElementReferenceException e) {
	    		        }
	    		        attempts++;
	    		    }
	    			
	    			
	    			
	    			
	    			
	    			
	    			Frames.innerFrame();
	    			appInd.verifyPageCrash();
	    			Frames.tabFrame();
	    			Thread.sleep(1000);
	    			}catch(Exception e) {
	    				System.out.println(e);
	    			}
	    		}
	    		}catch(Exception e) {
	    			System.out.println(e);
	    		} 
	    		Frames.SubMenuFrame();
				
	    	}
	    	
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    System.out.println("Sublinks: "+ subMenu.size());
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	}
	
	
	public  void clickOn4thtabMenu()
	{
		
		try {
		List<WebElement> maintabs = oBrowser.findElements(By.xpath("html/body/form/div/div/nav/div/a"));
		System.out.println(maintabs.size());
		for(int i=0;i<maintabs.size();i++) {
			System.out.println(maintabs.get(i).getText());
			maintabs.get(i).click();
		}
		}catch(Exception e){
			System.out.println(e);
		}
		try {
		oBrowser.switchTo().defaultContent();
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		/**
		WebElement oEL = null;
		String strStatus = "";
		int i=1;
		try
		{Frames.tabFrame();
			List<WebElement> olist = gettabLink();
			Iterator<WebElement> tabMenu = olist.subList(1, olist.size()).iterator();
			while(tabMenu.hasNext())
			{
				Frames.tabFrame();
				
				if(appInd.isStale(tabMenu.next()))
				{
					try
	    			{
						oEL = oBrowser.findElement(By.xpath("//td["+i+"][contains(@class , 'Tab')]"));
						w2.until(ExpectedConditions.elementToBeClickable(oEL));
	    				appInd.isStale(oEL);
	    				appInd.isAlertPresent();
	    			} catch(Exception e) {};
				}
				if(Frames.mainDnFrame())
				{
					strStatus+=String.valueOf(appInd.verifyPageCrash());
				}
				i++;
			} i=1;
			return strStatus;
		} catch(Exception e)
		{
			return null;
		}
		*/
	}
	
	
	
	
}
