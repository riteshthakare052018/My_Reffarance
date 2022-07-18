package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class HardCodeData {
	
	@DataProvider(name = "testdata")
	public static String [][]dptest() throws IOException 
	{
		String path = "C:\\Users\\rites\\Desktop\\DDT.xlsx";
		File source = new File(path);

		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		int rows = sh1.getLastRowNum();
		System.out.println("total number of rows"+rows);
		
		short columns = sh1.getRow(0).getLastCellNum();
		System.out.println(columns);
		String data[][] = new String[rows+1][columns];
		
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<columns; j++) 
			{
				data[i][j]=sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data ;
		
	}

}
