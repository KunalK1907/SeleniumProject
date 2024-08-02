package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DigitalDownloads;

public class DWS_DigitalDownloads 
{
	@Test
	public void main() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		DigitalDownloads ref=new DigitalDownloads(driver);
		ref.digital();
		ref.sort();
		ref.display();
		ref.view();
		
		driver.close();	
	}

}
