package ApplicationSpecific;
//Locators Class
//Currently Xpath can be only used as locator
public class Locators {

	//Sample Locators
	public static String SearchBox = "//input[@type='text']";
	public static String SearchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";

	
	//Real Locators
	public static String ShopLink = "//a[text()='Shop']";
	public static String ProductsList = "//h4/a" ;
	public static String AddButton= "//app-card-list/app-card[]/div/div[2]/button";
	public static String checkoutButton = "//a[contains(text(),'Checkout')]";
	public static String quantityLocator = "//tr//input";
	public static String rateLocator = "//tr//td[3]/strong";
	public static String amountLocator = "//tr//td[4]/strong";





}
