package writeDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteTextWebelement {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rites\\Downloads\\selinium web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement data = driver.findElement(By.xpath("//*[text()='LOGIN Panel']"));
		String print = data.getText();
		System.out.println(print);
		importDATA(8,1,print);
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin1");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		WebElement text = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
		String print1 = text.getText();
		System.out.println(print1);
		importDATA(8,2,print1);
		
		WebElement text1 = driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
		 String prin = text1.getText();
		 System.out.println(prin);
		importDATA(8,3,prin);
		
		

	}

	public static void importDATA(int row, int column,String value) throws IOException {
		
		String path = System.getProperty("user.dir")+"//WriteDATA.xlsx";
		File src = new File(path);
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheetAt(0);
		
		// write the data
		
		File src1 = new File(path);
		FileOutputStream fsout = new FileOutputStream(src1);
	
		sheet.getRow(row).createCell(column).setCellValue(value);
		book.write(fsout);
		
		
		
		
		
		
		
	}

}
