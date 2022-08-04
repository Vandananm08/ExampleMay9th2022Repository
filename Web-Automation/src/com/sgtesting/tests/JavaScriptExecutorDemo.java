package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getTitleDemo();
		getURLDemo();
		getLinksCount();
	//	enterdataInTextField1();
	//	enterdataInTextField2();
	//	checkBoxField1();
	//	checkBoxField2();
	//  clickRadioButtonField1();
	//  clickRadioButtonField2();
		itemFromDropDown();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:\\E:\\HTML\\Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getTitleDemo()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String title=(String) js.executeScript("var kk=document.title;return kk;");
			System.out.println("Title: "+title);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getURLDemo()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String url=(String) js.executeScript("var kk=document.URL;return kk;");
			System.out.println("URL: "+url);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getLinksCount()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
			System.out.println("# of links: "+links);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void enterdataInTextField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('uid1user1name1').value='DemoUser';");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void enterdataInTextField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
			js.executeScript("arguments[0].value='DemoUser';",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void checkBoxField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('chk1windows').click();");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void checkBoxField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
			js.executeScript("arguments[0].click();", oEle);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	private static void clickRadioButtonField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('rad1chrome').click();");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickRadioButtonField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
			js.executeScript("arguments[0].click();", oEle);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickButtonField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('btn1submit1button1').click();");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickButtonField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
			js.executeScript("arguments[0].click();", oEle);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void itemFromDropDown()
	{
		try
		{
			JavascriptExecutor js=null;
			js=(JavascriptExecutor) oBrowser;
			String str="";
			str+="var list=document.getElementById('tools');";
			str+="for(var i=0;i<list.length;i++)";
			str+="{";
			str+="if(list[i].text='Selenium WebDriver')";
			str+="{";
			str+="list[i].selected='1'";
			str+="}";
			str+="}";
			js.executeScript(str);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
