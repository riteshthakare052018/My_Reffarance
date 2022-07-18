package seliniumwebbase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfLogo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement text = driver.findElement(By.xpath("//*[@src='/webres_624951798ac591.49909763/themes/default/images/login/logo.png']"));
        Dimension sz = text.getSize();
        System.out.println(sz);
        
      

}}
