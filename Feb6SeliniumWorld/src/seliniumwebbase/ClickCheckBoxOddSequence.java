package seliniumwebbase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBoxOddSequence {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
//        driver.findElement(By.className("panelTrigger")).click();
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
   
//                     int sz = value.size();
                     
                     for(int i=1; i<=50; i++) 
                     {
                     WebElement vlu = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]"));
//                               vlu.click();// even sequence
                    	   
                    	   if(!(i%2==0)) 
                    	   {
                    		   
                 	     vlu.click();// odd sequence
                           }
        
        
                     }
                    	 
       
        
       System.out.println("***************************************************");              
                     
                     

}

}
