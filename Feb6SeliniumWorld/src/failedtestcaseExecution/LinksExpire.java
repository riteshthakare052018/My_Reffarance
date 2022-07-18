package failedtestcaseExecution;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExpire {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser



		driver.get("https://demo.guru99.com/test/newtours/");

 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

int numberoflinks = links.size();

for(int i=0; i<numberoflinks; i++)
{
	WebElement element = links.get(i);

	String url = element.getAttribute("href");

	System.out.println(url);


	try {
		URL link = new URL(url);


		HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();

		Thread.sleep(2000);
		httpconn.connect();

		int rescode = httpconn.getResponseCode();

		if(rescode>=400)
		{
			System.out.println(url +"---> broken and response code is "+rescode);
		}
		else
		{
			System.out.println(url + " is not broken link");
		}
	}

	catch(Exception e)
	{
		System.out.println("Exception arrived");
	}
}



	}

	}
