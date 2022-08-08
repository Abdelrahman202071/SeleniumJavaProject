package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helper_Method;
import pages.AssignLeavePage;

public class AssignLeaveTest extends TestBase{
	AssignLeavePage assignLeavePage;
	Helper_Method helpmethod;
	@BeforeMethod
	void setup() {
		assignLeavePage =new AssignLeavePage(driver);
		helpmethod =new Helper_Method();
		helpmethod.login("Admin", "admin123");
		assignLeavePage.clickOnLeaveButtonLink();
		assignLeavePage.clickOnAssignLeaveButtonLink();
		
	}
	@Test
	public void assignLeaveWithValidData() throws InterruptedException {
		assignLeavePage.fillEmployeeName("Orange Test");
		assignLeavePage.leaveTypeOptionsSelect("US - Vacation");
		assignLeavePage.fromDateclear();
		assignLeavePage.assignLeavefromDate("2022-08-01");
		assignLeavePage.toDateclear();
		assignLeavePage.assignLeaveToDate("2022-08-30");
		assignLeavePage.clickOnAssignButton();
		Assert.assertTrue(assignLeavePage.overLappingErrorMessage.isDisplayed());
		
		
	}

}
