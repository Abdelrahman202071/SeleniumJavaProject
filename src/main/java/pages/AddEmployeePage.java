package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage  extends PageBase{

	public AddEmployeePage(WebDriver driver) {
		super(driver);
	}
	String imageName ="image1.jpg";
	String imagePath =System.getProperty("user.dir")+"\\Files\\"+imageName;
	String imageName1 ="Test_animated_image.gif";
	String imagePath1 =System.getProperty("user.dir")+"\\Files\\"+imageName1;
	String imageName2 ="download.png";
	String imagePath2 =System.getProperty("user.dir")+"\\Files\\"+imageName2;
	@FindBy(xpath ="//*[@id=\"menu_pim_viewPimModule\"]/b")
	WebElement pimDropDownList;
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployeeButton;
	@FindBy(id="firstName")
	WebElement firstNameTextBox;
	@FindBy(id="middleName")
	WebElement middleNameTextBox;
	@FindBy(id="lastName")
	WebElement lastNameTextBox;
	@FindBy(id="employeeId")
	WebElement employeeIdTextBox;
	@FindBy(id="photofile")
	WebElement photoFileChooseBox;
	@FindBy(id="photofile")
	WebElement photographUpload;
	@FindBy(xpath = "//*[@class=\"head\"]/h1")
	public WebElement personalDetailsText;
	@FindBy(xpath = "//*[@class=\"validation-error\"]")
	public WebElement ValidationErrorMessage;
	@FindBy(id="btnSave")
	WebElement saveButton;
	public void openPimDropDownList() {
		clickElement(pimDropDownList);
	}
	public void clickOnAddEmployee() {
		clickElement(addEmployeeButton);
	}
	public void fillFirstName(String firstName)
	{
		sendKey(firstNameTextBox,firstName);
	}
	public void fillMiddleName(String middleName)
	{
		sendKey(middleNameTextBox,middleName);
	}
	public void fillLastName(String lastName)
	{
		sendKey(lastNameTextBox,lastName);
	}
	public void fillEmployeeId(String ID)
	{
		sendKey(employeeIdTextBox,ID);
	}
	public void uploadEmployeePhotographWithJpgImage() {
		sendKey(photographUpload,imagePath);
	}
	public void uploadEmployeePhotographWithGifImage() {
		sendKey(photographUpload, imagePath1);
	}
	public void uploadEmployeePhotographWithPNGImage() {
		sendKey(photographUpload, imagePath2);
	}
	public void clickOnSaveButton()
	{
		clickElement(saveButton);
	}
}
