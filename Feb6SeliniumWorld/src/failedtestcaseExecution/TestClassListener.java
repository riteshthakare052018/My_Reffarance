package failedtestcaseExecution;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seliniumwebbase.CapteringScreenShotInProject;

public class TestClassListener extends TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed:"+result.getName());
	    
				
					try {
						CapteringScreenShotInProject.takescrnshot(driver, result.getName());
					} catch (IOException e) {
						System.out.println("Exception arrived while taking the screen shot");
					} catch (InterruptedException e) {
					
					}
				 
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped:"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started:"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed:"+context.getName());
	}

}
