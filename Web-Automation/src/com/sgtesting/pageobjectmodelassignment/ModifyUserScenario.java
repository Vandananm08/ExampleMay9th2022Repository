package com.sgtesting.pageobjectmodelassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModifyUserScenario {

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
	@Test(priority=6)
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
	@Test(priority=7)
	private static void deleteUser()
	{
		try
		{
			oPage.getoSelect().click();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_deleteBtn().click();
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
	@Test(priority=8)
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
	@Test(priority=9)
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
