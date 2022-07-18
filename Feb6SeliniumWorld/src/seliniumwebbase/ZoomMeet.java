package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ZoomMeet {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       
//	                LOGIN PAGE
	       driver.get("https://zoom.us/signup");
	       driver.manage().window().maximize();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
	       driver.findElement(By.xpath("(//*[@class='zm-select__caret zm-input__icon zm-icon-up'])[1]")).click();
	       Thread.sleep(3000);
//	       driver.findElement(By.xpath("//*[@id='select-item-select-0-0']")).click();
	       
	      WebElement march = driver.findElement(By.xpath("//*[@id='select-item-select-0-2']"));
	                march.sendKeys("March");
	                march.click();
	                
	                  WebElement day = driver.findElement(By.xpath("//*[@id='select-1']"));
	                  day.click();
	                  Thread.sleep(3000);
	                      driver.findElement(By.xpath("//*[@id='select-item-select-1-3']")).click();
	             
	                   WebElement year = driver.findElement(By.xpath("(//*[@class='zm-scrollbar__view'])[5]"));
		               year.click();
		               Thread.sleep(3000);
		               driver.findElement(By.xpath("//*[@id='select-item-select-2-5']")).click();
	                      
	              // find Hidden value in dropdown       
		               driver.navigate().refresh();
		               Thread.sleep(3000);
		                       
		            WebElement day25 = driver.findElement(By.xpath("//*[@id='select-1']"));
		            day25.click();
		           WebElement day25A = driver.findElement(By.xpath("//*[@id='select-item-select-1-24']"));
		            
		                        JavascriptExecutor js = (JavascriptExecutor)driver;
		                       js.executeScript("arguments[0].scrollIntoView();",day25A );
		                       day25A.click();
		               
		               
	                      
	                      
	                      
	                      
	                      
	                      
	                      
//                    WebElement drpcntry = driver.findElement(By.xpath("//*[@id='select-1']"));
//                    Select drop = new  Select(drpcntry);
//                         List<WebElement> multipleop = drop.getOptions();
//                         
//                         for(WebElement option:multipleop) 
//                         {
//                        	 if(option.getText().equals("23")) 
//                        	 {
//                        		 option.click();
//                        		 break;
//                        	 }
                         }
                    
       
              
          
	                
	          
	       
	                
    
	}          

