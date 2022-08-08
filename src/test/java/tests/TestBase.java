package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static  WebDriver driver;
	@BeforeMethod
	void openBrowser()
	{   String FireFox =System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",FireFox);
	driver=new FirefoxDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterMethod
	void closeBrowser()
	{
		driver.quit();
	}
	
}
