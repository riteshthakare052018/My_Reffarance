package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FwaitForCheckbox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//        driver.findElement(By.xpath("//*[@id='checkbox']")).click();
//        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(11))
//                .pollingEvery(Duration.ofMillis(9));
//        
//        
//        
//        WebElement cheboxdisable = driver.findElement(By.xpath("//*[@id='ch']"));
//        wait.until(ExpectedConditions.elementToBeSelected(cheboxdisable));
//        driver.findElement(By.xpath("//*[@id='checkbox']")).click();
//        
//         driver.findElement(By.xpath("//*[@id='ch']")).click();
        
        
        driver.findElement(By.xpath("//*[@id='checkbox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"),true ));
      
        driver.findElement(By.xpath("//*[@id='ch']")).click();
     
        
	}

}
