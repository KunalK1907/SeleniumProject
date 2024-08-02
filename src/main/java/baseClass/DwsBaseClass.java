package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DwsBaseClass {
	
	public static WebDriver driver ;
	public static void preCondition(String browser) throws IOException
	{
		String browser1 = JavaUtility.loginData("browser");
		
		String url = JavaUtility.loginData("url");
		
		
		if(browser1.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser1.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void login() throws InterruptedException, IOException
	{
		String username  =  JavaUtility.loginData("dusername");
		
		String  password = JavaUtility.loginData("password");
		
        driver.findElement(By.className("ico-login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(username);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	public static void postCondition() throws InterruptedException
	{
		driver.findElement(By.className("ico-logout")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
