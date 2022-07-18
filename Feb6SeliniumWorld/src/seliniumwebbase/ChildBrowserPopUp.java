package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://groww.in/futures-and-options");
	       Thread.sleep(4000);
	       
	       driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Login/Register']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("ritesh");
	             
	       driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Continue']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	     
	       
		
		
	}

}
