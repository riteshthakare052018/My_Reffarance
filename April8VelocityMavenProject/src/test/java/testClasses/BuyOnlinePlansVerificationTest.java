package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BuyOnlinePlan;

public class BuyOnlinePlansVerificationTest extends BaseTest {
	@Test(priority = 1)
	public void buyplans() {
		
		onlineplans.selectionplan();
		String exacturl = onlineplans.geturl();
		String expectedurl = "retirement";
		boolean ispresent = exacturl.contains(expectedurl);
		Assert.assertTrue(ispresent);

		
	}

}
