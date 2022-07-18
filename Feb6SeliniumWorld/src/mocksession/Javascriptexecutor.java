package mocksession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        
      
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        
       WebElement cl = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
        
             cl.click();
             Thread.sleep(2000);
             
                JavascriptExecutor convert = (JavascriptExecutor)driver;
                
                 convert.executeScript("window.scrollBy(0,1500)");
             
        
 }

}
