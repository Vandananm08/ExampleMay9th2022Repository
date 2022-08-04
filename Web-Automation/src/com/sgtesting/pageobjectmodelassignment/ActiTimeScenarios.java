package com.sgtesting.pageobjectmodelassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeScenarios {

	public static WebDriver oBrowser=null;
	public static ActiTimePageNew oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		createCustomer();
		modifyCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApp();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePageNew(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();;
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oPage.getoUsers().click();
			Thread.sleep(2000);
			oPage.getoAdduser().click();;
			Thread.sleep(2000);
			oPage.getUserDataLightBox_firstNameField().sendKeys("DemoUser");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_lastNameField().sendKeys("DemoUser123");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_emailField().sendKeys("userdemo@gmail.com");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_usernameField().sendKeys("User");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_passwordField().sendKeys("Welcome123");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_passwordCopyField().sendKeys("Welcome123");
			Thread.sleep(2000);
			oPage.getoSaveUserDetails().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oPage.getoSelect().click();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_firstNameField().clear();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_firstNameField().sendKeys("NewUser");
			Thread.sleep(2000);
			oPage.getoSaveUserDetails().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oPage.getoSelect().click();
			Thread.sleep(2000);
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oPage.getoTasks().click();
			Thread.sleep(2000);
			oPage.getoAddNew().click();
			Thread.sleep(2000);
			oPage.getoAddNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerLightBox_nameField().sendKeys("Infosys");
			Thread.sleep(2000);
			oPage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(2000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyCustomer()
	{
		try
		{
			oPage.getoEditCustomerName().click();
			Thread.sleep(2000);
			oPage.getoEditCustomerName().sendKeys("Infosys is a Prestige Company");
			Thread.sleep(2000);
			oPage.getoEditCustomerName().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getoAddNew1().click();
			Thread.sleep(2000);
			oPage.getoAddNewProject().click();
			Thread.sleep(2000);
			oPage.getProjectPopup_projectNameField().sendKeys("Mobile App Development");
			Thread.sleep(2000);
			oPage.getProjectPopup_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try
		{
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
			oPage.getoEditProjectName().sendKeys("New development of application in Mobile App");
			Thread.sleep(2000);
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
			oPage.getoActionInProject().click();;
			Thread.sleep(2000);
			oPage.getodeleteInProject().click();
			Thread.sleep(2000);
			oPage.getprojectPanel_deleteConfirm_submitBtn().click();;
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.getoEditCustomer().click();
			Thread.sleep(2000);
			oPage.getoAction().click();
			Thread.sleep(2000);
			oPage.getOdeleteCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getoLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
