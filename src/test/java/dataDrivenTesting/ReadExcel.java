package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("I:\\SeleniyumScreenShot\\DwsLogin.xlsx");
		
		XSSFWorkbook wb = XSSFWorkbookFactory.createWorkbook(fis);
		
	    XSSFSheet sheet = wb.getSheet("Sheet1");
	    
	    String email = sheet.getRow(0).getCell(0).toString();
	    
	    String password = sheet.getRow(1).getCell(0).toString();
	    
	    System.out.println(email);
	    System.out.println(password);
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
        driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
