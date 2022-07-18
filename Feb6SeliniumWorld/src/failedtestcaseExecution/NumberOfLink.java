package failedtestcaseExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLink {
	
	public static void main(String[] args) {
		
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\chromedriver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours");
	List<WebElement> textlinks = driver.findElements(By.tagName("a"));
	int sz = textlinks.size();
	System.out.println(sz);
	
	for(int i=1; i<sz; i++) 
	{
		WebElement web = textlinks.get(i);
		String pr = web.getText();
		
		System.out.println(pr);
	}
	
		
	
		
}

}
