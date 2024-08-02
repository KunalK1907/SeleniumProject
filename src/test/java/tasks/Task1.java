package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseClass.AnnotationBase;

public class Task1 extends AnnotationBase {
	
	@Test
	
	public void task1() throws InterruptedException
	{
		String url = "https://demowebshop.tricentis.com/";
		
		String currenUrl = driver.getCurrentUrl();
		
		if(url.equals(currenUrl))
		{
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			
			for(WebElement web : links)
			{
				String currentUrl = driver.getCurrentUrl();
				
				if(url.equals(currentUrl))
				{
					driver.navigate().back();
					Thread.sleep(2000);
				}
				web.click();
			}
		}
	}
	

}
