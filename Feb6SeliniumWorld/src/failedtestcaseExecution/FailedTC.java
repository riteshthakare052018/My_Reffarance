package failedtestcaseExecution;

import org.testng.annotations.Test;

public class FailedTC {
	
	@Test
	public void login() 
	{
		System.out.println("login to the application");
		throw new NullPointerException();
	}
	@Test(priority = 1, dependsOnMethods = "login")
	public void dashboard() 
	{
		System.out.println("dashboard");
	}
	@Test(priority = 2 )
	public void profile() 
	{
		System.out.println("profile");
	}
	@Test(priority = 3 )
	public void logout() 
	{
		System.out.println("logout");
	}


}
