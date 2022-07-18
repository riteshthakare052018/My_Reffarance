package utlity;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void captureScreenShot(WebDriver driver,String name) throws IOException {
		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		File src = scrnsht.getScreenshotAs(OutputType.FILE);
//		File fl = new File("C:\\Users\\rites\\Pictures\\ScreenShotSelinium"+name+".png");
		
		String path = System.getProperty("user.dir")+"\\ScreenShotMaven\\"+name+".png";
		File fl = new File(path);
		org.openqa.selenium.io.FileHandler.copy(src, fl);

		
	}public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rites\\Pictures\\ScreenShotSelinium");
		org.openqa.selenium.io.FileHandler.copy(source,destination);
		
	
	}


	}



