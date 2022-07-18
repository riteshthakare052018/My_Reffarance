package mocksession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/travel/flights?param=NavBSDJan22&fm=neo%2Fmerchandising&iid=M_08b817fd-4537-485c-b2e6-b5d5ff3ac4b2_1_00A51ENHB1YR_MC.7IBT9QR5QKBW&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Travel_7IBT9QR5QKBW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L0_view-all&cid=7IBT9QR5QKBW");

	        driver.manage().window().maximize();
	        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox/FMfcgzGmvTzgRMrLljkhmZsnzkQgvdGh");
	
	}
	

}
