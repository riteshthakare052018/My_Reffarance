package mocksession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seliniumwebbase.WebElement;

public class Flipkart {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		
		//window maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		org.openqa.selenium.WebElement Loginhover= driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		//WebElement	signup=driver.findElement(By.xpath("//*[@class='_3wJI0x']"));
		Actions act=new Actions(driver);
		act.moveToElement((org.openqa.selenium.WebElement) Loginhover).perform();
//	WebElement	signup=(WebElement) driver.findElement(By.xpath("//*[@class='_3wJI0x']"));
//	act.click(signup).perform();
//	WebElement Mobileno	=(WebElement) driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//	act.sendKeys(Mobileno, "9988776655").perform();
//	WebElement	button=(WebElement) driver.findElement(By.xpath("//*[text()='CONTINUE']"));
//	act.click(button).perform();
//		Thread.sleep(4000);
//		act.sendKeys("123421").perform();
//		act.sendKeys(Keys.TAB).sendKeys("sai@123").build().perform();
//		act.sendKeys(Keys.TAB).click();
//	}

}
}
