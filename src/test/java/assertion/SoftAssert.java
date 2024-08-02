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

public class SoftAssert {
	
	@Test
	public void softAssert()
	{
		String expectedUrl = "https://demoweshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualUrl = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();
		
		
		
		
		//assertEquals(expectedUrl, actualUrl);
		
		//soft.assertNotEquals(expectedUrl, actualUrl,"url is not matching");
		
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		
		
		
		searchField.sendKeys("mobile",Keys.ENTER);
		
		 WebElement advanceSearch = driver.findElement(By.cssSelector("input[id='As']"));
		 
		 //advanceSearch.click();
		 
		 //soft.assertNotEquals(advanceSearch.isSelected());
		 
		 //assertFalse(advanceSearch.isSelected());
		 
		 driver.findElement(By.id("Isc")).click();
		
		//driver.close();
	}

	

	
}
