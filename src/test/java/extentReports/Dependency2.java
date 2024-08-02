package extentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listeners.DependencyListeners.class)

public class Dependency2 {
	
	@Test
	public void dominos()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://pizzaonline.dominos.co.in/");
		
		Reporter.log("I am starving",true);
		
		
	}
	
	@Test(timeOut = 1000)
	public void rcb() throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.royalchallengers.com/");
		
		Reporter.log("Rcb is starving for cup",true);
		
		Thread.sleep(2000);
	}

	
	@Test(dependsOnMethods = "rcb")
	public void csk() throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.chennaisuperkings.com/");
		
		Reporter.log("When thala will retire",true);
		
		
	}
	
}
