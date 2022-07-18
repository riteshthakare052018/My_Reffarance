package mocksession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seliniumwebbase.WebElement;

public class Test1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		
		//window maximize
		driver.manage().window().maximize();
		
		
//		driver.get("https://www.amazon.in");
//		org.openqa.selenium.WebElement hoverpoint = driver.findElement(By.xpath("//*[@class='icp-nav-link-inner']"));
//		Actions abc = new Actions (driver);
//		abc.moveToElement(hoverpoint).perform();
//		Thread.sleep(5000);
//		//driver.findElement(By.xpath("(//*[@class='icp-radio icp-radio-active'])[1]")).click();//for English
//		driver.findElement(By.xpath("(//*[@class='icp-radio'])[1]")).click(); //Hindi
		
		
		
		
		
		
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='_2EGQY cqA0P'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9307006458");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("599");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_11kC  _15qf _2qE6']")).click();
		Thread.sleep(4000);
		driver.close();
}

}


