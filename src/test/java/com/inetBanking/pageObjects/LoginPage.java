package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	//Delete this 3 element later and then commit again
	@FindBy(name="uid")
	WebElement txtUserName1;
	
	@FindBy(name="password")
	WebElement txtPassword1;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin1;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	//Delete this 3 methods later and then commit again
	public void setUserName1(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword1(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit1()
	{
		btnLogin.click();
	}
	

}
