package dependonMethodDisc;

import org.testng.annotations.Test;

public class DependOnAnotherMethod  {
	
	@Test(priority = 1,dependsOnMethods = "dependonMethodDisc.Dependancy2.dashboard" )
	public void myinfo() 
	{
		System.out.println("myinfo");
	}
	@Test(priority = 6)
	public void dropbox() 
	{
		System.out.println("dropbox");
	}


}
