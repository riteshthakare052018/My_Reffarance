package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTagExecutionInParallel2 {
	@Parameters("Build info")
	@Test
	public void Getinfo(String value) 
	{
		System.out.println(value);
		
	}

}
