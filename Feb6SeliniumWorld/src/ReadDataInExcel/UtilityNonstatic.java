package ReadDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityNonstatic {
	
	public static String readdata  (int row, int column) throws IOException 
	{
	   File src = new File("C:\\Users\\rites\\Desktop\\Book2selinium.xlsx")	;
	   FileInputStream read = new FileInputStream(src);
	   XSSFWorkbook book = new XSSFWorkbook(read);
	              XSSFSheet index = book.getSheetAt(1);
	              
	    DataFormatter df = new DataFormatter();
	 String print = df.formatCellValue(index.getRow(row).getCell(column));
	 System.out.println(print);
 	   
	   
	return print;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwrfCRBhAXEiwAnkmKmTfJ5hf3ielF_SUAn0u3WVTdUeTBUBWSCMVyzPqni-qU8e4bpTtWJRoC1LIQAvD_BwE");
		WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
	
		fname.sendKeys(readdata(18, 0));
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(readdata(18, 1));
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(readdata(17, 1));
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(readdata(17, 2));
}

}
