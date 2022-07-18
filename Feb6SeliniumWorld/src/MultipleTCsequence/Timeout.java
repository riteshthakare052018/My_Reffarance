package MultipleTCsequence;

import org.testng.annotations.Test;

public class Timeout {
	
	@Test (priority = -1,invocationCount = 3,timeOut = 2)
	public void login () throws InterruptedException 
	{
		System.out.println("user should be login");
		Thread.sleep(3000);
	}
	@Test
	public void logout() 
	{
		System.out.println("user should be logout");
	}

}
