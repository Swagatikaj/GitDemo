package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest()
	{
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}
	
		//This by git X
		if(driver.getTitle().equals("Guru99 Bank Manager has no HomePage"))
		{
			assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}
		
		
		//Delete this all prints later and then commit again
		System.out.println("PostJira2");
		System.out.println("PostJira3");
		System.out.println("PostJira4");
		System.out.println("PostJira5");
		
		System.out.println("PostJira1");
		System.out.println("PostJira2");
		System.out.println("PostJira3");
		System.out.println("PostJira4");
	}
	
}
