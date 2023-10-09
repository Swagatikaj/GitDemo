package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "https://demo.guru99.com/v3/index.php";
	public String userName = "mngr26593";
	public String password = "1234567@";
	public static WebDriver driver;
	
	@BeforeClass
	 public WebDriver SetUp()
	    {
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        System.out.println("Maximizing the Browser");
	        return driver;
	    }
	 
	
	@AfterClass
	public void tearDown()
	{	
	driver.quit();
	System.out.println("Quitting the browser");
	}
	
}
