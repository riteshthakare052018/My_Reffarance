package seliniumwebbase;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapteringScreenShotInProject {
	

	public static void takescrnshot(WebDriver driver,String name) throws IOException, InterruptedException {
		
		      TakesScreenshot tkss = (TakesScreenshot)driver;
		        File source = tkss.getScreenshotAs(OutputType.FILE);
//		  String nme = System.getProperty("user.dir") + "//screenshotPG//" + name + ".png";
		        
		     File destination = new  File( System.getProperty("user.dir") + "//screenshotPG//" + name + ".png");
		     org.openqa.selenium.io.FileHandler.copy(source, destination);
					
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.navigate().refresh();
	
		  driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Ritzcool");
		 takescrnshot(driver,"scr3");
		

	
		
	}

}
