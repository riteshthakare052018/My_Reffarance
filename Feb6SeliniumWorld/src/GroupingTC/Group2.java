package GroupingTC;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(priority = 1, groups ="system and functional")
	public void chatbox() 
	{
		System.out.println("user should check be chatbox");
	}
	
	@Test(priority = 2, groups = {"system and functional","smoke" })
	public void register() 
	{
		System.out.println("user should be register");
	}

}
