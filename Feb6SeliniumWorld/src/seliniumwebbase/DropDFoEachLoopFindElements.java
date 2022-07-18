package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDFoEachLoopFindElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.facebook.com/signup");
	 List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		         
	 for(WebElement value0:dayvalues) 
	 {
	         String text = value0.getText();
	         System.out.println(text);
	         
	         if(text.equals("16")) 
	         {
	        	 value0.click();
	         }
	         
	 }
                 
	List<WebElement> monthsvalue = driver.findElements(By.xpath("//*[@id='month']//option"));
	                 for( WebElement value1 :monthsvalue) 
	                 {
	                	                String text1 = value1.getText();
	                	                if(text1.equals("Apr"))
	                	                {
	                	                	
	                	                	value1.click();
	                	                	
	                	                }
	                 }
	                 
	             List<WebElement> yearvalue = driver.findElements(By.xpath("//*[@id='year']//option"));
	             
	             for(WebElement year:yearvalue) 
	             {
	              String num = year.getText();
	              if(num.equals("1995")) 
	              {
	            	  year.click();
	              }
	              
	             }
}
}
