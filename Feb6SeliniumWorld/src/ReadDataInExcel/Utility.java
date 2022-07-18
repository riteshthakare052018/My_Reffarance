package ReadDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static String readData(int row, int column) throws IOException  {
		
		File src = new File("C:\\Users\\rites\\Desktop\\Book2selinium.xlsx");
		
		FileInputStream read = new FileInputStream(src);
		XSSFWorkbook book = new XSSFWorkbook(read);
		  XSSFSheet sheet = book.getSheetAt(1);
		  
		  DataFormatter df = new DataFormatter();
		  String print = df.formatCellValue(sheet.getRow(row).getCell(column));		  
		  System.out.println(print);
		  
		  return (print);
			
	}
	


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));//sendKeys("ritesh");
		
//		ExcelReader ER = new ExcelReader();
        username.sendKeys(readData(19, 0));
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(readData(19, 1));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		
		
		
		
	}

}
