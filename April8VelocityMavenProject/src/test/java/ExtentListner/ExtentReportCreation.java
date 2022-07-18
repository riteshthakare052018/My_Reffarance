package ExtentListner;

import java.lang.module.ModuleDescriptor.Exports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportCreation {
	
	static ExtentReports extent ;
	public static ExtentReports  extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"//\\Reports//kgitestreport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("InsuranceTestReport");
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project name", "Kotak General Insurance");
		
		extent.setSystemInfo("Environment", "SIT");
		
		extent.setSystemInfo("Executed by", "25 Dec Batch");
		
		return extent;

}}
