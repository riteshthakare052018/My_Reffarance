package HandellingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelled {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	       Thread.sleep(2000);
	       
	      WebElement ID = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	       Thread.sleep(2000);
	     String parentsingleWid = driver.getWindowHandle();
	     System.out.println("parent WINDOW ID:"+parentsingleWid);
	     ID.click();
	     
	     Set<String> PCmultipleWind = driver.getWindowHandles();
	     
	     
	     
	     
	     for(String winid:PCmultipleWind)
			{
				
				if(!(parentsingleWid.equals(winid)))
				{
					driver.switchTo().window(winid);// switching from parent window to child 
					
//					driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();// performing operation on that window
				

                     driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
                     driver.get("https://www.google.co.in/");
                     driver.close();// close only single window
                     System.out.println(winid);
                     
                     driver.quit();// close all the tab
       
	            }

}
}
}
