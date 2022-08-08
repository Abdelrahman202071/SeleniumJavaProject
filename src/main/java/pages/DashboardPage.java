package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageBase {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@class=\"head\"]/h1")
	public WebElement dashboardTitle;
	
}
