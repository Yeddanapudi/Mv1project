package inheritance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dropdown extends login {
	public void country() {
		d.findElement(By.linkText("REGISTER")).click();

		WebElement drop=d.findElement(By.name("country"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
		}
	}

}
