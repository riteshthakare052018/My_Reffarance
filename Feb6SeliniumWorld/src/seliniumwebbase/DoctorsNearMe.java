package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DoctorsNearMe {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.google.co.in/");
	       WebElement key = driver.findElement(By.xpath("//*[@aria-label='Search']"));
	                  key.sendKeys("Doctors near me");
	                  Thread.sleep(1000);
	                  
	      List<WebElement> multiple = driver.findElements(By.xpath("//*[@role='presentation']//span[text()='doctors near me']"));
	         Thread.sleep(1000);
	         
	         for( WebElement selection : multiple) 
	         {
 
	                   if(multiple.equals("Doctors near me for home visit"));
	                   {
	                	   selection .click(); 
	                	   break;
	                   }
	                             
	         }
	                           Thread.sleep(4000);
	                                  driver.findElement(By.xpath("//*[@class='MXl0lf tKtwEb wHYlTd']")).click();
	                                  Thread.sleep(3000);
//	                                  driver.findElement(By.xpath("//*[text()='Dr. Pradhan']")).click();
	                                  
	                                  
	                   List<WebElement> total = driver.findElements(By.xpath("//*[@class='rlfl__tls rl_tls']//*[contains(@role,'heading')]"));
	                   
	                   for(WebElement itrate:total) 
	                   {
	                	 String name = itrate.getText();
	                	 System.out.println(name);
	                	 
	                	 if(name.equals("Dr Mukhi Clinic")) 
	                	 {
	                		 itrate.click();
	                	 }
	                   }
	}
}