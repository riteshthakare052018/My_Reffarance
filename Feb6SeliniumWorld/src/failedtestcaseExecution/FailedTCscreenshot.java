package failedtestcaseExecution;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seliniumwebbase.CapteringScreenShotInProject;

public class FailedTCscreenshot {
	@Test
	public void ss () throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   
		    
	       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       driver.findElement(By.id("txtPassword")).sendKeys("addmin123");
	       driver.findElement(By.className("button")).click();
	       
	       String actualmassage = driver.findElement(By.xpath("//*[text()='Invalid credentials']")).getText();
	       String expectedmassage = "Invalidd credentials";
		 
	 
	       
//	       TakesScreenshot tkss = (TakesScreenshot)driver;
//	       File source = tkss.getScreenshotAs(OutputType.FILE);
//	       File destination = new File("C:\\Users\\rites\\Pictures\\ScreenShotSelinium\\orangehrm.png");
//	       org.openqa.selenium.io.FileHandler.copy(source,destination);
	
	  try 
	   {
		      Assert.assertEquals(actualmassage, expectedmassage);
	   }
	  catch (AssertionError ae)
	  {
		  CapteringScreenShotInProject.takescrnshot(driver,"scr2") ;  
	  }
	
	
	}
}

