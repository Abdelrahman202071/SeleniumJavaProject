package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageBase {
	WebDriver driver;
	public final long WAIT=60;
	public PageBase(WebDriver driver)  {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	public void clickElement(WebElement element)
	{   
		waitTime(element);
		element.click();
	}
	public void sendKeyWithBy(By element,String value)
	{   waitTime(driver.findElement(element));
		driver.findElement(element).sendKeys(value);
	}

	
	public void sendKey(WebElement element,String value)
	{   waitTime(element);
		element.sendKeys(value);
	}
	public void waitTime(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void SubmitButton(WebElement element) {
            waitTime(element);
            element.submit();
	}
}
