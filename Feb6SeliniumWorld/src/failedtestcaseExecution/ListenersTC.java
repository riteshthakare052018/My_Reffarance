package failedtestcaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTC {
	
	
	@Test
	public void testCase1() 
	{
		System.out.println("this is first line ");
		System.out.println("this is second line ");
		int i = 10;
		int j = 20;
		boolean value = i>j;
		Assert.assertTrue(value);
		
		System.out.println("this is third line ");
		System.out.println("this is fourth line ");
	}
	@Test
	public void testcase2() 
	{
		System.out.println("this fifth line");
		System.out.println("this is sixth line");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods = "testCase1")
	public void testcase3() 
	{
		System.out.println("this is seventh line");
		Assert.assertTrue(true);
	}
	

}
