package dependonMethodDisc;

import org.testng.annotations.Test;

public class Dependancy2 {
	
	@Test(priority = 1)
	public void login() 
	{
		System.out.println("login to the application");
		throw new NullPointerException();
	}
	@Test(priority = 2,dependsOnMethods ="login" )
	public void dashboard() 
	{
		System.out.println("dashboard");
	}
	@Test(priority = 3)
	public void profile() 
	{
		System.out.println("profile");
	}
	@Test(priority = 4,dependsOnMethods ={"dashboard","profile"} )
	public void logout() 
	{
		System.out.println("logout");
	}
	@Test(priority = 5)
	public void payment() 
	{
		System.out.println("payment");
	}
	


}
