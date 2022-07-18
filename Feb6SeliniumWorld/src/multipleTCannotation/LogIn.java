package multipleTCannotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn {
	
	@BeforeSuite
	public void beforesuitMethod() 
	{
		System.out.println("it will run before suit");
	}
	@AfterSuite
	public void aftersuitMethod() 
	{
		System.out.println("it will run after suit");
	}
	@BeforeTest
	public void beforetestMethod() 
	{
		System.out.println("it will run before TEST");
	}
	
	@BeforeClass
	public void beforeclassMethod() 
	{
		System.out.println("it will run before CLASS");
	}
	@AfterClass
	public void afterclassMethod() 
	{
		System.out.println("it will run after CLASS");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("this is Fist method1");
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("this is last method2");
	}
	
	
	
	@Test 
	public void username1() 
	{
		System.out.println("it should be accept the username");
	}
	@Test (priority = 1)
	public void password2() 
	{
		System.out.println("it should be accept the password");
		Reporter.log("this is the test case 2",true);
	}
	@Test (priority = 2)
	public void submit3() 
	{
		System.out.println("it should be accept the submit");
		Reporter.log("this is the test case 3",false);
	}

}
