package ApplicationSpecific;


import java.util.List;

import org.openqa.selenium.WebElement;

import FrameWork.CommonFuntions;

public class ApplicationMethods {

public static void validateProductPrice()
{
	int totalAmount = 0;
	List<WebElement> elements = CommonFuntions.GetElements(Locators.quantityLocator);
	for (int i = 0; i < elements.size(); i++) {
		int Amount = 0;
		int h = i + 1;
		String quantityLoc = Locators.quantityLocator;
		quantityLoc = quantityLoc.replaceAll("//tr", "//tr["+h+"]");
		//WebElement QuantityEle = CommonFuntions.GetElement(quantityLoc);
		String rateLocator = Locators.rateLocator;
		rateLocator = rateLocator.replaceAll("//tr", "//tr["+h+"]");
		
		
		String AmountLoc = Locators.amountLocator;
		AmountLoc = AmountLoc.replaceAll("//tr", "//tr["+h+"]");
		Amount = Integer.parseInt(CommonFuntions.FindElement(quantityLoc).getAttribute("value"))* Integer.parseInt(CommonFuntions.FindElement(rateLocator).getText().substring(3));
		System.out.println(Amount);
		totalAmount=totalAmount+Amount;
		
	
	}
	System.out.println(totalAmount);
}

	public static void AddProduct(String ProductName) {
		List<WebElement> elements = CommonFuntions.GetElements(Locators.ProductsList);
		ProductName = ProductName.toUpperCase();
		// StringBuilder AddbuttonLocator = new StringBuilder();
		String AddbuttonLocator = Locators.AddButton;
		
		System.out.println(ProductName);
		for (int i = 0; i < elements.size(); i++) {

			if (elements.get(i).getText().toUpperCase().equals(ProductName)) {
				int h = i + 1;
				CommonFuntions.HighLightElement(elements.get(i));
				// AddbuttonLocator.repla
				// AddbuttonLocator.replaceAll("app-card[]", "app-card["+i+"]");
				AddbuttonLocator = AddbuttonLocator.replace("app-card[]", "app-card[" + h + "]");
				
				CommonFuntions.click(AddbuttonLocator.toString());

			}

		}
	}
}
