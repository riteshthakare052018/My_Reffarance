package ReadDataInExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReadTheDataFromPropertyfile {
	@Test
	public void datareading() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"//config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		
		
		String url = prop.getProperty("testthisurl");
		System.out.println(url);
		
		driver.get(prop.getProperty("testthisurl"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String actualerror = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		
		SoftAssert soft = new SoftAssert();
		String expected = "Username cannot be empty";
		
		soft.assertEquals(actualerror, expected);
		System.out.println("Assertion got executed");
		driver.navigate().refresh();
		driver.get("https://meet.google.com/gvv-hnwq-vdx");
		
		soft.assertAll();
	}

}
