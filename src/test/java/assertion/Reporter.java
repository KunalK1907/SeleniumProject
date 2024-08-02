package assertion;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Reporter {
	
	@Test
	public void reporter()
	{
		String expectedUrl = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualUrl = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertNotEquals(expectedUrl, actualUrl,"Url is not same");
		
		org.testng.Reporter.log("Url is not same",true);
		
		
		//assertEquals(expectedUrl, actualUrl);
		
		//assertNotEquals(expectedUrl, actualUrl,"It is equal");
		
	
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		
		
		
		searchField.sendKeys("mobile",Keys.ENTER);
		
		 WebElement advanceSearch = driver.findElement(By.cssSelector("input[id='As']"));
		 
		 //advanceSearch.click();
		 
		 soft.assertTrue(advanceSearch.isSelected());
		 
		 soft.assertAll();
		 
		 //assertFalse(advanceSearch.isSelected());
		 
		 driver.findElement(By.id("Isc")).click();
		
		//driver.close();
	}

}
