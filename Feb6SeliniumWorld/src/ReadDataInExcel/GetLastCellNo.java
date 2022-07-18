package ReadDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetLastCellNo {
	
	
	
	public static void lastcellrowAndColumn() throws IOException {
		
		File src = new File("C:\\Users\\rites\\Desktop\\Book2selinium.xlsx");
		
		FileInputStream read = new FileInputStream(src);
		
		XSSFWorkbook book = new XSSFWorkbook(read);
		
		   XSSFSheet sht = book.getSheetAt(1);
		   
		   DataFormatter df = new DataFormatter();
		    int num = sht.getLastRowNum();
		    
		      
		    System.out.println(sht.getRow(0).getLastCellNum());
		          
		    System.out.println("last row of this sheet :"+num);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		lastcellrowAndColumn();
		
	
	

	}
	
	
//	public static void lastcellrowAndColumn() throws IOException {
//	
//	File src = new File("C:\\Users\\rites\\Desktop\\Book2selinium.xlsx");
//	
////	to load that particular location to read the data
//	
//	
//	FileInputStream fis = new FileInputStream(src);
//	
//	XSSFWorkbook wb = new XSSFWorkbook(fis);
//	
//	 XSSFSheet sh1 = wb.getSheetAt(0);
//	 
////DataFormatter df = new DataFormatter();
//
//int lastrow = sh1.getLastRowNum();
//
//System.out.println("Last row of the sheet is: "+lastrow);
//
//
//}
	}

