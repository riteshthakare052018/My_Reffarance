package testClasses;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyOnlinePlan;
import pages.GetQuote;
import pages.Homepage;
import pages.ViewPrices;


public class BaseTest {
	 static WebDriver driver;
	BuyOnlinePlan onlineplans;
	ChromeOptions option;
	Homepage hp ;
	GetQuote gq;
	ViewPrices Vp;
	
	
	@BeforeSuite
	public void inthedriver() throws IOException {

//		driver.manage().window().maximize();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notification");
		option.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(option);

			
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"//Configure.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String url = prop.getProperty("testthisurl");
		System.out.println(url);
		driver.get(url);
		

		


		
        
	}	@BeforeClass
	public void creationObject() throws IOException {
		
		onlineplans = new BuyOnlinePlan(driver);
		hp = new Homepage(driver);
	    gq = new GetQuote(driver);
	    Vp = new ViewPrices(driver);
		
		
//		String actualurl = hp.verifyUrl();
//		Assert.assertEquals(actualurl, false);

		
	}
}
