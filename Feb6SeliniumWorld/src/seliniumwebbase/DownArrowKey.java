package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DownArrowKey {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.google.co.in/");
	   driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("latest");
	   Thread.sleep(2000);
	   
	   
	   Actions  actn = new Actions(driver);
	            actn.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	            sendKeys(Keys.ENTER).
	            build().perform();
	   
	   
		
		
			
	
	
	}

}
