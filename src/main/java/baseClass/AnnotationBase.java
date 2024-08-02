package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AnnotationBase {
	
	public WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void preCondition(String browser,String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver =new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
	}

	
	@BeforeMethod
	public void login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("I:\\oopss\\com.crm.AdvanceSeleniumA6\\ConfigureFile\\Annotation.properties");
		prop.load(fis);
		
		String email = prop.getProperty("email");
		
		String pass = prop.getProperty("password");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
}
