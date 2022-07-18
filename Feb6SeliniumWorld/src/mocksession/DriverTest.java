package mocksession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		String browser = "chrome";
		
		
		if(browser.equals("chrome")) 
		{
			ChromeDriver driver = new ChromeDriver();
		}
		else 
		{
			FirefoxDriver d = new FirefoxDriver();
		}
	}

}
