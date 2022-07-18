package testNG;

import org.testng.annotations.Test;

public class SequenceofTC {
	
	@Test(priority = 1)
	public void house () 
	{
		System.out.println("house TC will executed");
	}
	@Test(priority = 2)
	public void car () 
	{
		System.out.println("car TC will executed");
	}
	@Test(priority = 3)
	public void bike () 
	{
		System.out.println("bike TC will executed");
	}
	@Test(priority = 1)
	public void prince () 
	{
		System.out.println("prince TC will executed");
	}


}
