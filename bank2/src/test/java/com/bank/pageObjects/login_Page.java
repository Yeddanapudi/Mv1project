package com.bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {
WebDriver ldriver;

public login_Page(WebDriver driver)
{
	ldriver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(name="username")
@CacheLookup
WebElement txtusername;

@FindBy(name="password")
@CacheLookup
WebElement txtpassword;


@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
@CacheLookup
WebElement submit;

public void setUserName(String uname)
{
	txtusername.sendKeys(uname);
}
public void setpassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void button()
{
submit.click();

}
}
