package testNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority = -1, invocationCount =3)
	public void logut () 
	{
		System.out.println("user should be logout");
	}
	@Test
	public void dashboard () 
	{
		System.out.println("user should be seen dashboard");
	}


}
