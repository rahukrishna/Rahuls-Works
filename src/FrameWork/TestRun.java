package FrameWork;
import java.io.IOException;

import ApplicationSpecific.Testcases;





public class TestRun {
	
	//System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\Prot Java\\chromedriver.exe");      
	public static String URL ="https://www.google.com/";
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		CommonFuntions.QuitDriver();
		
		
		

		

try
{
	//Testcases.GotoGoogleWebsiteandSearch(URL, "Rahul Krishna PK");
	Testcases.ValidateSumofProducts();
	  
}
catch (Exception e)
{
	//CommonFuntions.HandleError();
	System.out.println("Exception occured See the exeception "+ e.getMessage());
}
finally
{
	CommonFuntions.CloseBrowser();
	CommonFuntions.QuitDriver();
	
}
		  
		
		
		  
	}
}
