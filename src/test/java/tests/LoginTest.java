package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest  extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	@BeforeMethod
	void setupData()
	{
	  loginPage=new LoginPage(driver);
	  dashboardPage=new DashboardPage(driver);
	}
	@Test
	public void testLoginWithValidEmailAndPassword()
	{
	  loginPage.fillInUserName("Admin");
	  loginPage.fillPassword("admin123");
	  loginPage.clickOnLoginButton();
	  Assert.assertTrue(dashboardPage.dashboardTitle.isDisplayed());
	  
	}
	@Test
	public void testLoginWithInValidEmailAndValidPAssword() {
		loginPage.fillInUserName("AAA");
		loginPage.fillPassword("admin123");
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.errorMassage.isDisplayed());
	}
	@Test
	public void testLoginWithValidEmailAndInValidPAssword() {
		loginPage.fillInUserName("Admin");
		loginPage.fillPassword("AAA");
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.errorMassage.isDisplayed());
	}
	
	@Test
	public void testLoginWithInValidEmailAndInValidPAssword() {
		loginPage.fillInUserName("HHH");
		loginPage.fillPassword("AAA");
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.errorMassage.isDisplayed());
	}
	
	
}
