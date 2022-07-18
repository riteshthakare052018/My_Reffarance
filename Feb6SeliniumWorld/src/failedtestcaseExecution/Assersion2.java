package failedtestcaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assersion2 {
	
	@Test
	public void hardAssertion() 
	{
		System.out.println("1st line");
		System.out.println("2nd line");
		
		int i = 20;
		int j = 30;
		boolean value = i>j;
		Assert.assertTrue(true);// true
		System.out.println("3rd line");	
		System.out.println("4th line");
		Assert.assertTrue(value);//  actual result is false
	}

}
