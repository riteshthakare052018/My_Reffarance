package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@class='panelContainer']//a[text()='Logout']")).click();// relative x path
			driver.findElement(By.linkText("Logout")).click();// by using linktext

	}

}
