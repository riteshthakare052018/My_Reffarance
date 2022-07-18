package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxMondaySunday {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\chromedriver2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        
//        List<WebElement> allelement = driver.findElements(By.xpath("//*[contains(@id,'day')]"));
//        WebElement sun = driver.findElement(By.xpath("//*[@id='sunday']"));
//        WebElement mon = driver.findElement(By.xpath("//*[@id='monday']"));
//        
//       for(WebElement store:allelement) 
//       {
//    	   if(store.equals(sun)||store.equals(mon)) 
//    	   {
//    		   store.click();
//    	   }
//       }
        
        
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'day')]"));
   
//        String str = elements.toString();
//        int sz = str.length();
//        System.out.println(sz);
        int sz = elements.size()-3;
        
    
        for(int i=sz; i<elements.size(); i++) 
        {
        	
        	elements.get(i).click();
        
        }
       
        

}
}
