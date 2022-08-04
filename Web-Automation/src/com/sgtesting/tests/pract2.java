package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class pract2 {
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser= new ChromeDriver();
				oBrowser.manage().window().maximize();
				
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
				oBrowser.get("http://localhost/login.do");
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
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=4)
		private static void minimizeflyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
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

				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Raghuraj");
				oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
				Thread.sleep(1000);
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
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
				Thread.sleep(1000);
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
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=8)
		private static void closeApplication()
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