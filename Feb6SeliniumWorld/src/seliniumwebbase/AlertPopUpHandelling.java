package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandelling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	       driver.findElement(By.xpath("//*[@value='Alert']")).click();
	       Thread.sleep(3000);
	       
	     String switching = driver.switchTo().alert().getText();
	     System.out.println("massage over the popup is :"+switching);
	                         driver.switchTo().alert().accept();
	                         
	                         //next button
	                         
	                         driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	              	       Thread.sleep(3000);
	              	       
	              	     String convert = driver.switchTo().alert().getText();
	              	     System.out.println("massage over the popup is :"+convert);
	              	                         driver.switchTo().alert().dismiss();
	      
	       System.out.println("***********************************************************************************");
	       
	       driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
	       driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
	       Thread.sleep(3000);
	       
	                            String txe = driver.switchTo().alert().getText();
	                               System.out.println("massage over the pop up is :"+txe);
	                                          driver.switchTo().alert().accept();
	                               
	       
	       
	}

}
