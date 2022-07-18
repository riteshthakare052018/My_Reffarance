package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	@Test(dataProvider = "testdata", dataProviderClass = dataDrivenTesting.HardCodeData.class)
	public void testcases(String run1, String run2) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\chromedriver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		       
		       
	      driver.get("https://www.facebook.com/login/");
	      driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(run1);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(run2);
		
		
	
		
	}

}
