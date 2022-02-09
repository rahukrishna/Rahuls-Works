package ApplicationSpecific;

import FrameWork.CommonFuntions;

public   class Testcases {

	
	//Sample Testcase to refer
	public static void GotoGoogleWebsiteandSearch(String URL, String Searchtext) throws InterruptedException {

		CommonFuntions.LaunchUrl(URL);
		CommonFuntions.Sleep(4);
		CommonFuntions.type(Locators.SearchBox, Searchtext);
		CommonFuntions.Sleep(4);
		CommonFuntions.pressEnterKey(Locators.SearchBox);

		CommonFuntions.Sleep(4);
	}

	public static void ValidateSumofProducts() throws InterruptedException

	{
		CommonFuntions.LaunchUrl(Testdata.Website);
		CommonFuntions.click(Locators.ShopLink);
		ApplicationMethods.AddProduct("iphone X");
		ApplicationMethods.AddProduct("Nokia Edge");
		CommonFuntions.click(Locators.checkoutButton);
		ApplicationMethods.validateProductPrice();
		CommonFuntions.Sleep(5);
		
		
	}
}
