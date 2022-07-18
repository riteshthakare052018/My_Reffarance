package writeDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeInToExcelSheet {
	
	public static void writeData() throws IOException {
		

		
		String path = System.getProperty("user.dir")+"\\Write.xlsx";
		
		File src = new File(path);
		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheet("files");
		 
		 File fout = new File(path);
		 
		 FileOutputStream fos = new FileOutputStream(fout);

		 sh1.createRow(0).createCell(0).setCellValue("Name 1");
		 sh1.getRow(0).createCell(1).setCellValue("Ritesh");
		 sh1.getRow(0).createCell(2).setCellValue("Mo.No 9022073319");
		 
		 sh1.createRow(1).createCell(0).setCellValue("Name 2");
		 sh1.getRow(1).createCell(1).setCellValue("Mangesh");
		 sh1.getRow(1).createCell(2).setCellValue("Mo.No 9022073320");
		 
		 
		 
		 wb.write(fos);
  
	}
	public static void main(String[] args) throws IOException {
		 writeData();
		
	}


	}


	


