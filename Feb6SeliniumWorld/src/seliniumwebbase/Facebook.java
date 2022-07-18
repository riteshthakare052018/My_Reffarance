package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		       
		       
		/* driver.get("https://www.facebook.com/login/");
		    WebElement login = driver.findElement(By.id("email"));
		               login.sendKeys("ritesh.thakare.79069");
		          
		    WebElement pswd = driver.findElement(By.name("pass"));
		               pswd.sendKeys("MH290534");  
		               
            WebElement BUTTON = driver.findElement(By.id("loginbutton"));
                       BUTTON.click();
                       
                       driver.get("https://www.facebook.com/"); */
                       
                       
                       
                       
//                       SIGNUP PAGE
//		                 NAME
                       
                       driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805943&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAmpyRBhC-ARIsABs2EAok6BW-NgOLqx-LgjQ_KX2NyxvUFxes8V7Ej8Y_XxMNcwoHEk13S-caApL9EALw_wcB");
                       
                       driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Ritesh");
                       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thakare");//   LASTNAME
                       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("riteshthakare052018@gmail.com");//mailid,mobno.
                       Thread.sleep(3000);
                       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("riteshthakare052018@gmail.com");
                       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MH292321");//password
                       
                     WebElement dropD = driver.findElement(By.xpath("//select[@aria-label='Day']")); //driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("23");//day                               
                           Select dropD1 = new   Select(dropD);
                           Thread.sleep(3000);
                           dropD1.selectByVisibleText("23");
                           
                           WebElement dropM = driver.findElement(By.xpath("//select[@aria-label='Month']"));  //driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("jan");// month                              
                           Select dropM1 = new   Select(dropM);
                           Thread.sleep(3000);
                           dropM1.selectByValue("1");
                           
                           WebElement dropY = driver.findElement(By.xpath("//select[@aria-label='Year']"));   //driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");//year                              
                           Select dropY1 = new Select(dropY);
                           Thread.sleep(3000);
                           dropY1.selectByIndex(6);
                                                                                              
                                                                                              
                        driver.findElement(By.xpath("(//*[@value='2'])[3]")).click(); //driver.findElement(By.xpath("//*[contains(@id,'u_0_5_')]")).click();
//                      driver.findElement(By.xpath("//button[@type='submit']")).click();
//                        driver.findElement(By.xpath("//*[@aria-label='Already have an account?']")).click();
//                        driver.navigate().back();
                  
                     
                  
                     
}

}
