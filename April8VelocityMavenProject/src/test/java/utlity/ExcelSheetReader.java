package utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelSheetReader {
	
	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\rites\\Documents\\Book1selinium.xlsx");
		
		//to load the perticular location for reading the data
		
		FileInputStream read = new FileInputStream(src);
		
		//now move to the focus on workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(read);
		
		//now move to the focus on sheet
		
	         XSSFSheet sheet = wb.getSheetAt(0);
	         
	       String val = sheet.getRow(1).getCell(0).getStringCellValue();
	       System.out.println(val);
	       
	      String val1 = sheet.getRow(0).getCell(1).getStringCellValue();
	     System.out.println(val1);

}
}
