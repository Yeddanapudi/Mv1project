package inheritance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Scerenshot extends login{
WebDriver d; 
	public void screen() throws IOException
	
	{
		File scr=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D://pp.png"));
		
	}
}
