package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	     String username =  JavaUtility.loginData("username");

	     String pass = JavaUtility.loginData("opass");
	     
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	     
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
