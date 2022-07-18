package testClasses;

import org.testng.annotations.Test;

import pages.Homepage;

public class Hometest extends BaseTest {
	@Test
	public void selectInsurance() throws InterruptedException {
		hp.selectInsurance("health");
}

}
