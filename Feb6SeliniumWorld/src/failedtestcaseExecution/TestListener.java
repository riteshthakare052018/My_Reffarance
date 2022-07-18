package failedtestcaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListener {
	 static WebDriver driver ;
	@Test
	public void LoginWithIncorrectData() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		    driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   
		    
	       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       driver.findElement(By.id("txtPassword")).sendKeys("addmin123");
	       driver.findElement(By.className("button")).click();
	       
	       String address = driver.getCurrentUrl();
	       boolean exacttext = address.contains("Dashboard");
	       boolean expectedcondition = true;
	       
	       Assert.assertEquals(exacttext, expectedcondition);
		
	}

}
