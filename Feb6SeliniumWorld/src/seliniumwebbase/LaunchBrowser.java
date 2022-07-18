package seliniumwebbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		WebDriver intfce = new  ChromeDriver();
		
		intfce.get("https://web.whatsapp.com/");
		
	
	
	}

}
