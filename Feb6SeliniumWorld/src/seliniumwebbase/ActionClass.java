package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	
	
	
	driver.get("https://www.facebook.com/signup");
	WebElement fstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	     Actions actn = new Actions(driver);
	             actn.sendKeys(fstname,"Rite").perform();
	             Thread.sleep(2000);
	             actn.sendKeys("sh").perform();
	             
	             //by performing tabs
	             
	             actn.sendKeys(Keys.TAB).sendKeys("Thakare").build().perform();
	             actn.sendKeys(Keys.TAB).sendKeys("9922073319").sendKeys(Keys.TAB). sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("23").perform();
	

}
}
