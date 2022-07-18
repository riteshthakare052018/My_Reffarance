package seliniumwebbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownNormalLoopFindElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
	List<WebElement> vlu = driver.findElements(By.xpath("//*[@id='day']//option"));
	                int sz = vlu.size();
	                 for(int i=0; i<sz; i++) 
	                 {
	                String text = vlu.get(i).getText();
	                	 if(text.equals("23"))
	                	 {
	                		 vlu.get(i).click();
	                	 }
	                 }
	                 
	                 
	                 
	
}

}
