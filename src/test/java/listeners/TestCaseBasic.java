package listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.DwsBaseClass;
@Listeners(com.crm.Listeners.Basics.class)


public class TestCaseBasic extends DwsBaseClass {
	
	@Test
	public void main() throws IOException
	{
		String expectedUrl = "https://demowebshop.tricentis.com/";
		
		preCondition("Chrome");
		
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, actualUrl);
		
		Reporter.log("main1",true);
		
		
		
	}
	
	
	@Test
	public void main2() throws IOException
	{
		String expectedUrl = "https://demoweshop.tricentis.com";
		
		preCondition("Chrome");
		
		
		
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, actualUrl);
		Reporter.log("main2",true);
		
		
		
	}
	
	

}
