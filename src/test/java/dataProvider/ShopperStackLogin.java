package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperStackLogin {

	@DataProvider(name="data")
	public Object[][] sender() throws IOException{
		FileInputStream fis =new FileInputStream("I:\\SeleniyumScreenShot\\ShopperLogin.xlsx");  
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void receiver(String data1,String data2) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
				
		 WebElement login = driver.findElement(By.id("loginBtn"));
		login.click();
		
		driver.findElement(By.id("Email")).sendKeys(data1);
		driver.findElement(By.id("Password")).sendKeys(data2);
		driver.findElement(By.className("MuiButton-label")).click();
		//driver.close();
	}
	
}