package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		  String email = JavaUtility.loginData("semail");
		  
		  String pass = JavaUtility.loginData("spass");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(20000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);

	}

}
