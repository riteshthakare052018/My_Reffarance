package failedtestcaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	@BeforeClass
	public void chrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	@Test
	public void logo() {
		WebElement logo = driver.findElement(By.xpath("//*[@src='/webres_6250f4bfde6e67.02511676/themes/default/images/login/logo.png']"));
		boolean actual = logo.isDisplayed();
		Assert.assertTrue(actual);
	}
	@Test
	public void title() {
		String title = driver.getTitle();
		String Expected = "orangeHRM";
		Assert.assertEquals(title, Expected);
		
	}
	@Test
	public void close() {
		driver.quit();
	

	}

}
