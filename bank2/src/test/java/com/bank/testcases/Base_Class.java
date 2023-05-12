package com.bank.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bank.utilities.readconfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	readconfig reading=new readconfig();
	
public String baseurl=reading.getApplicationURl();
public String username=reading.getUserName();
public String password=reading.getpassword();

public static WebDriver driver;

@Parameters("Browser")
@BeforeClass
public void setup(String Browser)
{
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
//	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

if(Browser.equals("chrome"))
{
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--remote-allow-origins=*");

//	driver=new ChromeDriver();


	// System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\WD12\\maven1\\drivers\\chromedriver.exe");
	 		driver=new ChromeDriver(opt);

}
else if(Browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",reading.getfirefoxpath());
		driver=new FirefoxDriver();
		
	}
	else if(Browser.equals("IE"))
		
	{
		System.setProperty("webdriver.ie.driver",reading.getiepath());
		
		driver=new InternetExplorerDriver();

	}
driver.get(baseurl);

}

@AfterClass
public void teardown()
{
	driver.quit();
	
}

}
