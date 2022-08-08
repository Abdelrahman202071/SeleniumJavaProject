package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavePage extends PageBase{

	public AssignLeavePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	WebElement leaveListButtonLink;
	@FindBy(id="menu_leave_assignLeave")
	WebElement assignLeaveButtonLink;
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement employeeNameTextBox;
	@FindBy(id="assignleave_txtLeaveType")
	WebElement leaveTypeDropDownList;
	@FindBy(id="assignleave_txtFromDate")
	WebElement assignLeavefromDateCal;
	@FindBy(id="assignleave_txtToDate")
	WebElement assignLeaveToDateCal;
	@FindBy(id="assignleave_partialDays")
	WebElement partialDayDropDownList;
	@FindBy(xpath = "//*[@class=\"head\"]/h1")
	public WebElement overLappingErrorMessage;
	public void clickOnLeaveButtonLink() {
		clickElement(leaveListButtonLink);
	}
	@FindBy(id="assignBtn")
	WebElement assignButton;
	public void clickOnAssignLeaveButtonLink() {
		clickElement(assignLeaveButtonLink);
	}
	public void fillEmployeeName(String Name) {
		sendKey(employeeNameTextBox, Name);
	}
	public void leaveTypeOptionsSelect(String leaveType) {
		Select leaveTypeOption = new Select(leaveTypeDropDownList);
		leaveTypeOption.selectByVisibleText(leaveType);
	}
	public void assignLeavefromDate(String fromDate) {
		sendKey(assignLeavefromDateCal, fromDate);
	}
	public void assignLeaveToDate(String toDate) {
		sendKey(assignLeaveToDateCal,toDate);
	
	}
	
	public void partialDayDropDownListOptionSelect(String option) {
		waitTime(partialDayDropDownList);
		Select partialDayDropDownListOptions =new
				Select(partialDayDropDownList);
	    partialDayDropDownListOptions.selectByVisibleText(option);
	}
	public void clickOnAssignButton() {
		clickElement(assignButton);
	}
	public void fromDateclear() {
		assignLeavefromDateCal.clear();
	}
	public void toDateclear() {
		assignLeaveToDateCal.clear();
	}
	public void clickonassignLeaveToDateCal() {
		clickElement(assignLeaveToDateCal);
	}
	
	
	
	



}
