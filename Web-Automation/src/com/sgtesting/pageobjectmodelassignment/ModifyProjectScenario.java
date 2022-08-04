package com.sgtesting.pageobjectmodelassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModifyProjectScenario {
	public static WebDriver ob=null;
	public static ActiTimePageNew oPage=null;
	
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			ob=new ChromeDriver();
			oPage=new ActiTimePageNew(ob);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			ob.navigate().to("http://localhost/login.do");	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
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
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
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
	@Test(priority=6)
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
	@Test(priority=7)
	private static void modifyProject()
	{
		try
		{
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
			oPage.getoEditProjectName().sendKeys("This project develops new application for mobile");
			Thread.sleep(2000);
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void deleteProject()
	{
		try
		{
			oPage.getoModifyProject().click();
			Thread.sleep(2000);
			oPage.getoActionInProject().click();
			Thread.sleep(2000);
			oPage.getodeleteInProject().click();
			Thread.sleep(2000);
			oPage.getprojectPanel_deleteConfirm_submitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
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
	@Test(priority=10)
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
	@Test(priority=11)
	private static void closeApp()
	{
		try
		{
			ob.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
