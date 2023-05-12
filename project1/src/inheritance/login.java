package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
WebDriver d; 
	public void Opening_Browser()
{
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
d=new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/");
d.manage().window().maximize();

}

	
	
	
}
