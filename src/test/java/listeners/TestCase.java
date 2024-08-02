package listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.BaseClassDWS;
@Listeners(com.crm.Listeners.DwsListeners.class)

public class TestCase extends BaseClassDWS {
	
	@Test
	public void main() throws IOException
	{
		String expectedUrl = "https://demowebshop.tricentis.com/";
		
		
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, actualUrl);
		
		
		
	}
	
	
	@Test
	public void main2() throws IOException
	{
		String expectedUrl = "https://demoweshop.tricentis.com";
		
		
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, actualUrl);
	}
		
		
		
		

}
