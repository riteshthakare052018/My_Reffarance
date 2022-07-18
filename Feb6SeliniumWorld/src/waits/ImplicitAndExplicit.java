package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ImplicitAndExplicit {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	WebElement searchtextbox = driver.findElement(By.xpath("//*[@name='q']"));
	
	Actions act = new Actions(driver);
	act.sendKeys(searchtextbox,"uk");
	act.sendKeys(Keys.ENTER).perform();
	
//	driver.findElement(By.xpath("//*[text()='United Kingdom - Wikitravel']"));
	driver.findElement(By.xpath("//*[text()='University of Leeds']")).click();
	
//    driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	
	
}

}
