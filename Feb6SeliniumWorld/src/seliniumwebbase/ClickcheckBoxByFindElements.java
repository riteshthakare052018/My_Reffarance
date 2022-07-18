package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickcheckBoxByFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
        Thread.sleep(3000);
       List<WebElement> multiple = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
                        
        
        for(WebElement add:multiple) 
        {
        	add.click();
        }
        
        
        //  for unclick
        
        Thread.sleep(3000);
        
    List<WebElement> multiple1 = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
                        
        
        for(WebElement unclick:multiple1) 
        {
        	unclick.click();
        }
        
		
        
      WebElement isclick = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_2']"));
    boolean confermation = isclick.isSelected();
    System.out.println(confermation);
    
    isclick.click();
    boolean confermation1 = isclick.isSelected();
    System.out.println(confermation1);
    
    
             String atrbute = isclick.getAttribute("id");
             System.out.println(atrbute);
}

}
