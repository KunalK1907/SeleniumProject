package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownloads 
{
	public DigitalDownloads(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(linkText = "Digital downloads")
	WebElement digital;
	
	private @FindBy(id="products-orderby")
	WebElement sortBy;
	
	private @FindBy(id="products-pagesize")
	WebElement display;
	
	private @FindBy(id="products-viewmode")
	WebElement viewAs;
	
	
	public void digital()
	{
		digital.click();
	}
	public void sort()
	{
		Select s=new Select(sortBy);
		List<WebElement>options=s.getOptions();
		int size=options.size();
		for(int i=0;i<size;i++)
		{
			s.selectByIndex(i);
		}
	}
	
	public void display()
	{
		Select s=new Select(display);
		List<WebElement>options=s.getOptions();
		int i=0;
		for(WebElement web:options)
		{
			s.selectByIndex(i++);
		}
	}
	
	public void view()
	{
		Select s=new Select(viewAs);
		List<WebElement>options=s.getOptions();
		int size=options.size();
		for(int i=0;i<size;i++)
		{
			s.selectByIndex(i);
		}
	}

}
