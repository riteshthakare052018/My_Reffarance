package ReadDataInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintValueRowColumn {
	
	public static void main(String[] args) throws IOException {
		
		File source = new File("C:\\Users\\rites\\Documents\\Book1selinium.xlsx");
		FileInputStream read = new FileInputStream(source);
		
		XSSFWorkbook book = new XSSFWorkbook(read);
	         XSSFSheet sheet1 = book.getSheetAt(1);
          
          DataFormatter df = new DataFormatter();

          String convrtstring = df.formatCellValue(sheet1.getRow(6).getCell(1));
       System.out.println(convrtstring);
       
       for (int row=0; row<20; row++) 
       {
    	   for(int column=0; column<2; column++) 
    	   {
    		 String itrate = df.formatCellValue(sheet1.getRow(row).getCell(column));
    		 System.out.println(itrate);
    	   }
       }
}

}
