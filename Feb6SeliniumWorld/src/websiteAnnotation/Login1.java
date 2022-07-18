package websiteAnnotation;

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

public class Login1 {
	
	
	@BeforeSuite
	public void beforesuitMethod() 
	{
		System.out.println("it will run before suit");
		System.out.println();
	}	
	@AfterSuite
	public void aftersuitMethod() 
	{
		System.out.println("it will run after suit");
		System.out.println();
	}
	@BeforeTest
	public void beforetestMethod() 
	{
		System.out.println("it will run before Test");
		System.out.println();
	}
	@AfterTest
	public void aftertestMethod() 
	{
		System.out.println("it will run after Test");
		System.out.println();
	}
	
	
	@BeforeClass
	public void beforeclassMethod() 
	{
		System.out.println("it will run before CLASS");
		System.out.println();
	}
	@AfterClass
	public void afterclassMethod() 
	{
		System.out.println("it will run after CLASS");
		System.out.println();
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("this is Fist method1");
		System.out.println();
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("this is last method2");
		System.out.println();
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
