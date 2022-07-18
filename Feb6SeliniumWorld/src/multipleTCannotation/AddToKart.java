package multipleTCannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToKart {
	
	@Test 
	public void add() 
	{
		System.out.println("it should be add the product");
	}
	@Test (priority = 1)
	public void remove() 
	{
		System.out.println("it should be remove the product");
		Reporter.log("this is the test case 2",true);
	}
	@Test (priority = 2)
	public void change() 
	{
		System.out.println("it should be change the product");
		Reporter.log("this is the test case 3",true);
	}

}
