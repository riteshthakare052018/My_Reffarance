package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingScrollBar {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			// xpath
			 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
			Thread.sleep(2000);
		                   JavascriptExecutor js = (JavascriptExecutor) driver;
//			                                      js.executeScript("window.scrollBy(0,1000)");
//			                                      Thread.sleep(2000);
//			                                      js.executeScript("window.scrollBy(0,-500)");
		                   
		                 WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_8']"));
		                                            js.executeScript("arguments[0].scrollIntoView();",checkbox);
		                                            checkbox.click();

	       
//			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

}
