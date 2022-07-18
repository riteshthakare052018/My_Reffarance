package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\chromedriver2\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	    driver.get("https://www.google.co.in/");
	   WebElement key = driver.findElement(By.xpath("//*[@aria-label='Search']"));
	              key.sendKeys("selenium");
	              Thread.sleep(1000);
	    
	   List<WebElement> selection = key.findElements(By.xpath("//*[@role='listbox']//span[contains(text(), 'selenium')]"));
	   Thread.sleep(1000);
	    for(WebElement sele:selection) 
	    {
//	    	     String tex = sele.getText();
//	    	     System.out.println(tex);
	    	     
    	     if(sele.getText().equals("selenium webdriver"))
	    	     {
	    	    	      sele.click();
//	    	    	      break;
	    	     }
	    	     
	    }
}

}
