package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyDwsPage {
	
	@Test
	public void hardAssert()
	{
		
		String expectedUrl = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualUrl = driver.getCurrentUrl();
		
		
		//assertEquals(expectedUrl, actualUrl);
		
		assertNotEquals(expectedUrl, actualUrl,"It is equal");
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		
		
		
		searchField.sendKeys("mobile",Keys.ENTER);
		
		driver.close();
		
	
	}

}
