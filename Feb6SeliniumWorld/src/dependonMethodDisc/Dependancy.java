package dependonMethodDisc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependancy {
	@Test
	public void login() 
	{
		System.out.println("login to the application");
		throw new NullPointerException();
	}
	@Test(priority = 1,dependsOnMethods ="login" )
	public void dashboard() 
	{
		System.out.println("dashboard");
	}
	@Test(priority = 3,dependsOnMethods ="dashboard" )
	public void logout() 
	{
		System.out.println("logout");
	}

}
