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

public class Homepage {
	
	
	@AfterTest
	public void aftertestMethod() 
	{
		System.out.println("it will run after TEST");
	}
	@BeforeClass
	public void beforeclassMethod2() 
	{
		System.out.println("it will run before CLASS");
	}
	@AfterClass
	public void afterclassMethod2() 
	{
		System.out.println("it will run after CLASS");
	}
	@BeforeMethod
	public void beforeMethod2() 
	{
		System.out.println("this is before method1");
	}
	@AfterMethod
	public void afterMethod2() 
	{
		System.out.println("this is last method2");
	}
	
	
//	@Test 
//	public void search() 
//	{
//		System.out.println("it should be search the product");
//	}
//	@Test (priority = 1)
//	public void check() 
//	{
//		System.out.println("it should be check the product");
//		Reporter.log("this is the test case 2",true);
//	}
	@Test 
	public void verify4() 
	{
		System.out.println("it should be verify4 the product");
		Reporter.log("this is the test case 3",true);
	}

}
