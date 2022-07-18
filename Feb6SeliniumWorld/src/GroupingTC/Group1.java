package GroupingTC;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(priority = 1,groups = "smoke")
	public void login() 
	{
	System.out.println("login to the application");	
	}
	
	@Test(priority = 2, groups = {"system and functional","smoke" })
	public void corefunctionality() 
	{
		System.out.println("corefunctionality");
	}
	
	@Test(priority = 3, groups = "re-testing")
	public void profile() 
	{
		System.out.println("profile");
	}
	
	@Test(priority = 4, groups = "regression")
	public void logout() 
	{
		System.out.println("logout");
	}
	
	@Test(priority = 5, groups = "UAT")
	public void payment() 
	{
		System.out.println("payment");
	}
	

}
