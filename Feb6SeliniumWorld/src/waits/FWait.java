package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        
        FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(60))
        .pollingEvery(Duration.ofMillis(9));
        
        driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
        WebElement invisible = driver.findElement(By.xpath("//*[@id='hidden']"));
        
        wait.until(ExpectedConditions.visibilityOf(invisible));

        driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
	}

}
