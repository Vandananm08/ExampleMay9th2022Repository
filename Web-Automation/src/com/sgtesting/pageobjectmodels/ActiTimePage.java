package com.sgtesting.pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for Login page username text field
	private WebElement username;
	public WebElement getUsername() 
	{
		return username;
	}
	
	//WebElement for Login page password text field
	private WebElement pwd;
	public WebElement getPwd() 
	{
		return pwd;
	}
	
	//WebElement for Login page password text field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getoLogin() 
	{
		return oLogin;
	}
	
	//WebElement for Home Page Flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() 
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Home Page Logout link
	private WebElement logoutLink;
	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}
	
}
