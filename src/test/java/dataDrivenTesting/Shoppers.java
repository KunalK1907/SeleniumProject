package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppers {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("I:\\SeleniyumScreenShot\\Shoppers.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
	    Sheet sheet = wb.getSheet("Sheet1");
	    
	    ArrayList<String> field = new ArrayList<String>();
	    
	    for(int i = 0;i<6;i++)
	    {
	    	field.add(sheet.getRow(i).getCell(0).toString());
	    }
	    
	    System.out.println(field.toString());
	    
	    
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(20000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("First Name")).sendKeys(field.get(0));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Last Name")).sendKeys(field.get(1));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("Phone Number")).sendKeys(field.get(2));
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email Address")).sendKeys(field.get(3));

		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys(field.get(4));
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("Confirm Password")).sendKeys(field.get(5));
	}

}
