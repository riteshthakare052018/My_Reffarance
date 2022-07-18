package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		submit.click();
		
//		Thread.sleep(4000);
//		WebElement window = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
//		window.click();
//		WebElement check = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_43']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		js.executeScript("window.scrollBy(0,1000)");
//		js.executeScript("arguments[0].scrollIntoView();", check);
		js.executeScript("arguments[0].value='Admin';", username);
//		js.executeScript("arguments[0].click();", submit);
		
	
		
		
		
		
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//		// xpath
//		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//
//		username.sendKeys("Admin");
//
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//
//		
//	WebElement checkbox = driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", checkbox);
	

	}

		
		
	}


