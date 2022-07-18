package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
       org.openqa.selenium.WebElement usrname = driver.findElement(By.id("txtUsername"));
                                        usrname.click();
                                       usrname.sendKeys("Admin");
                                  
//                                       LOCATE THE PASSWORD WEBELEMENT
        org.openqa.selenium.WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
                                       password.click();
                                       password.sendKeys("admin123");
                                       driver.findElement(By.id("btnLogin")).click();
 //           
                                       driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
                                       driver.findElement(By.id("searchSystemUser_userName")).sendKeys("shubham");
                                       driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")).click();
                                       
                                       
                                    WebElement hovour = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
                                              Actions act = new Actions(driver);
                                                      act.moveToElement(hovour).perform();
                                                      Thread.sleep(1000);
                                     WebElement hovour1 = driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
                                                          act.moveToElement(hovour1).perform();
                                                          Thread.sleep(1000);
                                                          
                                     WebElement hovour2 = driver.findElement(By.xpath("//*[@id='menu_pim_viewTerminationReasons']"));
                                                          act.moveToElement(hovour2).perform();
                                                          hovour2.click();
                                                          
                                       
                                       
                                       
                                       
                                       
	}

}
