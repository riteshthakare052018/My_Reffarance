package testClasses;

import org.testng.annotations.Test;

public class ViewPriceTest extends BaseTest {
	
	@Test
	public void viewPriceClick() throws InterruptedException 
	{
		Vp.pricePlan();
	}

}
