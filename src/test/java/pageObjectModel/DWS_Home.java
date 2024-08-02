package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DWS_Homepage;

public class DWS_Home 
{
	@Test
	public void main() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		DWS_Homepage ref=new DWS_Homepage(driver);
		
		ref.books();
		Thread.sleep(1000);

		ref.computer();
		Thread.sleep(1000);

		ref.electronics();
		Thread.sleep(1000);

		ref.shoes();
		Thread.sleep(1000);

		ref.digital();
		Thread.sleep(1000);

		ref.jwellery();
		Thread.sleep(1000);

		ref.gift();
		Thread.sleep(1000);

	}

}
