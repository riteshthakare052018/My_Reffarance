package failedtestcaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssersionDisk {
	
	
	@Test
	public void testcase1() 
	{
		System.out.println("1st line");
		System.out.println("2nd line");
		
		int i = 20;
		int j = 30;
		boolean value = i>j;
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(value);
	
		System.out.println("3rd line");	
		System.out.println("4th line");
		sa.assertAll();// it will check condition true or false if  condition is true then it will passed the TC otherwise it will failed tc
		

}
}
