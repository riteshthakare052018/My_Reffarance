package BrowserAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AcualAnnotation {
	@BeforeSuite
	public void openBrowser() 
	{
		System.out.println("it should be open the browser");	
	}
	@AfterSuite
	public void quiteBrowser() 
	{
		System.out.println("it should be quite the browser");	
	}
	@BeforeTest
	public void navigateTourl() 
	{
		System.out.println("it should be navigateTo direct url ");	
	}
	@AfterTest
	public void backTourl() 
	{
		System.out.println("it should be back To direct url ");	
	}
	@BeforeClass
	public void loginapp() 
	{
		System.out.println("it should be login in to app ");	
	}
	@AfterClass
	public void logoutapp() 
	{
		System.out.println("it should be logout in to app ");	
	}
	@BeforeMethod
	public void testcasesection() 
	{
		System.out.println("it should be navigate testcasesection ");	
	}
	@AfterMethod
	public void exittestcasesection() 
	{
		System.out.println("it should be Exiit testcasesection ");	
	}
	
	@Test
	public void myTC() 
	{
		System.out.println("it should be execute TC ");	
	}
	
	
	
	

}
