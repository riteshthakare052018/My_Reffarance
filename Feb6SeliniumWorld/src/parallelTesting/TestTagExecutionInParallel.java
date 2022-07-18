package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTagExecutionInParallel {
	@Parameters("Address")
	@Test
	public void GetURL(String value) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(value);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		
	}

}
