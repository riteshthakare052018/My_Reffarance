package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       
//	                LOGIN PAGE
	       driver.get("https://zoom.us/signup");
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
	      WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
	                 month.click();
	       
	             	WebElement april = driver.findElement(By.xpath("//*[@id='select-item-select-0-6']"));
	        		
	        		april.click();
	                          
//	                  driver.findElement(By.xpath("//*[@id='select-0']")).click();
//	                  driver.findElement(By.xpath("//*[@id='select-item-select-1-6']")).click();
	        		
	        		
//	       
//	       
	}

}
