package ExtentListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testClasses.BaseTest;

public class ListenerClass extends BaseTest implements ITestListener  {
	public static ExtentTest test;
	ExtentReports extent = ExtentReportCreation.extentReportGenerator();
	 

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case started "+result.getName());
	test=extent.createTest(result.getName());
	
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("test case passed "+result.getName());
	test.log(Status.PASS,"Test case is passed");

	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed "+result.getName());
		test.fail(result.getThrowable());
//		try {
			
//			
//			test.addScreenCaptureFromPath(ScreenShot.captureScreenShotWithreturnPath(driver, result.getName()))
//		} catch (IOException e) {
////			e.printStackTrace();
//			System.out.println("Exception arrived while taking the screen shot");
		
//		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped "+result.getName());
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test  started "+context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test  finished "+context.getName());
		extent.flush();

	}

}
