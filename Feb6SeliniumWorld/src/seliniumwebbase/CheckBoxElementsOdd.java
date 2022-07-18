package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxElementsOdd {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
        
//        List<WebElement> multiple = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
//        
//        for(WebElement value:multiple) 
//        {
//        	              int i = multiple.indexOf(value);
//        	              System.out.println(store);
//        	              
//        	              if(i%2==0) 
//        	              {
//        	            	  value.click();
//        	              }
//        }
		
        
        
        List<WebElement> multiple1 = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
                      int l = multiple1.size();
                      
                      for(int i=0; i<l;i++) 
                      {
                    	  
                    	  if(i%2==0) 
                    	  {
                    		  multiple1.get(i).click();
                    	  }
                      }
		 
		
	}

}
