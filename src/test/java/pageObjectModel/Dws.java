package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsLogin;

public class Dws {
	
	@Test
	
	public void main() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		DwsLogin ref = new DwsLogin(driver);
		
		ref.getloginLink();
		
		Thread.sleep(2000);
		
		ref.getUsername("admin01@gmail.com");
		
		Thread.sleep(2000);
		
		ref.getPassword("admin01");
		
		Thread.sleep(2000);
		
		ref.getLoginBut();
		
		driver.close();
	}

}
