package ParameterInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class LaunchingBrowserURL {
    @org.testng.annotations.Parameters("address")
	@Test
	public void directurl(String URL) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		if(URL.contains("whatsapp")) 
		{
			driver.get(URL);
		}else 
		{
			driver.get("https://www.google.co.in/");
		}
	}
    @org.testng.annotations.Parameters({"environment","version"})
    public void buildInfo(String env,String version) 
    {
    	System.out.println("working environment is:"+env);
    	System.out.println("build version is:"+version);
   
    }

}
