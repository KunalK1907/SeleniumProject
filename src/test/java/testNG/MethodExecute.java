package testNG;

import org.testng.annotations.Test;

public class MethodExecute {
	
	
	
	@Test
	public void main()
	{
		System.out.println("I am TestNG");
	}
	
	@Test
	public void m()
	{
		System.out.println("I am 2nd testNg");
	}
	
	//IF THE CLASS IS HAVING A MULTIPLE TEST CASE IT WILL EXECUTE BASED ON THE ALPHABETICAL ORDER OF THE METHOD NAME (ASCENDING ORDER OF ASCII VALUE)

}
