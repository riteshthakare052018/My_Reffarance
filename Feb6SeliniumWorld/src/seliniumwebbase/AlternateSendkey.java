package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateSendkey {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement text = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		           JavascriptExecutor convt = (JavascriptExecutor)driver;
		           driver.navigate().refresh();
		           Thread.sleep(2000);
		           
		           convt.executeScript("arguments[0].value=''alternate to sendkeys';", text);// not solve
		           
		           
	}

}
