package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHimalaya {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
	       driver.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
	       Thread.sleep(3000);
	     WebElement date = driver.findElement(By.xpath("(//tbody//tr//td//a[text()='25'])[2]"));  
	                date.click();
	       
	                System.out.println("**********************************************************************");
	                
	                
	                driver.get("https://www.redbus.in/");
	                driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();
	                Thread.sleep(3000);
	              WebElement click = driver.findElement(By.xpath("//*[@class='rb-monthHeader']"));
	         	             click.click();
	                      
	                
	                for(int i=0; i<=10; i++)
	                {
	                	if(click.getText().equals("Aug2022")) 
	                	{
	                		 click.click();
	                	}
	                	
	                }
	                
	                
	                
	}

}
