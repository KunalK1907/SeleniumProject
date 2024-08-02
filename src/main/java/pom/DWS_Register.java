package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Register
{
	public DWS_Register(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	private @FindBy(linkText = "Register")
	WebElement register_link;
	
	private @FindBy(id="gender-male")
	WebElement gender;
	
	private @FindBy(id="FirstName")
	WebElement fname;
	
	private @FindBy(id="LastName")
	WebElement lname;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(id="ConfirmPassword")
	WebElement confirm;
	
	private @FindBy(id="register-button")
	WebElement register;
	
	
	public void register_link()
	{
		register_link.click();
	}
	public void gender()
	{
		gender.click();
	}
	public void fName(String name)
	{
		fname.sendKeys(name);
	}
	public void lName(String lName)
	{
		lname.sendKeys(lName);
	}
	public void email(String Email)
	{
		email.sendKeys(Email);
	}
	public void password(String pass)
	{
		
		password.sendKeys(pass);	
	
	}
	public void confirm(String pass)
	{
		
		confirm.sendKeys(pass);	
	
	}
	public void register()
	{
		register.click();
		
	}

}

