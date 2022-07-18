package failedtestcaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMassage {
	@Test
	public void errormessage() 
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
	   
       Assert.assertEquals(actualmassage, expectedmassage);

   	System.out.println("Text message comparison done check the results");

	}

}
