package com.sgtesting.pageobjectmodelassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageNew {
	public ActiTimePageNew(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for LoginPage UserName text field
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	//WebElement for LoginPage Password text field
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}
	
	//WebElement for LoginPage Login Button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getoLogin() {
		return oLogin;
	}
	
	//WebElement for Home Page Flyout Window 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Home Page Users button selection
	@FindBy(xpath="//a[@class='content users']")
	private WebElement oUsers;
	public WebElement getoUsers() {
		return oUsers;
	}
	
	//WebElement for User Page AddUser selection
	@FindBy(xpath="//div[@class='addUserButton beigeButton useNativeActive']")
	private WebElement oAdduser;
	public WebElement getoAdduser() {
		return oAdduser;
	}
	
	//WebElement for Adduser page FirstName
	private WebElement userDataLightBox_firstNameField;
	public WebElement getUserDataLightBox_firstNameField() {
		return userDataLightBox_firstNameField;
	}
	
	//WebElement for Adduser page LastName
	private WebElement userDataLightBox_lastNameField;
	public WebElement getUserDataLightBox_lastNameField() {
		return userDataLightBox_lastNameField;
	}

	//WebElement for Adduser page Email
	private WebElement userDataLightBox_emailField;
	public WebElement getUserDataLightBox_emailField() {
		return userDataLightBox_emailField;
	}
	
	//WebElement for Adduser page UserName
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}
	
	//WebElement for Adduser page Password
	private WebElement userDataLightBox_passwordField;
	public WebElement getUserDataLightBox_passwordField() {
		return userDataLightBox_passwordField;
	}
	
	//WebElement for Adduser page Retype Password
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getUserDataLightBox_passwordCopyField() {
		return userDataLightBox_passwordCopyField;
	}
	
	//WebElement for Adduser page Save button
	@FindBy(xpath="//div[@class='greyButton withIcon commitBtn']")
	private WebElement oSaveUserDetails;
	public WebElement getoSaveUserDetails() {
		return oSaveUserDetails;
	}
	
	//WebElement for Userpage select created user to modify username
	@FindBy(xpath="//td[@class='userNameCell first']")
	private WebElement oSelect;
	public WebElement getoSelect() {
		return oSelect;
	}
	
	//WebElement for Account Information page save modified username
	private WebElement userDataLightBox_commitBtn;
	public WebElement getuserDataLightBox_commitBtn() {
		return userDataLightBox_commitBtn;
	}
	
	//WebElement for Account Information page delete user button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getUserDataLightBox_deleteBtn() {
		return userDataLightBox_deleteBtn;
	}
	
	//WebElement for Tasks button selection
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement oTasks;
	public WebElement getoTasks() {
		return oTasks;
	}

	//WebElement for customer & projects page Add New selection
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement oAddNew;
	public WebElement getoAddNew() {
		return oAddNew;
	}
	
	//WebElement for customer & projects page Add New customer selection
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement oAddNewCustomer;
	public WebElement getoAddNewCustomer() {
		return oAddNewCustomer;
	}
	
	//WebElement for create New customer page to enter cutomer name
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
		
	}
	
	//WebElement for create New customer page select create customer button
	private WebElement customerLightBox_commitBtn;
	public WebElement getCustomerLightBox_commitBtn() {
		return customerLightBox_commitBtn;
	}
	
	//WebElement to edit customer name
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement oEditCustomer;
	public WebElement getoEditCustomer() {
		return oEditCustomer;
	}	
	
	//WebElement to erase existing existing customer name
	@FindBy(xpath="//textarea[@placeholder='Enter customer description...']")
	private WebElement oEditCustomerName;
	public WebElement getoEditCustomerName() {
		return oEditCustomerName;
	}
	
	//WebElement in customer page to perform delete action
	@FindBy(xpath="//*[@*='actionButton']")
	private WebElement oAction;
	public WebElement getoAction() {
		return oAction;
	}
	
	//WeElement in customer page to select delete option
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement odeleteCustomer;
	public WebElement getOdeleteCustomer() {
		return odeleteCustomer;
	}
	
	//WebElement in customer page to confirm deleting customer name
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getCustomerPanel_deleteConfirm_submitTitle() {
		return customerPanel_deleteConfirm_submitTitle;
	}

	//WebElement for customer & projects page Add New selection
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement oAddNew1;
	public WebElement getoAddNew1() {
		return oAddNew1;
	}
	
	//WebElement for customer & projects page Add New Project selection
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement oAddNewProject;
	public WebElement getoAddNewProject() {
		return oAddNewProject;
	}
	
	//WebElement for Create new project page enter project name
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectPopup_projectNameField() {
		return projectPopup_projectNameField;
	}
	
	//WebElement for Create new project page click on create project button
	private WebElement projectPopup_commitBtn;
	public WebElement getProjectPopup_commitBtn() {
		return projectPopup_commitBtn;
	}
	
	//WebElement to modify project name
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oModifyProject;
	public WebElement getoModifyProject() {
		return oModifyProject;
	}
	
	//WebElement to edit project name
	@FindBy(xpath="//*[@*='Enter project description...']")
	private WebElement oEditProjectName;
	public WebElement getoEditProjectName() {
		return oEditProjectName;
	}
	
	//WeElement in project page to select action option
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement oActionInProject;
	public WebElement getoActionInProject() {
		return oActionInProject;
	}

	//WeElement in project page to select delete option
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement odeleteInProject;
	public WebElement getodeleteInProject() {
		return odeleteInProject;
	}
	
	//WebElement in project page to confirm deleting customer name
	private WebElement projectPanel_deleteConfirm_submitBtn;
	public WebElement getprojectPanel_deleteConfirm_submitBtn() {
		return projectPanel_deleteConfirm_submitBtn;
	}
	
	//WebElement for Customers & Project page to Add New Task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")
	private WebElement oAddNewTask;
	public WebElement getoAddNewTask() {
		return oAddNewTask;
	}
	
	//WebElement for Customers & Project page to create new task
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement oCreateNewTask;
	public WebElement getoCreateNewTask() {
		return oCreateNewTask;
	}
	
	//WebElement for Create new task page to create new task
		@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
		private WebElement oEnterFirstTask;
		public WebElement getoEnterFirstTask() {
			return oEnterFirstTask;
		}

	//WebElement for Create new task page to save the task
	private WebElement createTasksPopup_commitBtn;
	public WebElement getCreateTasksPopup_commitBtn() {
		return createTasksPopup_commitBtn;
	}
	
	//WebElement for All Customers page to select created task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]")
	private WebElement oSelectCreateTask;
	public WebElement getoSelectCreateTask() {
		return oSelectCreateTask;
	}

	
	//WebElement for All Customers page to click on delete task option
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")
	private WebElement oClickDeleteTask;
	public WebElement getoClickDeleteTask() {
		return oClickDeleteTask;
	}
	

	//WebElement to confirm delete task
	private WebElement deleteTaskPopup_deleteConfirm_submitBtn;
	public WebElement getdeleteTaskPopup_deleteConfirm_submitBtn() {
		return deleteTaskPopup_deleteConfirm_submitBtn;
	}
	
	
	//WebElement for Home Page Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getoLogout() {
		return oLogout;
	}	
	
}
