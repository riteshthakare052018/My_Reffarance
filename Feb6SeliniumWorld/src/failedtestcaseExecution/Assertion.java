package failedtestcaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void hardAssertion() 
	{
		System.out.println("1st line");
		System.out.println("2nd line");
		
		int i = 20;
		int j = 30;
		boolean value = i>j;
		Assert.assertTrue(value);//  actual result is false
		System.out.println("3rd line");
		System.out.println("4th line");
	}

}