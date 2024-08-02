package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreData2Dimensional {
	
	@DataProvider(name="data")
	public  Object[][] sender()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "sanjay";
		obj[0][1] = "shubya";
		obj[1][0] = "saurabh";
		obj[1][1] = "sagar";
		
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void receiver(String data1,String data2)
	{
		System.out.println(data1);
		System.out.println(data2);
	}

}
