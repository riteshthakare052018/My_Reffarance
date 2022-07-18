package seliniumwebbase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSSInSystem {
    public static void main(String[] args) throws IOException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
		   driver.get("https://www.google.co.in/");
		   driver.navigate().refresh();// must use any time after provide x path of link
		   Thread.sleep(5000); 	//must use any time after provide x path of link
		   
		   
		   
           TakesScreenshot ts = (TakesScreenshot)driver;
           File src = ts.getScreenshotAs(OutputType.FILE);
           File location = new File("C:\\Users\\rites\\Pictures\\ScreenShotSelinium\\google.png");
        
        org.openqa.selenium.io.FileHandler.copy(src, location);

	}

}
