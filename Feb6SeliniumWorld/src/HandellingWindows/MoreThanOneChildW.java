package HandellingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreThanOneChildW {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	       Thread.sleep(2000);
	       
	       WebElement ID = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	       Thread.sleep(2000);
	       
	       String parentwinid = driver.getWindowHandle();
	       
	       System.out.println(parentwinid);
	       
	       ID.click();
	       ID.click();
	       ID.click();
	       
	     Set<String> allwindow = driver.getWindowHandles();
	       int sz = allwindow.size();
	      
	       String [] winid = new String[sz];
	       
	       int i = 0;  // parent window
	       
	       for (String id:allwindow) 
	       {																						
	    	   winid[i] = id;
	    	   i++;
	    	   
	       }
	       for(String arraylist:winid) 
	       {
	    	   System.out.println(arraylist);
	       }
	       driver.switchTo().window( winid[1]);
	     
	
	       
	}

}
