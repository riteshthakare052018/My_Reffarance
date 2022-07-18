package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableOrDisable {
	
	public static void main(String[] args) {
		
	
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize(); 
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        
	        
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.className("button")).click();
	        
	        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
	        
	        
	      WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_5']"));
	       boolean clickable = checkbox.isEnabled();// true
	       System.out.println(clickable);
	       
	       
	       checkbox.click();
	       boolean clicked = checkbox.isSelected();
	       System.out.println(clicked);// true
	       
	    WebElement hiddenelement = driver.findElement(By.xpath("(//*[@type='hidden'])[1]"));// if we have give wrong x path which is not available in html dom it will give an exception "Nosuchelelementfound"
	  boolean check = hiddenelement.isDisplayed();
	  System.out.println(check);// false
	       
	       
	}

}
