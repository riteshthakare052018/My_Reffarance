package seliniumwebbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		RemoteWebDriver rwdC = new ChromeDriver();
		
		rwdC.get("https://mail.google.com/mail/u/0/#inbox");
    	rwdC.manage().window().maximize();
    	
    	rwdC.get("https://www.youtube.com/");
    	Thread.sleep(2000);
    	rwdC.get("https://mail.google.com/mail/u/0/#inbox");
    	
        rwdC.navigate().back();
        rwdC.navigate().forward();
        rwdC.navigate().refresh();
        
    	rwdC.close();
	}

}
