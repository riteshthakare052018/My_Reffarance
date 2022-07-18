package multipleTCannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Payment {

	
	@Test 
	public void address() 
	{
		System.out.println("it should be edit address ");
	}
	@Test (priority = 1)
	public void count() 
	{
		System.out.println("it should be count of the product");
		Reporter.log("this is the test case 2",true);
	}
	@Test (priority = 2)
	public void placed() 
	{
		System.out.println("it should be placed the product");
		Reporter.log("this is the test case 3",true);
	}
}
