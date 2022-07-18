package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		              WebDriver driver = new ChromeDriver();
		              
		              driver.manage().window().maximize(); 
		              driver.get("https://opensource-demo.orangehrmlive.com/");
		             org.openqa.selenium.WebElement usrname = driver.findElement(By.id("txtUsername"));
     	                                             usrname.click();
		                                             usrname.sendKeys("Admin");
		                                        
//		                                             LOCATE THE PASSWORD WEBELEMENT
		              org.openqa.selenium.WebElement password = driver.findElement(By.name("txtPassword"));
		                                             password.click();
		                                             password.sendKeys("admin123");
		                                           
	                                           
//		                                             LOCATE THE LOGINBUTTON
		              
		            org.openqa.selenium.WebElement loginbutton = driver.findElement(By.className("button"));
		                                           loginbutton.click();
//		                                           driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		                                           driver.findElement(By.xpath("//*[@class='panelTrigger']")).click();
		                                   
//		                                           
//		           org.openqa.selenium.WebElement linktext = driver.findElement(By.partialLinkText("got your p"));
//		                                         Thread.sleep(3000);
//		                                          linktext.click();            
		                                           
		                System.out.println("**************************************************************");
		                                           
//		                                           LOCATE THE LINKTEXT
		                
//		                driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode"); 
//	    
//		                                         
//		                org.openqa.selenium.WebElement linktxt = driver.findElement(By.id("securityAuthentication_userName")); 
//		                                          linktxt.sendKeys("Admin");
		                                          
		                                          
//		                 org.openqa.selenium.WebElement resetpwd = driver.findElement(By.className("searchValues"));
//		                                                resetpwd.click();
//		                                                
//		                  org.openqa.selenium.WebElement cancle = driver.findElement(By.className("cancel"));
//		                                                 cancle.click();
//		                                                 Thread.sleep(3000);
//		                                                 driver.close();
		                                                 
//		              org.openqa.selenium.WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
//				                                         logo.click();    
//				                                         
//				       driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//				       driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		                                                 
		         System.out.println("********************************************************************************************");   
		         
		         
//		            org.openqa.selenium.WebElement text = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
//                                                    System.out.println(text.getText());	
//		                                                  driver.findElement(By.xpath("(//*[@class='firstLevelMenu'])[1]")).click();
//		                                                  driver.findElement(By.xpath("(//*[@class='firstLevelMenu'])[2]")).click();
//		                                                  Thread.sleep(3000);
//		                                                  driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']")).click();
//		                                                  driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_3']")).click();
		                                                  driver.findElement(By.xpath("//*[@class='paging bottom']")).click();
		                                                  driver.findElement(By.xpath("(//*[@class='firstLevelMenu'])[3]")).click();
		                                                  
		                                                
}
}
