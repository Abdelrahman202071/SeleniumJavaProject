package helpers;




import pages.LoginPage;
import tests.TestBase;

public class Helper_Method {
	LoginPage loginPage=new LoginPage(TestBase.driver);
	
	public void login(String username,String password) {
		loginPage.fillInUserName(username);
		loginPage.fillPassword(password);
		loginPage.clickOnLoginButton();
	}
	
}
