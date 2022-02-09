package FrameWork;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.OutputType;



public class CommonFuntions {

	public static void HighLightElement(WebElement elem) {
		((JavascriptExecutor) Constants.driver).executeScript("arguments[0].style.border='3px solid red'", elem);

	}

	public static WebElement FindElement(String Xpath) {
		WebdriverWaitExplicit(Xpath);
		WebElement element = Constants.driver.findElement(By.xpath(Xpath));

		HighLightElement(element);
		return element;
	}

	public static void WebdriverWaitExplicit(String Xpath) {
		WebDriverWait wait = new WebDriverWait(Constants.driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));

	}


	public static void click(String Xpath) {
		WebElement ele = FindElement(Xpath);
		ele.click();
	}

	public static void type(String Xpath, String text) {
		WebElement ele = FindElement(Xpath);
		ele.clear();
		ele.sendKeys(text);
	}

	public static void LaunchUrl(String URL) {
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\Prot Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		Constants.driver = new ChromeDriver(options);
		Constants.driver.get(URL);
		MaximiseWindow();
	}

	public static void MaximiseWindow() {
		Constants.driver.manage().window().maximize();
	}

	public static void QuitDriver() throws IOException {
		
		try
		{
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		}
		catch (Exception e)
		{
			
		}
		
	}

	public static void CloseBrowser() {
		
		try
		{
			Constants.driver.close();
		}
		catch(Exception e)
		{
			
		}
		
	}

	public static void Sleep(int timeInSeconds) throws InterruptedException {
		Thread.sleep(timeInSeconds * 1000);
	}

	public static void pressEnterKey(String Locator) {
		WebElement ele = FindElement(Locator);
		ele.sendKeys(Keys.ENTER);
	}

	public static void takeScreenShot() throws IOException {
		String fileWithPath = Constants.ScreenshotPath;
		TakesScreenshot scrShot = ((TakesScreenshot) Constants.driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static void HandleError() throws IOException {
		takeScreenShot();
	}
	
	public static List<WebElement> GetElements(String Xpath)
	{
		WebdriverWaitExplicit(Xpath);
		List<WebElement> lst = Constants.driver.findElements(By.xpath(Xpath));
		return lst;
		
	}
	
	
	

}
