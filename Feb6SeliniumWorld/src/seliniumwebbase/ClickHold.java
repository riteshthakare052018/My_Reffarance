package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
		   driver.get("https://jqueryui.com/slider/");
		   
		   driver.findElement(By.linkText("Droppable")).click();

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		   driver.switchTo().frame(iframe);
	        
		   
		 WebElement hold = driver.findElement(By.xpath("//*[@id='draggable']"));
		 
		 WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		 
		       Thread.sleep(3000);
				Actions act = new Actions(driver);
		                
     	                act.clickAndHold(hold).moveToElement(drop).click().build().perform();
//		                act.clickAndHold(hold).dragAndDrop(hold, drop).release().build().perform();
		                

	}

}
