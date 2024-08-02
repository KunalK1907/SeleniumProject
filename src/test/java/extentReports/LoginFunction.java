package extentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunction {
	
	@Test
	public void Login() throws InterruptedException
	{
		
		//create a spark reporter
		
				ExtentSparkReporter spark = new ExtentSparkReporter("./Report/loginfailedReport.html");
				
				//configure the spark reporter
				
				spark.config().setDocumentTitle("LoginFunctionReport");
				
				spark.config().setReportName("Kunal");
				
				spark.config().setTheme(Theme.DARK);
				
				//Create the extentReport
				
				ExtentReports report = new ExtentReports();
				
				//configure the extent report
				
				report.setSystemInfo("Os", "Window-10");
				
				report.setSystemInfo("Browser", "Chrome-100");
				
				//Attach the spark Reporter to the extent Report
				
				report.attachReporter(spark);
				
				ExtentTest test =  report.createTest("Login");
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("admin01");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		
		if(poll.isDisplayed())
		{
			test.log(Status.PASS, "Community Poll iS Displayed");
			
			report.flush();
		}
		else
		{
			test.log(Status.FAIL, "Community Poll iS Not Displayed");
			report.flush();
		}

	}

}
