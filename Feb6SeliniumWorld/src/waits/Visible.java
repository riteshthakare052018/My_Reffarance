package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visible {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        
        driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
        WebElement hidden = driver.findElement(By.xpath("//*[@id='hidden']"));
       
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(hidden)).click();
//       
}

}
