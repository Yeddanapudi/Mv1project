package com.bank.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.bank.pageObjects.login_Page;

public class tc_login_oo1 extends Base_Class {

	@Test
	public void logintest()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
		
		login_Page lp=new login_Page(driver);
		
		lp.setUserName(username);
		
		lp.setpassword(password);
		
		lp.button();
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
		Assert.assertTrue(true);	
		
		}
		else
		{
			Assert.assertTrue(false);
				
		}
		
		
		
			}
}
