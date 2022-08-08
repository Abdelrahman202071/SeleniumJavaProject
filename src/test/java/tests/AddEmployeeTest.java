package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import helpers.Helper_Method;
import pages.AddEmployeePage;

public class AddEmployeeTest extends TestBase {
	AddEmployeePage addEmployeePage;
	Helper_Method helpmethods;
	@BeforeMethod
	void setup() {
		addEmployeePage = new AddEmployeePage(driver);
		helpmethods = new Helper_Method();
		helpmethods.login("Admin","admin123");
	}
	@Test
	public void addEmployeeWithValidData() throws InterruptedException 
	{ 
		addEmployeePage.openPimDropDownList();
		addEmployeePage.clickOnAddEmployee();
		addEmployeePage.fillFirstName("Abdelrahman");
		addEmployeePage.fillMiddleName("Ahmed");
		addEmployeePage.fillLastName("Akl");
		addEmployeePage.fillEmployeeId("152");
		addEmployeePage.uploadEmployeePhotographWithJpgImage();
		addEmployeePage.clickOnSaveButton();
		Assert.assertTrue(addEmployeePage.personalDetailsText.isDisplayed());
	}
	
	@Test
	void addEmployeePhotographWithPNGImage() {
		addEmployeePage.openPimDropDownList();
		addEmployeePage.clickOnAddEmployee();
		addEmployeePage.fillFirstName("Abdelrahman");
		addEmployeePage.fillMiddleName("Ahmed");
		addEmployeePage.fillLastName("Akl");
		addEmployeePage.fillEmployeeId("153");
		addEmployeePage.uploadEmployeePhotographWithPNGImage();
		addEmployeePage.clickOnSaveButton();
		Assert.assertTrue(addEmployeePage.personalDetailsText.isDisplayed());
	}
	@Test
	void addEmployeeWithInValidEmptyFields() {
		addEmployeePage.openPimDropDownList();
		addEmployeePage.clickOnAddEmployee();
		addEmployeePage.fillFirstName(" ");
		addEmployeePage.fillMiddleName(" ");
		addEmployeePage.fillLastName(" ");
		addEmployeePage.fillEmployeeId(" ");
		addEmployeePage.uploadEmployeePhotographWithPNGImage();
		addEmployeePage.clickOnSaveButton();
		Assert.assertTrue(addEmployeePage.ValidationErrorMessage.isDisplayed());
	}

}
