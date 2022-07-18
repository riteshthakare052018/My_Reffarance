package ReadDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingNumericValue {
	
	public static void main(String[] args) throws IOException {
		
		File source = new File("C:\\Users\\rites\\Documents\\Book1selinium.xlsx");
		FileInputStream read = new FileInputStream(source);
		
		XSSFWorkbook book = new XSSFWorkbook(read);
	         XSSFSheet sheet1 = book.getSheetAt(1);
          
          DataFormatter df = new DataFormatter();

          String convrtstring = df.formatCellValue(sheet1.getRow(6).getCell(0));
       System.out.println(convrtstring);
                  
        
	}

}
