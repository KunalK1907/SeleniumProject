package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_Register
{
	@Test
	public void main()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		pom.DWS_Register ref=new pom.DWS_Register(driver);
		
		ref.register_link();
		ref.gender();
		ref.fName("Kunal");
		ref.lName("Kene");
		ref.email("kunalkene5@gmail.com");
		ref.password("Kunal@12");
		ref.confirm("Kunal@12");
		ref.register();
	}
	

}