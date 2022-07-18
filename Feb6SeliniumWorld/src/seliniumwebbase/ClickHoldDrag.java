package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldDrag {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
		   driver.get("https://jqueryui.com/slider/");
		   
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		           driver.switchTo().frame(iframe);                               // frame coversion
		           
		 WebElement button = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));// choosing webelemt
		   
			Actions act = new Actions(driver);
			        act.clickAndHold(button).moveByOffset(380, 0).build().perform();
			        Thread.sleep(1000);
			        act.clickAndHold(button).moveByOffset(-380, 0).release().build().perform();
			        
			        driver.switchTo().parentFrame();                             // again frame conversion
			        driver.findElement(By.xpath("//*[@role='complementary']//a[text()='Droppable']")).click();
    WebElement iframe2 = driver.findElement(By.xpath("//*[@class='demo-frame']"));     
                         driver.switchTo().frame(iframe2);// // again frame conversion 
                         
                       WebElement drgelement = driver.findElement(By.xpath("//*[@id='draggable']"));
                          WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
                       act.clickAndHold(drgelement).dragAndDrop(drgelement,drop ).release(). build().perform();
                       
			        
	}

}
