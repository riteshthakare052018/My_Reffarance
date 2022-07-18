package testNG;

import org.testng.annotations.Test;

public class Sequence {
	
	@Test
	public void house () 
	{
		System.out.println("house TC will executed");
	}
	@Test(priority = 1)
	public void car () 
	{
		System.out.println("car TC will executed");
	}
	@Test(priority = -4)
	public void bike () 
	{
		System.out.println("bike TC will executed");
	}
	@Test(priority = -400)
	public void prince () 
	{
		System.out.println("prince TC will executed");
	}

//	iv. If we don’t define priority to the testcase then it automatically takes as 0 priority.
}
