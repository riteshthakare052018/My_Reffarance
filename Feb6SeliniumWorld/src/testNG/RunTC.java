package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunTC {
	
	
	@Test
	public void firstTC()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    System.out.println("first TC executed");

	}
	@Test
	public void secondTC()
	{
		System.out.println("second TC get executed");
	}
	

}
