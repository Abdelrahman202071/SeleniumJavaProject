package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	By userName2=By.id("txtUsername");
	
	@FindBy(id = "txtUsername")
	WebElement userName;
	
	public void fillInUserName2(String username)
	{
		sendKeyWithBy(userName2,username);
	}

	
	@FindBy(id="txtPassword")
	  WebElement password;
	@FindBy(id="btnLogin")
	WebElement loginButton;
	@FindBy(xpath = "//*[text()=\"Invalid credentials\"]")
	 public WebElement errorMassage;
	public void fillInUserName(String username)
	{
		sendKey(userName,username);
	}
	public void fillPassword(String password)
	{
		sendKey(this.password, password);
	}
	public void clickOnLoginButton()
	{
		clickElement(loginButton);
	}
	


}
