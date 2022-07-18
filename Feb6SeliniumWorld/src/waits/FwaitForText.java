package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FwaitForText {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//*[@id='populate-text']")).click();
        
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(20))
        .pollingEvery(Duration.ofSeconds(9));
        
        WebElement text = driver.findElement(By.xpath("//*[text()='site']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
        
        driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	}

}
