package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPateFBsignup {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com/signup");
    WebElement insert = driver.findElement(By.xpath("//*[@name='firstname']"));
    Actions acc = new Actions(driver);
            acc.sendKeys(insert,"welcome");
            acc.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            acc.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
            acc.sendKeys(Keys.TAB).build().perform();
            acc.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
}

}
