package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Homepage 
{
	public DWS_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public @FindBy(linkText = "Books")
	WebElement book;
	
	public @FindBy(linkText = "Computers")
	WebElement computer;
	
	public @FindBy(linkText = "Electronics")
	WebElement electronics;
	
	public @FindBy(linkText = "Apparel & Shoes")
	WebElement shoes;
	
	public @FindBy(linkText = "Digital downloads")
	WebElement digital;
	
	public @FindBy(linkText = "Jewelry")
	WebElement jwelry;
	
	public @FindBy(linkText = "Gift Cards")
	WebElement gift;
	
	public void books()
	{
		book.click();
	}
	
	public void computer()
	{
		computer.click();
	}
	
	public void electronics()
	{
		electronics.click();
	}
	public void shoes()
	{
		shoes.click();
	}
	public void digital()
	{
		digital.click();
	}
	public void jwellery()
	{
		jwelry.click();
	}
	public void gift()
	{
		gift.click();
	}

}
