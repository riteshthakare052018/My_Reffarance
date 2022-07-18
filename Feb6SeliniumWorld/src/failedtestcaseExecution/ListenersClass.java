package failedtestcaseExecution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case start:"+result.getMethod());//testcase1
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case passed:"+result.getName());//testcase 2
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed :"+result.getName());//testCase1() 
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("test case skipped:"+result.getName());//testcase3
	}

//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//
//	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("tests started:"+context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("tests completed:"+context.getName());
	
	}
	
	

}
