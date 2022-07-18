package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWindowHandelled {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.google.com/");
	       driver.navigate().refresh();
	       Thread.sleep(2000);
	         WebElement search = driver.findElement(By.xpath("//*[@aria-label='Search']"));
	                    search.sendKeys("windows");
	              
//	                 Thread.sleep(2000);
	             
	                 
	                Thread.sleep(2000);
	        List<WebElement> autosrch = driver.findElements(By.xpath("//*[@jsaction='click:.CLIENT;mouseover:.CLIENT']//span[contains(text(),'windows')]"));
	               Thread.sleep(2000); 
	                int sz = autosrch.size();
	                
	                for(int i=1;i<=sz; i++) 
	                {
	                String stre = autosrch.get(i).getText();
	                System.out.println(stre);
	                
	                if(stre.equals("windows 11 download")) 
	                {
	                	autosrch.get(i).click();
	                	break;
	                }
	                	
	                }
	            
	                	
	                	
	                	
	                
	                
	                
	}
	}


