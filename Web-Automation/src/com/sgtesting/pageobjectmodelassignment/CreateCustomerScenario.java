package com.sgtesting.pageobjectmodelassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomerScenario {

	public static WebDriver oBrowser=null;
	public static ActiTimePageNew oPage=null;
	
	@Test(priority=1)
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
	@Test(priority=2)
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
			oPage.getGettingStartedShortcutsPanelId().click();;
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
	@Test(priority=7)
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
	@Test(priority=8)
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
