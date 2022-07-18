package seliniumwebbase;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			//MOVING MOUSE CURSOR
			
	WebElement hovour = driver.findElement(By.xpath("//*[@id='sub-menu']"));
	          Actions act = new Actions(driver);  //    *****WE WILL USE MULTIPLE TIME
	              act.moveToElement(hovour).perform();
	              Thread.sleep(1000);
	                    driver.findElement(By.xpath("//*[@id='link3']")).click();
	                   
	              
	              
	              driver.navigate().back();
	              
	              // DOUBLECLICK
	              
	          	WebElement doubleclik = driver.findElement(By.xpath("//*[@id='double-click']"));
	          	  act.doubleClick(doubleclik).perform();
	          	  Thread.sleep(1000);
	          	  driver.switchTo().alert().accept();
	          	  
	          	  //RIGHT CLICK
	          	  
	            WebElement upload = driver.findElement(By.xpath("//*[@name='upload']"));
	                       act.contextClick(upload).perform();
	                       

//	               		Robot robo = new Robot();
//
//	               		robo.keyPress(MenuKeyEvent.VK_DOWN);
//	               		robo.keyPress(MenuKeyEvent.VK_DOWN);
//	               		robo.keyPress(MenuKeyEvent.VK_ENTER);
	                       
	       
	        WebElement AccountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	        WebElement CreatList = driver.findElement(By.xpath("//span[text()='Create a List']"));     
	        
//	        Actions act = new Actions(driver);
	                 
	        act.moveToElement(AccountList).perform();
	        act.moveToElement(CreatList).perform();
	        act.click().perform();
	        
	        act.moveToElement(AccountList).moveToElement(CreatList).click().build().perform();
	        
	        
	        act.doubleClick(CreatList).perform();
	        act.contextClick(CreatList).perform();
	        act.dragAndDrop(AccountList, CreatList);
	        
	        
	        
	          
		
	}

}
