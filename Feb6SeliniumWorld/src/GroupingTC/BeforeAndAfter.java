package GroupingTC;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAndAfter {
	
	@BeforeGroups(groups = "smoke")
	public void login() 
	{
	System.out.println("login to the application BeforeGroups");	
	}
	
	@Test(priority = 2, groups = {"system and functional","smoke" })
	public void corefunctionality() 
	{
		System.out.println("corefunctionality");
	}
	
	@Test(priority = 3, groups = {"re-testing","regression"})
	public void profile() 
	{
		System.out.println("profile");
	}
	
	@AfterGroups( groups = "regression")
	public void logout() 
	{
		System.out.println("logout AfterGroups");
	}
	
	@Test(priority = 5, alwaysRun = true)
	public void payment() 
	{
		System.out.println("payment");
	}

}
