package configurationAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalAnnotation {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After test");
	}
	
	@Test
	public void testcase()
	{
		System.out.println("test case");
	}

}
