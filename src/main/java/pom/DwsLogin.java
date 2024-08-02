package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {
	
	public DwsLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(className = "ico-login")
	WebElement login_link;
	
	private @FindBy(id = "Email")
	WebElement username;
	
	private @FindBy(name = "Password")
	WebElement passwrod;
	
	private @FindBy(xpath = "//input[@value='Log in']")
	WebElement login_button;
	
	public void getloginLink()
	{
		login_link.click();
	}
	
	public void getUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void getPassword(String pass)
	{
		passwrod.sendKeys(pass);
	}
	
	public void getLoginBut()
	{
		login_button.click();
	}

}
