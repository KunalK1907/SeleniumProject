package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		 String email = JavaUtility.loginData("email");
		 
		 String pass = JavaUtility.loginData("password");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
