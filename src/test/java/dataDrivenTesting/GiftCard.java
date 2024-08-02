package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.DwsBaseClass;

public class GiftCard extends DwsBaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
        FileInputStream fis = new FileInputStream("I:\\SeleniyumScreenShot\\GiftCard1.xlsx");
		
		XSSFWorkbook wb = XSSFWorkbookFactory.createWorkbook(fis);
		
	    XSSFSheet sheet = wb.getSheet("Sheet1");
	    
	    String name = sheet.getRow(0).getCell(0).toString();
	    
	    String email1 = sheet.getRow(1).getCell(0).toString();
	    
	    String name2 = sheet.getRow(2).getCell(0).toString();
	    
	    String email2 = sheet.getRow(3).getCell(0).toString();
	    
	    String message = sheet.getRow(4).getCell(0).toString();
	    
	    String count = sheet.getRow(5).getCell(0).toString();
	    
	    double c =  Double.parseDouble(count);
	    
	    int c1 = (int)c;
	    
		
		preCondition("Chrome");
		
		login();
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		List<WebElement> field = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		
		field.get(0).sendKeys(name);
		field.get(1).sendKeys(email1);
		
		Thread.sleep(2000);
		
		field.get(2).sendKeys(name2);
		field.get(3).clear();
        field.get(3).sendKeys(email2);		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("textarea[id='giftcard_2_Message']")).sendKeys(message);
		
		Thread.sleep(2000);
		
		WebElement qun = driver.findElement(By.cssSelector("input[id='addtocart_2_EnteredQuantity']"));
		
		qun.clear();
		qun.sendKeys(""+c1);
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='add-to-cart-button-2']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.className("ico-cart")).click();
		
		WebElement giftCard =      driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[4]"));
		
		if(giftCard.isDisplayed())
		{
			System.out.println("Gift Card is Successfully added to Cart");
		}
		else
		{
			System.out.println("Gift Card is Not Added to Cart");
		}

	}

}
