package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Actions act = new Actions(driver);
        org.openqa.selenium.WebElement usrname = driver.findElement(By.id("txtUsername"));
        act.sendKeys(Keys.TAB).sendKeys(usrname,"Admin").build().perform();
     
    
        
        org.openqa.selenium.WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        act.sendKeys(Keys.TAB).sendKeys(password,"admin123"). build().perform();
        act.sendKeys(Keys.ENTER).perform();
        
//        driver.findElement(By.xpath("//*[@id='welcome']")).click();
        
       driver.findElement(By.xpath("//*[text()='Logout']")).click();
        
        
           		  
//          
          
      
	}

}
